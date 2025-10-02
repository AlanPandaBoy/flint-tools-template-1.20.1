package alan.flint.tools;

import alan.flint.tools.block.ModBlocks;
import alan.flint.tools.item.ModItemGroups;
import alan.flint.tools.item.ModItems;
import alan.flint.tools.utils.ModLootTableModifiers;
import alan.flint.tools.world.ModConfiguredFeatures;
import alan.flint.tools.world.ModPlacedFeatures;
import alan.flint.tools.world.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BiomeTags;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FlintTools implements ModInitializer {
	public static final String MOD_ID = "flint-tools";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
		ModLootTableModifiers.modifyLootTables();
		FlintSharpening.register();
		ModBlocks.registerModBlocks();

		ModWorldGeneration.generateModWorldGen();

		LOGGER.info(MOD_ID + " Initialized");
	}
}