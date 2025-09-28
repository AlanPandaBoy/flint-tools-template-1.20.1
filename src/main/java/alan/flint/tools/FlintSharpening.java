package alan.flint.tools;

import alan.flint.tools.item.ModItems;
import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.ActionResult;

public class FlintSharpening {
    public static void register() {
        UseBlockCallback.EVENT.register(((playerEntity, world, hand, blockHitResult) -> {
            if (world.isClient()) {
                return ActionResult.PASS;
            }

            ItemStack itemStack = playerEntity.getStackInHand(hand);

            if (itemStack.isOf(Items.FLINT) && world.getBlockState(blockHitResult.getBlockPos()).isOf(Blocks.STONE)) {
                itemStack.decrement(1);
                playerEntity.giveItemStack(new ItemStack(ModItems.SHARPENED_FLINT));
            }

            return ActionResult.PASS;
        }));
    }
}
