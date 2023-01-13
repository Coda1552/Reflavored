package coda.reflavored.registry;

import coda.reflavored.Reflavored;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.RarityFilter;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class SMRPlacedFeatures {

    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES = DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, Reflavored.MOD_ID);

    public static final RegistryObject<PlacedFeature> PATCH_DOUGLAS_IRIS = PLACED_FEATURES.register("patch_douglas_iris", () -> new PlacedFeature(SMRConfiguredFeatures.DOUGLAS_IRIS.getHolder().get(), List.of(RarityFilter.onAverageOnceEvery(2), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));
    public static final RegistryObject<PlacedFeature> PATCH_ALPINE_LILY = PLACED_FEATURES.register("patch_alpine_lily", () -> new PlacedFeature(SMRConfiguredFeatures.ALPINE_LILY.getHolder().get(), List.of(RarityFilter.onAverageOnceEvery(2), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));
    public static final RegistryObject<PlacedFeature> PATCH_YELLOW_ROSE_BUSH = PLACED_FEATURES.register("patch_yellow_rose_bush", () -> new PlacedFeature(SMRConfiguredFeatures.YELLOW_ROSE_BUSH.getHolder().get(), List.of(RarityFilter.onAverageOnceEvery(2), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));
    public static final RegistryObject<PlacedFeature> PATCH_ORANGE_ROSE_BUSH = PLACED_FEATURES.register("patch_orange_rose_bush", () -> new PlacedFeature(SMRConfiguredFeatures.ORANGE_ROSE_BUSH.getHolder().get(), List.of(RarityFilter.onAverageOnceEvery(2), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));
    public static final RegistryObject<PlacedFeature> PATCH_PINK_ROSE_BUSH = PLACED_FEATURES.register("patch_pink_rose_bush", () -> new PlacedFeature(SMRConfiguredFeatures.PINK_ROSE_BUSH.getHolder().get(), List.of(RarityFilter.onAverageOnceEvery(2), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome())));
}