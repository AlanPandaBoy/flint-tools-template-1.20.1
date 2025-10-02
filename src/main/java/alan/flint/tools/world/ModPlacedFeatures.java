package alan.flint.tools.world;

import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;

public class ModPlacedFeatures {
    public static final RegistryKey<PlacedFeature> TWIGS =
            RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier("flint-tools", "twigs"));

    public static void bootstrap(Registerable<PlacedFeature> context) {
        context.register(TWIGS,
                new PlacedFeature(
                        context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE)
                                .getOrThrow(ModConfiguredFeatures.TWIGS),
                        List.of(
                                CountPlacementModifier.of(20),
                                SquarePlacementModifier.of(),
                                PlacedFeatures.WORLD_SURFACE_WG_HEIGHTMAP,
                                BiomePlacementModifier.of()
                        )));
    }
}
