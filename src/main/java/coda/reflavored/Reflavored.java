package coda.reflavored;

import coda.reflavored.registry.*;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Reflavored.MOD_ID)
public class Reflavored {
    public static final String MOD_ID = "reflavored";
    public final static CreativeModeTab GROUP = new CreativeModeTab(MOD_ID) {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(SMRBlocks.DOUGLAS_IRIS.get());
        }
    };

    public Reflavored() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        SMRItems.ITEMS.register(bus);
        SMRBlocks.BLOCKS.register(bus);
        SMRBiomeModifiers.BIOME_MODIFIERS.register(bus);
        SMRPlacedFeatures.PLACED_FEATURES.register(bus);
        SMRConfiguredFeatures.CONFIGURED_FEATURES.register(bus);
    }

}
