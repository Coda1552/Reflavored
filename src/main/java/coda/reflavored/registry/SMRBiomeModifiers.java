package coda.reflavored.registry;

import coda.reflavored.Reflavored;
import coda.reflavored.common.biome.SMRBiomeModifier;
import com.mojang.serialization.Codec;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class SMRBiomeModifiers {
    public static final DeferredRegister<Codec<? extends BiomeModifier>> BIOME_MODIFIERS = DeferredRegister.create(ForgeRegistries.Keys.BIOME_MODIFIER_SERIALIZERS, Reflavored.MOD_ID);

    public static final RegistryObject<Codec<SMRBiomeModifier>> SMR_BIOME_MODIFIER = BIOME_MODIFIERS.register("smr_biome_modifier", () -> Codec.unit(SMRBiomeModifier.INSTANCE));

}