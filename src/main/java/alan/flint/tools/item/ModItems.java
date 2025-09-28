package alan.flint.tools.item;

import alan.flint.tools.FlintTools;
import alan.flint.tools.item.custom.TwineMeshItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item GRASSES = registerItem("grasses", new Item(new FabricItemSettings()));
    public static final Item TWINE = registerItem("twine", new Item(new FabricItemSettings()));

    public static final Item SHARPENED_FLINT = registerItem("sharpened_flint", new Item(new FabricItemSettings()));

    public static final Item TWINE_MESH = registerItem("twine_mesh", new TwineMeshItem(new FabricItemSettings().maxDamage(32)));

    public static final Item FLINT_PICKAXE = registerItem("flint_pickaxe",
            new PickaxeItem(ModToolMaterial.FLINT,  1, -2.8f, new FabricItemSettings()));
    public static final Item FLINT_AXE = registerItem("flint_axe",
            new AxeItem(ModToolMaterial.FLINT,  4, -3f, new FabricItemSettings()));
    public static final Item FLINT_SHOVEL = registerItem("flint_shovel",
            new ShovelItem(ModToolMaterial.FLINT,  1.5f, -3f, new FabricItemSettings()));
    public static final Item FLINT_SWORD = registerItem("flint_sword",
            new SwordItem(ModToolMaterial.FLINT,  2, -2.4f, new FabricItemSettings()));
    public static final Item FLINT_HOE = registerItem("flint_hoe",
            new HoeItem(ModToolMaterial.FLINT,  0, -3f, new FabricItemSettings()));

    private static void addItemsToNaturalItemGroup(FabricItemGroupEntries entries) {
        entries.add(GRASSES);
        entries.add(TWINE);
        entries.add(TWINE_MESH);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(FlintTools.MOD_ID, name), item);
    }

    public static void registerModItems() {
        FlintTools.LOGGER.info("Registering EarlyTools Items");

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(ModItems::addItemsToNaturalItemGroup);
    }
}
