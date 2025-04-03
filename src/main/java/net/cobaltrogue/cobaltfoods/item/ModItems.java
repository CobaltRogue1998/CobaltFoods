package net.cobaltrogue.cobaltfoods.item;

import net.cobaltrogue.cobaltfoods.CobaltFoods;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.HoneyBottleItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PotionItem;
import net.minecraft.world.item.SuspiciousStewItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CobaltFoods.MOD_ID);

    public static final DeferredItem<Item> TOAST = ITEMS.register("toast",
            () -> new Item(new Item.Properties().food(ModFoodProperties.TOAST)));
    public static final DeferredItem<Item> HONEY_TOAST = ITEMS.register("honey_toast",
            () -> new Item(new Item.Properties().food(ModFoodProperties.HONEY_TOAST)));
    public static final DeferredItem<Item> DOUGH = ITEMS.register("dough",
            () -> new Item(new Item.Properties().food(ModFoodProperties.DOUGH)));
    public static final DeferredItem<Item> APPLE_DOUGH = ITEMS.register("apple_dough",
            () -> new Item(new Item.Properties().food(ModFoodProperties.APPLE_DOUGH)));
    public static final DeferredItem<Item> PUMPKIN_DOUGH = ITEMS.register("pumpkin_dough",
            () -> new Item(new Item.Properties().food(ModFoodProperties.PUMPKIN_DOUGH)));
    public static final DeferredItem<Item> PUMPKIN_BREAD = ITEMS.register("pumpkin_bread",
            () -> new Item(new Item.Properties().food(ModFoodProperties.PUMPKIN_BREAD)));
    public static final DeferredItem<Item> APPLE_BREAD = ITEMS.register("apple_bread",
            () -> new Item(new Item.Properties().food(ModFoodProperties.APPLE_BREAD)));
    public static final DeferredItem<Item> SNOW_CREAM = ITEMS.register("snow_cream",
            () -> new Item(new Item.Properties().food(ModFoodProperties.SNOW_CREAM)));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}

