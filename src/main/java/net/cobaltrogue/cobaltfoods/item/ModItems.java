package net.cobaltrogue.cobaltfoods.item;

import net.cobaltrogue.cobaltfoods.CobaltFoods;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.HoneyBottleItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PotionItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CobaltFoods.MOD_ID);

    public static final DeferredItem<Item> TOAST = ITEMS.register("toast",
            () -> new Item(new Item.Properties().food(ModFoodProperties.TOAST)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}

