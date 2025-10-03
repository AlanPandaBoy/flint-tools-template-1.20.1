package alan.flint.tools.datagen;

import alan.flint.tools.FlintTools;
import alan.flint.tools.block.ModBlocks;
import alan.flint.tools.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.data.client.TexturedModel;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.TWINE, Models.GENERATED);
        itemModelGenerator.register(ModItems.GRASSES, Models.GENERATED);
        itemModelGenerator.register(ModItems.TWINE_MESH, Models.GENERATED);
        itemModelGenerator.register(ModItems.SHARPENED_FLINT, Models.GENERATED);

        itemModelGenerator.register(ModItems.FLINT_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.FLINT_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.FLINT_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.FLINT_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.FLINT_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModBlocks.TWIG.asItem(), Models.HANDHELD);
        itemModelGenerator.register(ModBlocks.STRONG_SHELL.asItem(), Models.HANDHELD);
        itemModelGenerator.register(ModBlocks.WEAK_SHELL.asItem(), Models.HANDHELD);

        itemModelGenerator.register(ModItems.WEAK_SHELL_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.WEAK_SHELL_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.WEAK_SHELL_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.WEAK_SHELL_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.WEAK_SHELL_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.STRONG_SHELL_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STRONG_SHELL_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STRONG_SHELL_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STRONG_SHELL_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.STRONG_SHELL_PICKAXE, Models.HANDHELD);
    }
}
