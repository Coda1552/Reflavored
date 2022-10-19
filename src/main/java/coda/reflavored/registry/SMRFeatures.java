package coda.reflavored.registry;

import coda.reflavored.Reflavored;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import static net.minecraft.data.worldgen.placement.VegetationPlacements.worldSurfaceSquaredWithCount;

public class SMRFeatures {

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> DOUGLAS_IRIS = FeatureUtils.register(Reflavored.MOD_ID + ":douglas_iris", Feature.FLOWER, new RandomPatchConfiguration(10, 7, 3, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(SMRBlocks.DOUGLAS_IRIS.get())))));
    public static final Holder<PlacedFeature> PATCH_DOUGLAS_IRIS = PlacementUtils.register(Reflavored.MOD_ID + ":patch_douglas_iris", DOUGLAS_IRIS, worldSurfaceSquaredWithCount(6));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> ALPINE_LILY = FeatureUtils.register(Reflavored.MOD_ID + ":alpine_lily", Feature.FLOWER, new RandomPatchConfiguration(10, 7, 3, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(SMRBlocks.ALPINE_LILY.get())))));
    public static final Holder<PlacedFeature> PATCH_ALPINE_LILY = PlacementUtils.register(Reflavored.MOD_ID + ":patch_alpine_lily", ALPINE_LILY, worldSurfaceSquaredWithCount(6));

}
