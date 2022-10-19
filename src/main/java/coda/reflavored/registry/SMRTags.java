package coda.reflavored.registry;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.biome.Biome;

public class SMRTags {

    public static final TagKey<Biome> HAS_ALPINE_LILY = create("has_alpine_lily");
    public static final TagKey<Biome> HAS_DOUGLAS_IRIS = create("has_douglas_iris");

    private static TagKey<Biome> create(String p_207631_) {
        return TagKey.create(Registry.BIOME_REGISTRY, new ResourceLocation(p_207631_));
    }
}
