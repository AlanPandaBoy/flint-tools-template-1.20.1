package alan.flint.tools.world;

import alan.flint.tools.block.ModBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;

import java.util.List;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> TWIGS =
            RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier("flint-tools", "twigs"));

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        context.register(TWIGS,
                new ConfiguredFeature<>(
                        Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.TWIG))
                ));
    }
}
