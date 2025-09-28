package alan.flint.tools.item.custom;

import alan.flint.tools.item.ModItems;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class TwineMeshItem extends Item {

    public static final List<Item> SAND_LOOT_ITEMS = Arrays.asList(
            ModItems.COPPER_NUGGET,
            Items.FLINT,
            Items.FLINT,
            Items.FLINT,
            Items.PLENTY_POTTERY_SHERD,
            Items.BLADE_POTTERY_SHERD,
            Items.PRIZE_POTTERY_SHERD,
            Items.ARMS_UP_POTTERY_SHERD,
            Items.HOWL_POTTERY_SHERD,
            Items.HEART_POTTERY_SHERD,
            Items.CLAY_BALL
    );


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
        } else if  (itemStack2.getItem() == Items.SAND) {
            ItemStack itemStack4 = new ItemStack(TwineMeshItem::getRandomSandItem);
            itemStack2.decrement(1);
            player.getStackInHand(hand).damage(1, player,playerEntity1 -> playerEntity1.sendToolBreakStatus(hand));
            player.giveItemStack(itemStack4);
            return TypedActionResult.success(itemStack);
        }
        return TypedActionResult.pass(itemStack);
    }
    public static Item getRandomSandItem() {
        Random random = new Random();
        return SAND_LOOT_ITEMS.get(random.nextInt(SAND_LOOT_ITEMS.size()));
    }
}
