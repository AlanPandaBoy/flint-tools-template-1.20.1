package alan.flint.tools.item.custom;

import alan.flint.tools.item.ModItems;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class TwineMeshItem extends Item {
    public TwineMeshItem(Settings settings) {
        super(settings);
    }
    public TypedActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        ItemStack itemStack = player.getStackInHand(hand);
        ItemStack itemStack2 = player.getOffHandStack();
        if (itemStack2.getItem() == Items.GRAVEL) {
            itemStack2.decrement(1);
            ItemStack itemStack3 = new ItemStack(Items.FLINT);
            player.giveItemStack(itemStack3);
            player.getStackInHand(hand).damage(1, player,playerEntity1 -> playerEntity1.sendToolBreakStatus(hand));
            return TypedActionResult.success(itemStack);
        }
        return TypedActionResult.pass(itemStack);
    }
}
