package com.sunstorm.fromtheashes.item;

import com.sunstorm.fromtheashes.FromTheAshes;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(FromTheAshes.MOD_ID);

    public static final DeferredItem<Item> MOONSILVER_INGOT = ITEMS.register("moonsilver_ingot",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> RAW_MOONSILVER = ITEMS.register("raw_moonsilver",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
