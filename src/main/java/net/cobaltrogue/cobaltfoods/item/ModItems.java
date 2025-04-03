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
    public static final DeferredItem<Item> RAW_BACON = ITEMS.register("raw_bacon",
            () -> new Item(new Item.Properties().food(ModFoodProperties.RAW_BACON)));
    public static final DeferredItem<Item> CRISPY_BACON = ITEMS.register("crispy_bacon",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CRISPY_BACON)));
    public static final DeferredItem<Item> ROTTEN_APPLE = ITEMS.register("rotten_apple",
            () -> new Item(new Item.Properties().food(ModFoodProperties.ROTTEN_APPLE)));
    public static final DeferredItem<Item> IRON_APPLE = ITEMS.register("iron_apple",
            () -> new Item(new Item.Properties().food(ModFoodProperties.IRON_APPLE)));
    public static final DeferredItem<Item> OBSIDIAN_APPLE = ITEMS.register("obsidian_apple",
            () -> new Item(new Item.Properties().food(ModFoodProperties.OBSIDIAN_APPLE)));
    public static final DeferredItem<Item> MASHED_POTATOES = ITEMS.register("mashed_potatoes",
            () -> new Item(new Item.Properties().food(ModFoodProperties.MASHED_POTATOES)));
    public static final DeferredItem<Item> LOADED_MASHED_POTATOES = ITEMS.register("loaded_mashed_potatoes",
            () -> new Item(new Item.Properties().food(ModFoodProperties.LOADED_MASHED_POTATOES)));
    public static final DeferredItem<Item> CHEESE = ITEMS.register("cheese",
            () -> new Item(new Item.Properties().food(ModFoodProperties.CHEESE)));
    public static final DeferredItem<Item> GRILLED_CHEESE = ITEMS.register("grilled_cheese",
            () -> new Item(new Item.Properties().food(ModFoodProperties.GRILLED_CHEESE)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}

