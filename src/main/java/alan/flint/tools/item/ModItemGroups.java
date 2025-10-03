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

                        entries.add(ModBlocks.TWIG);
                        entries.add(ModBlocks.WEAK_SHELL);
                        entries.add(ModBlocks.STRONG_SHELL);

                        entries.add(ModItems.STRONG_SHELL_AXE);
                        entries.add(ModItems.STRONG_SHELL_PICKAXE);
                        entries.add(ModItems.STRONG_SHELL_SHOVEL);
                        entries.add(ModItems.STRONG_SHELL_HOE);
                        entries.add(ModItems.STRONG_SHELL_SWORD);

                        entries.add(ModItems.WEAK_SHELL_AXE);
                        entries.add(ModItems.WEAK_SHELL_PICKAXE);
                        entries.add(ModItems.WEAK_SHELL_SHOVEL);
                        entries.add(ModItems.WEAK_SHELL_HOE);
                        entries.add(ModItems.WEAK_SHELL_SWORD);

                    }).build());
    public static void registerItemGroups() {
        FlintTools.LOGGER.info("Registering EarlyTools Item Groups");
    }
}
// n C9855F
// l D98F66
// d B97A57
