package com.sunstorm.fromtheashes.item;

import com.sunstorm.fromtheashes.FromTheAshes;
import com.sunstorm.fromtheashes.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FromTheAshes.MOD_ID);

    public static final Supplier<CreativeModeTab> FROM_THE_ASHES_TAB = CREATIVE_MODE_TAB.register( "from_the_ashes_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.MOONSILVER_INGOT.get()))
                    .displayItems((itemDisplayParameters, output) -> {

                        output.accept(ModItems.MOONSILVER_INGOT);
                        output.accept(ModItems.RAW_MOONSILVER);
                        output.accept(ModBlocks.MOONSILVER_BLOCK);
                        output.accept(ModBlocks.RAW_MOONSILVER_BLOCK);
                        output.accept(ModBlocks.MOONSILVER_ORE);
                        output.accept(ModBlocks.CHTHONIC_GOLD_BLOCK);

                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);

    }
}
