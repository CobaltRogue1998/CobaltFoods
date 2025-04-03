package net.cobaltrogue.cobaltfoods.item;

import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    // Toast
    public static final FoodProperties TOAST = new FoodProperties.Builder()
            .nutrition(7)
            .saturationModifier(0.5f)
            .build();
}
