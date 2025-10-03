package alan.flint.tools.datagen;

import alan.flint.tools.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Blocks;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.MatchToolLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.predicate.item.ItemPredicate;
import net.minecraft.registry.tag.ItemTags;

public class ModLootTableProvider extends FabricBlockLootTableProvider {

    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(Blocks.OAK_LOG, LootTable.builder()
                .pool(LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(Blocks.OAK_LOG)
                                .conditionally(MatchToolLootCondition.builder(
                                        ItemPredicate.Builder.create().tag(ItemTags.AXES))))));
        addDrop(Blocks.SPRUCE_LOG, LootTable.builder()
                .pool(LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(Blocks.SPRUCE_LOG)
                                .conditionally(MatchToolLootCondition.builder(
                                        ItemPredicate.Builder.create().tag(ItemTags.AXES))))));
        addDrop(Blocks.BIRCH_LOG, LootTable.builder()
                .pool(LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(Blocks.BIRCH_LOG)
                                .conditionally(MatchToolLootCondition.builder(
                                        ItemPredicate.Builder.create().tag(ItemTags.AXES))))));
        addDrop(Blocks.JUNGLE_LOG, LootTable.builder()
                .pool(LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(Blocks.JUNGLE_LOG)
                                .conditionally(MatchToolLootCondition.builder(
                                        ItemPredicate.Builder.create().tag(ItemTags.AXES))))));
        addDrop(Blocks.ACACIA_LOG, LootTable.builder()
                .pool(LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(Blocks.ACACIA_LOG)
                                .conditionally(MatchToolLootCondition.builder(
                                        ItemPredicate.Builder.create().tag(ItemTags.AXES))))));
        addDrop(Blocks.DARK_OAK_LOG, LootTable.builder()
                .pool(LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(Blocks.DARK_OAK_LOG)
                                .conditionally(MatchToolLootCondition.builder(
                                        ItemPredicate.Builder.create().tag(ItemTags.AXES))))));
        addDrop(Blocks.MANGROVE_LOG, LootTable.builder()
                .pool(LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(Blocks.MANGROVE_LOG)
                                .conditionally(MatchToolLootCondition.builder(
                                        ItemPredicate.Builder.create().tag(ItemTags.AXES))))));
        addDrop(Blocks.CHERRY_LOG, LootTable.builder()
                .pool(LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(Blocks.CHERRY_LOG)
                                .conditionally(MatchToolLootCondition.builder(
                                        ItemPredicate.Builder.create().tag(ItemTags.AXES))))));
        addDrop(Blocks.GRAVEL, LootTable.builder()
                .pool(LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(Blocks.GRAVEL)
                                .conditionally(MatchToolLootCondition.builder(
                                        ItemPredicate.Builder.create())))));
        addDrop(ModBlocks.TWIG, LootTable.builder()
                .pool(LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(ModBlocks.TWIG)
                                .conditionally(MatchToolLootCondition.builder(
                                        ItemPredicate.Builder.create())))));
        addDrop(ModBlocks.STRONG_SHELL, LootTable.builder()
                .pool(LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(ModBlocks.STRONG_SHELL)
                                .conditionally(MatchToolLootCondition.builder(
                                        ItemPredicate.Builder.create())))));
        addDrop(ModBlocks.WEAK_SHELL, LootTable.builder()
                .pool(LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(ModBlocks.WEAK_SHELL)
                                .conditionally(MatchToolLootCondition.builder(
                                        ItemPredicate.Builder.create())))));

    }
}
