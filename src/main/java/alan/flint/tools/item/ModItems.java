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
    public static final Item COPPER_NUGGET = registerItem("copper_nugget", new Item(new FabricItemSettings()));
    public static final Item RAW_COPPER_NUGGET = registerItem("raw_copper_nugget", new Item(new FabricItemSettings()));

    public static final Item TWINE_MESH = registerItem("twine_mesh", new TwineMeshItem(new FabricItemSettings().maxDamage(32)));

    public static final Item FLINT_PICKAXE = registerItem("flint_pickaxe",
            new PickaxeItem(ModToolMaterial.FLINT,  2, -2.8f, new FabricItemSettings()));
    public static final Item FLINT_AXE = registerItem("flint_axe",
            new AxeItem(ModToolMaterial.FLINT,  4, -3f, new FabricItemSettings()));
    public static final Item FLINT_SHOVEL = registerItem("flint_shovel",
            new ShovelItem(ModToolMaterial.FLINT,  1.5f, -3f, new FabricItemSettings()));
    public static final Item FLINT_SWORD = registerItem("flint_sword",
            new SwordItem(ModToolMaterial.FLINT,  3, -2.4f, new FabricItemSettings()));
    public static final Item FLINT_HOE = registerItem("flint_hoe",
            new HoeItem(ModToolMaterial.FLINT,  1, -3f, new FabricItemSettings()));

    public static final Item COPPER_PICKAXE = registerItem("copper_pickaxe",
            new PickaxeItem(ModToolMaterial.COPPER,  2, -2.3f, new FabricItemSettings()));
    public static final Item COPPER_AXE = registerItem("copper_axe",
            new AxeItem(ModToolMaterial.COPPER,  5, -2.5f, new FabricItemSettings()));
    public static final Item COPPER_SHOVEL = registerItem("copper_shovel",
            new ShovelItem(ModToolMaterial.COPPER,  2f, -3f, new FabricItemSettings()));
    public static final Item COPPER_SWORD = registerItem("copper_sword",
            new SwordItem(ModToolMaterial.COPPER,  4, -1.8f, new FabricItemSettings()));
    public static final Item COPPER_HOE = registerItem("copper_hoe",
            new HoeItem(ModToolMaterial.COPPER,  2, -2.7f, new FabricItemSettings()));

    public static final Item COPPER_HELMET = registerItem("copper_helmet",
            new ArmorItem(ModArmorMaterials.COPPER,  ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item COPPER_CHESTPLATE = registerItem("copper_chestplate",
            new ArmorItem(ModArmorMaterials.COPPER,  ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item COPPER_LEGGINGS = registerItem("copper_leggings",
            new ArmorItem(ModArmorMaterials.COPPER,  ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item COPPER_BOOTS = registerItem("copper_boots",
            new ArmorItem(ModArmorMaterials.COPPER,  ArmorItem.Type.BOOTS, new FabricItemSettings()));

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
