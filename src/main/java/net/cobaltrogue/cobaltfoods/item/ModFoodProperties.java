package net.cobaltrogue.cobaltfoods.item;

import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Items;

public class ModFoodProperties {
    // Toast & Bread
    public static final FoodProperties TOAST = new FoodProperties.Builder()
            .nutrition(7)
            .saturationModifier(0.5f)
            .build();
    public static final FoodProperties PUMPKIN_BREAD = new FoodProperties.Builder()
            .nutrition(7)
            .saturationModifier(0.5f)
            .build();
    public static final FoodProperties APPLE_BREAD = new FoodProperties.Builder()
            .nutrition(7)
            .saturationModifier(0.5f)
            .build();
    public static final FoodProperties HONEY_TOAST = new FoodProperties.Builder()
            .nutrition(7)
            .saturationModifier(0.80f)
            .build();
    // Dough
    public static final FoodProperties DOUGH = new FoodProperties.Builder()
            .nutrition(1)
            .saturationModifier(0.1f)
            .effect(() -> new MobEffectInstance(MobEffects.HUNGER, 400), 100f).build();
    public static final FoodProperties APPLE_DOUGH = new FoodProperties.Builder()
            .nutrition(1)
            .saturationModifier(0.1f)
            .effect(() -> new MobEffectInstance(MobEffects.HUNGER, 400), 100f).build();
    public static final FoodProperties PUMPKIN_DOUGH = new FoodProperties.Builder()
            .nutrition(1)
            .saturationModifier(0.1f)
            .effect(() -> new MobEffectInstance(MobEffects.HUNGER, 400), 100f).build();
    // Apples
    public static final FoodProperties ROTTEN_APPLE = new FoodProperties.Builder()
            .nutrition(1)
            .saturationModifier(0.1f)
            .alwaysEdible()
            .effect(() -> new MobEffectInstance(MobEffects.HUNGER, 400, 16), 100f)
            .effect(() -> new MobEffectInstance(MobEffects.POISON, 100, 2), 100f)
            .build();
    public static final FoodProperties IRON_APPLE = new FoodProperties.Builder()
            .nutrition(4)
            .saturationModifier(0.5f)
            .alwaysEdible()
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 2400, 0), 100f)
            .build();
    public static final FoodProperties OBSIDIAN_APPLE = new FoodProperties.Builder()
            .nutrition(4)
            .saturationModifier(0.5f)
            .alwaysEdible()
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 1200, 0), 100f)
            .build();

    // Snow Cream
    public static final FoodProperties SNOW_CREAM = new FoodProperties.Builder()
            .nutrition(4)
            .saturationModifier(0.4f)
            .usingConvertsTo(Items.BOWL)
            .build();
    // Bacon
    public static final FoodProperties RAW_BACON = new FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(0.50f)
            .fast()
            .build();
    public static final FoodProperties CRISPY_BACON = new FoodProperties.Builder()
            .nutrition(4)
            .saturationModifier(0.50f)
            .fast()
            .build();

}
