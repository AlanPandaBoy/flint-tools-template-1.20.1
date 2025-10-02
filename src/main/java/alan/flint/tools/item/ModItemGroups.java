package alan.flint.tools.item;

import alan.flint.tools.FlintTools;
import alan.flint.tools.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup FLINT_TOOLS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(FlintTools.MOD_ID, "flint_tools"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.flint_tools"))
                    .icon(() -> new ItemStack(ModItems.FLINT_PICKAXE)).entries((displayContext, entries) -> {
                        entries.add(ModItems.GRASSES);
                        entries.add(ModItems.TWINE);
                        entries.add(ModItems.TWINE_MESH);

                        entries.add(ModItems.SHARPENED_FLINT);

                        entries.add(ModItems.FLINT_SWORD);
                        entries.add(ModItems.FLINT_AXE);
                        entries.add(ModItems.FLINT_PICKAXE);
                        entries.add(ModItems.FLINT_SHOVEL);
                        entries.add(ModItems.FLINT_HOE);

                        entries.add(ModItems.COPPER_NUGGET);
                        entries.add(ModItems.RAW_COPPER_NUGGET);

                        entries.add(ModBlocks.TWIG);

                    }).build());
    public static void registerItemGroups() {
        FlintTools.LOGGER.info("Registering EarlyTools Item Groups");
    }
}
// n FF7F27
// l FF940A
// d DE6E22
