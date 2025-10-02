package alan.flint.tools.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import org.jetbrains.annotations.Nullable;

public class TwigBlock extends Block {

    // Define the shape (X1,Y1,Z1 -> X2,Y2,Z2)
    private static final VoxelShape SHAPE = Block.createCuboidShape(
            0.0, 0.0, 0.0,    // minX, minY, minZ
            16.0, 4.0, 16.0   // maxX, maxY, maxZ (height 4/16 = 0.25 blocks)
    );

    public TwigBlock(Settings settings) {
        super(settings.noCollision().nonOpaque());
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL; // render using your model
    }
    @Override
    public void neighborUpdate(BlockState state, World world, BlockPos pos, Block block, BlockPos fromPos, boolean notify) {
        super.neighborUpdate(state, world, pos, block, fromPos, notify);
        BlockPos below = pos.down();
        BlockState stateBelow = world.getBlockState(below);
        if (!stateBelow.isSolidBlock(world, below)) {
            world.breakBlock(pos, true);
        }
    }
    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        BlockPos below = pos.down();
        BlockState stateBelow = world.getBlockState(below);
        return stateBelow.isSolidBlock(world, below);
    }
}
