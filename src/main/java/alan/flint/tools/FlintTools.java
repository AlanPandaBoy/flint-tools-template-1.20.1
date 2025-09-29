package alan.flint.tools;

import alan.flint.tools.block.ModBlocks;
import alan.flint.tools.item.ModItemGroups;
import alan.flint.tools.item.ModItems;
import alan.flint.tools.utils.ModLootTableModifiers;
import net.fabricmc.api.ModInitializer;

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
		LOGGER.info(MOD_ID + " Initialized");
	}
}