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
            new PickaxeItem(ModToolMaterial.FLINT,  2, -2.8f, new FabricItemSettings()));
    public static final Item FLINT_AXE = registerItem("flint_axe",
            new AxeItem(ModToolMaterial.FLINT,  4, -3f, new FabricItemSettings()));
    public static final Item FLINT_SHOVEL = registerItem("flint_shovel",
            new ShovelItem(ModToolMaterial.FLINT,  1.5f, -3f, new FabricItemSettings()));
    public static final Item FLINT_SWORD = registerItem("flint_sword",
            new SwordItem(ModToolMaterial.FLINT,  3, -2.4f, new FabricItemSettings()));
    public static final Item FLINT_HOE = registerItem("flint_hoe",
            new HoeItem(ModToolMaterial.FLINT,  1, -3f, new FabricItemSettings()));

    public static final Item WEAK_SHELL_PICKAXE = registerItem("weak_shell_pickaxe",
            new PickaxeItem(ModToolMaterial.WEAK_SHELL,  2, -2.8f, new FabricItemSettings()));
    public static final Item WEAK_SHELL_AXE = registerItem("weak_shell_axe",
            new AxeItem(ModToolMaterial.WEAK_SHELL,  4.5f, -3f, new FabricItemSettings()));
    public static final Item WEAK_SHELL_SHOVEL = registerItem("weak_shell_shovel",
            new ShovelItem(ModToolMaterial.WEAK_SHELL,  1.5f, -3f, new FabricItemSettings()));
    public static final Item WEAK_SHELL_SWORD = registerItem("weak_shell_sword",
            new SwordItem(ModToolMaterial.WEAK_SHELL,  4, -2.4f, new FabricItemSettings()));
    public static final Item WEAK_SHELL_HOE = registerItem("weak_shell_hoe",
            new HoeItem(ModToolMaterial.WEAK_SHELL,  1, -3f, new FabricItemSettings()));

    public static final Item STRONG_SHELL_PICKAXE = registerItem("strong_shell_pickaxe",
            new PickaxeItem(ModToolMaterial.WEAK_SHELL,  2, -2.8f, new FabricItemSettings()));
    public static final Item STRONG_SHELL_AXE = registerItem("strong_shell_axe",
            new AxeItem(ModToolMaterial.WEAK_SHELL,  6.5f, -3f, new FabricItemSettings()));
    public static final Item STRONG_SHELL_SHOVEL = registerItem("strong_shell_shovel",
            new ShovelItem(ModToolMaterial.WEAK_SHELL,  1.5f, -3f, new FabricItemSettings()));
    public static final Item STRONG_SHELL_SWORD = registerItem("strong_shell_sword",
            new SwordItem(ModToolMaterial.WEAK_SHELL,  5, -2.4f, new FabricItemSettings()));
    public static final Item STRONG_SHELL_HOE = registerItem("strong_shell_hoe",
            new HoeItem(ModToolMaterial.WEAK_SHELL,  1, -3f, new FabricItemSettings()));

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
