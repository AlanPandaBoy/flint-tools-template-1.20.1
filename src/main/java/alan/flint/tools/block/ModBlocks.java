package alan.flint.tools.block;

import alan.flint.tools.FlintTools;
import alan.flint.tools.block.custom.ShellBlock;
import alan.flint.tools.block.custom.TwigBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block TWIG = registerBlock("twig",
            new TwigBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).noCollision().nonOpaque().strength(0.2f)));
    public static final Block WEAK_SHELL = registerBlock("weak_shell",
            new ShellBlock(FabricBlockSettings.create().noCollision().nonOpaque().strength(0f).sounds(BlockSoundGroup.STONE)));
    public static final Block STRONG_SHELL = registerBlock("strong_shell",
            new ShellBlock(FabricBlockSettings.create().noCollision().nonOpaque().strength(0.1f).sounds(BlockSoundGroup.STONE)));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(FlintTools.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(FlintTools.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerModBlocks() {
        FlintTools.LOGGER.info("Registering EarlyTools ModBlocks");
    }

}
