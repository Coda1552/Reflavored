package coda.reflavored.registry;

import coda.reflavored.Reflavored;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class SMRConfiguredFeatures {
    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES =
            DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, Reflavored.MOD_ID);

    public static final RegistryObject<ConfiguredFeature<?, ?>> DOUGLAS_IRIS = CONFIGURED_FEATURES.register("douglas_iris", () -> new ConfiguredFeature<>(Feature.FLOWER, new RandomPatchConfiguration(24, 7, 3, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(SMRBlocks.DOUGLAS_IRIS.get()))))));
    public static final RegistryObject<ConfiguredFeature<?, ?>> ALPINE_LILY = CONFIGURED_FEATURES.register("alpine_lily", () -> new ConfiguredFeature<>(Feature.FLOWER, new RandomPatchConfiguration(24, 7, 3, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(SMRBlocks.ALPINE_LILY.get()))))));
    public static final RegistryObject<ConfiguredFeature<?, ?>> YELLOW_ROSE_BUSH = CONFIGURED_FEATURES.register("yellow_rose_bush", () -> new ConfiguredFeature<>(Feature.FLOWER, new RandomPatchConfiguration(24, 7, 3, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(SMRBlocks.YELLOW_ROSE_BUSH.get()))))));
    public static final RegistryObject<ConfiguredFeature<?, ?>> ORANGE_ROSE_BUSH = CONFIGURED_FEATURES.register("orange_rose_bush", () -> new ConfiguredFeature<>(Feature.FLOWER, new RandomPatchConfiguration(24, 7, 3, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(SMRBlocks.ORANGE_ROSE_BUSH.get()))))));
    public static final RegistryObject<ConfiguredFeature<?, ?>> PINK_ROSE_BUSH = CONFIGURED_FEATURES.register("pink_rose_bush", () -> new ConfiguredFeature<>(Feature.FLOWER, new RandomPatchConfiguration(24, 7, 3, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(SMRBlocks.PINK_ROSE_BUSH.get()))))));
    public static final RegistryObject<ConfiguredFeature<?, ?>> BUTTERCUP = CONFIGURED_FEATURES.register("buttercup", () -> new ConfiguredFeature<>(Feature.FLOWER, new RandomPatchConfiguration(24, 7, 3, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK, new SimpleBlockConfiguration(BlockStateProvider.simple(SMRBlocks.BUTTERCUP.get()))))));

}
