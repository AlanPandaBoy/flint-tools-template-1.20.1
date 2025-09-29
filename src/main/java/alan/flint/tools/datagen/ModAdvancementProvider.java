package alan.flint.tools.datagen;

import alan.flint.tools.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.minecraft.advancement.Advancement;
import net.minecraft.advancement.AdvancementFrame;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.advancement.criterion.RecipeUnlockedCriterion;
import net.minecraft.advancement.criterion.TickCriterion;
import net.minecraft.data.server.advancement.AdvancementProvider;
import net.minecraft.item.Items;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class ModAdvancementProvider extends FabricAdvancementProvider {

    public ModAdvancementProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateAdvancement(Consumer<Advancement> exporter) {
        Advancement flintToolsAdvancement = Advancement.Builder.create()
                .display(
                        ModItems.FLINT_PICKAXE, // The display icon
                        Text.literal("Flint Tools Mod"), // The title
                        Text.literal("A Mod"), // The description
                        new Identifier("textures/gui/advancements/backgrounds/stone.png"), // Background image used
                        AdvancementFrame.TASK, // Options: TASK, CHALLENGE, GOAL
                        false, // Show toast top right
                        false, // Announce to chat
                        false // Hidden in the advancement tab
                )
                // The first string used in criterion is the name referenced by other advancements when they want to have 'requirements'
                .criterion("got_grass_drops", InventoryChangedCriterion.Conditions.items(ModItems.GRASSES, Items.WHEAT_SEEDS))
                .build(exporter, "flint-tools" + "/root");

        Advancement twineAdvancement = Advancement.Builder.create().parent(flintToolsAdvancement)
                .display(
                        ModItems.TWINE, // The display icon
                        Text.literal("Tying Loose Ends"), // The title
                        Text.literal("Getting a Twine"), // The description
                        new Identifier("textures/gui/advancements/backgrounds/stone.png"), // Background image used
                        AdvancementFrame.TASK, // Options: TASK, CHALLENGE, GOAL
                        true, // Show toast top right
                        true, // Announce to chat
                        false // Hidden in the advancement tab
                )
                // The first string used in criterion is the name referenced by other advancements when they want to have 'requirements'
                .criterion("got_twine", InventoryChangedCriterion.Conditions.items(ModItems.TWINE))
                .build(exporter, "flint-tools" + "/got_twine");

        Advancement twineMeshAdvancement = Advancement.Builder.create().parent(twineAdvancement)
                .display(
                        ModItems.TWINE_MESH, // The display icon
                        Text.literal("Getting It Together"), // The title
                        Text.literal("Getting a Twine Mesh"), // The description
                        new Identifier("textures/gui/advancements/backgrounds/stone.png"), // Background image used
                        AdvancementFrame.TASK, // Options: TASK, CHALLENGE, GOAL
                        true, // Show toast top right
                        true, // Announce to chat
                        false // Hidden in the advancement tab
                )
                // The first string used in criterion is the name referenced by other advancements when they want to have 'requirements'
                .criterion("got_twine_mesh", InventoryChangedCriterion.Conditions.items(ModItems.TWINE_MESH))
                .build(exporter, "flint-tools" + "/got_twine_mesh");

        Advancement flintSharpeningAdvancment = Advancement.Builder.create().parent(twineMeshAdvancement)
                .display(
                        ModItems.SHARPENED_FLINT, // The display icon
                        Text.literal("Sharpen Up"), // The title
                        Text.literal("Sharpen A Flint"), // The description
                        new Identifier("textures/gui/advancements/backgrounds/stone.png"), // Background image used
                        AdvancementFrame.TASK, // Options: TASK, CHALLENGE, GOAL
                        true, // Show toast top right
                        true, // Announce to chat
                        false // Hidden in the advancement tab
                )
                // The first string used in criterion is the name referenced by other advancements when they want to have 'requirements'
                .criterion("got_sharpened_flint", InventoryChangedCriterion.Conditions.items(ModItems.SHARPENED_FLINT))
                .build(exporter, "flint-tools" + "/got_sharpened_flint");
        Advancement copperNuggetAdvancement = Advancement.Builder.create().parent(twineMeshAdvancement)
                .display(
                        ModItems.RAW_COPPER_NUGGET, // The display icon
                        Text.literal("A Bit Of Copper"), // The title
                        Text.literal("Sift For Some Copper"), // The description
                        new Identifier("textures/gui/advancements/backgrounds/stone.png"), // Background image used
                        AdvancementFrame.TASK, // Options: TASK, CHALLENGE, GOAL
                        true, // Show toast top right
                        true, // Announce to chat
                        false // Hidden in the advancement tab
                )
                // The first string used in criterion is the name referenced by other advancements when they want to have 'requirements'
                .criterion("got_raw_copper_nugget", InventoryChangedCriterion.Conditions.items(ModItems.RAW_COPPER_NUGGET))
                .build(exporter, "flint-tools" + "/got_raw_copper_nugget");
    }
}
