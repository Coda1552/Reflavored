package coda.reflavored.common.biome;

import coda.reflavored.registry.SMRBiomeModifiers;
import coda.reflavored.registry.SMRFeatures;
import coda.reflavored.registry.SMRTags;
import com.mojang.serialization.Codec;
import net.minecraft.core.Holder;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ModifiableBiomeInfo;

public class SMRBiomeModifier implements BiomeModifier {
    public static final SMRBiomeModifier INSTANCE = new SMRBiomeModifier();

    @Override
    public void modify(Holder<Biome> biome, Phase phase, ModifiableBiomeInfo.BiomeInfo.Builder builder) {
        if (phase == Phase.ADD) {
            if (biome.is(SMRTags.HAS_ALPINE_LILY)) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, SMRFeatures.PATCH_ALPINE_LILY);
            }
            if (biome.is(SMRTags.HAS_DOUGLAS_IRIS)) {
                builder.getGenerationSettings().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, SMRFeatures.PATCH_DOUGLAS_IRIS);
            }
        }
    }

    @Override
    public Codec<? extends BiomeModifier> codec() {
        return SMRBiomeModifiers.SMR_BIOME_MODIFIER.get();
    }
}