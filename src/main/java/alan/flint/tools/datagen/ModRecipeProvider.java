package alan.flint.tools.datagen;

import alan.flint.tools.block.ModBlocks;
import alan.flint.tools.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModItems.TWINE)
                .input(ModItems.GRASSES, 3).criterion(FabricRecipeProvider.hasItem(ModItems.TWINE),
                FabricRecipeProvider.conditionsFromItem(ModItems.TWINE)).criterion(FabricRecipeProvider.hasItem(ModItems.GRASSES),
                FabricRecipeProvider.conditionsFromItem(ModItems.GRASSES)).offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TWINE_MESH, 1)
                .pattern("TS")
                .pattern("ST")
                .input('S', Items.STICK)
                .input('T', ModItems.TWINE)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModItems.TWINE), conditionsFromItem(ModItems.TWINE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.TWINE_MESH)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.FLINT_PICKAXE, 1)
                .pattern("RT")
                .pattern("SR")
                .input('S', Items.STICK)
                .input('R', ModItems.SHARPENED_FLINT)
                .input('T', ModItems.TWINE)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModItems.SHARPENED_FLINT), conditionsFromItem(ModItems.SHARPENED_FLINT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.FLINT_PICKAXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.FLINT_AXE, 1)
                .pattern("RT")
                .pattern(" S")
                .input('S', Items.STICK)
                .input('R', ModItems.SHARPENED_FLINT)
                .input('T', ModItems.TWINE)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModItems.SHARPENED_FLINT), conditionsFromItem(ModItems.SHARPENED_FLINT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.FLINT_AXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.FLINT_SHOVEL, 1)
                .pattern("RT")
                .pattern("S ")
                .input('S', Items.STICK)
                .input('R', ModItems.SHARPENED_FLINT)
                .input('T', ModItems.TWINE)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModItems.SHARPENED_FLINT), conditionsFromItem(ModItems.SHARPENED_FLINT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.FLINT_SHOVEL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.FLINT_SWORD, 1)
                .pattern(" R")
                .pattern("TR")
                .pattern(" S")
                .input('S', Items.STICK)
                .input('R', ModItems.SHARPENED_FLINT)
                .input('T', ModItems.TWINE)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModItems.SHARPENED_FLINT), conditionsFromItem(ModItems.SHARPENED_FLINT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.FLINT_SWORD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.FLINT_HOE, 1)
                .pattern("RR")
                .pattern("TS")
                .pattern(" S")
                .input('T', ModItems.TWINE)
                .input('R', ModItems.SHARPENED_FLINT)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModItems.SHARPENED_FLINT), conditionsFromItem(ModItems.SHARPENED_FLINT))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.FLINT_HOE)));
        //public static void offerShapelessRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible input, @Nullable String group, int outputCount)
        offerShapelessRecipe(exporter, Items.STICK, ModBlocks.TWIG, "stick_from_twig", 2);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STRONG_SHELL_PICKAXE, 1)
                .pattern("RRR")
                .pattern("TS ")
                .pattern(" S ")
                .input('S', Items.STICK)
                .input('R', ModBlocks.STRONG_SHELL.asItem())
                .input('T', ModItems.TWINE)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModBlocks.STRONG_SHELL.asItem()), conditionsFromItem(ModBlocks.STRONG_SHELL.asItem()))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STRONG_SHELL_PICKAXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STRONG_SHELL_AXE, 1)
                .pattern("RT")
                .pattern(" S")
                .input('S', Items.STICK)
                .input('R', ModBlocks.STRONG_SHELL.asItem())
                .input('T', ModItems.TWINE)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModBlocks.STRONG_SHELL.asItem()), conditionsFromItem(ModBlocks.STRONG_SHELL.asItem()))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STRONG_SHELL_AXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STRONG_SHELL_SHOVEL, 1)
                .pattern("TR")
                .pattern(" S")
                .pattern(" S")
                .input('S', Items.STICK)
                .input('R', ModBlocks.STRONG_SHELL.asItem())
                .input('T', ModItems.TWINE)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModBlocks.STRONG_SHELL.asItem()), conditionsFromItem(ModBlocks.STRONG_SHELL.asItem()))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STRONG_SHELL_SHOVEL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STRONG_SHELL_SWORD, 1)
                .pattern(" R")
                .pattern("TR")
                .pattern(" S")
                .input('S', Items.STICK)
                .input('R', ModBlocks.STRONG_SHELL.asItem())
                .input('T', ModItems.TWINE)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModBlocks.STRONG_SHELL.asItem()), conditionsFromItem(ModBlocks.STRONG_SHELL.asItem()))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STRONG_SHELL_SWORD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STRONG_SHELL_HOE, 1)
                .pattern("RR")
                .pattern("TS")
                .pattern(" S")
                .input('T', ModItems.TWINE)
                .input('R', ModBlocks.STRONG_SHELL.asItem())
                .input('S', Items.STICK)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModBlocks.STRONG_SHELL.asItem()), conditionsFromItem(ModBlocks.STRONG_SHELL.asItem()))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.STRONG_SHELL_HOE)));




        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.WEAK_SHELL_PICKAXE, 1)
                .pattern("RT")
                .pattern("SR")
                .input('S', Items.STICK)
                .input('R', ModBlocks.WEAK_SHELL.asItem())
                .input('T', ModItems.TWINE)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModBlocks.WEAK_SHELL.asItem()), conditionsFromItem(ModBlocks.WEAK_SHELL.asItem()))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.WEAK_SHELL_PICKAXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.WEAK_SHELL_AXE, 1)
                .pattern("RT")
                .pattern(" S")
                .input('S', Items.STICK)
                .input('R', ModBlocks.WEAK_SHELL.asItem())
                .input('T', ModItems.TWINE)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModBlocks.WEAK_SHELL.asItem()), conditionsFromItem(ModBlocks.WEAK_SHELL.asItem()))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.WEAK_SHELL_AXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.WEAK_SHELL_SHOVEL, 1)
                .pattern("RT")
                .pattern("S ")
                .input('S', Items.STICK)
                .input('R', ModBlocks.WEAK_SHELL.asItem())
                .input('T', ModItems.TWINE)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModBlocks.WEAK_SHELL.asItem()), conditionsFromItem(ModBlocks.WEAK_SHELL.asItem()))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.WEAK_SHELL_SHOVEL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.WEAK_SHELL_SWORD, 1)
                .pattern(" R")
                .pattern("TR")
                .pattern(" S")
                .input('S', Items.STICK)
                .input('R', ModBlocks.WEAK_SHELL.asItem())
                .input('T', ModItems.TWINE)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModBlocks.WEAK_SHELL.asItem()), conditionsFromItem(ModBlocks.WEAK_SHELL.asItem()))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.WEAK_SHELL_SWORD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.WEAK_SHELL_HOE, 1)
                .pattern("RR")
                .pattern("TS")
                .pattern(" S")
                .input('T', ModItems.TWINE)
                .input('R', ModBlocks.WEAK_SHELL.asItem())
                .input('S', Items.STICK)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .criterion(hasItem(ModBlocks.WEAK_SHELL.asItem()), conditionsFromItem(ModBlocks.WEAK_SHELL.asItem()))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.WEAK_SHELL_HOE)));
    }
}