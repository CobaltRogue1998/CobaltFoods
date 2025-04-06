package net.cobaltrogue.cobaltfoods.item;

import net.cobaltrogue.cobaltfoods.CobaltFoods;
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
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 100, 2), 0.20f)
            .build();
    // Bacon
    public static final FoodProperties RAW_BACON = new FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(0.50f)
            .fast()
            .effect(() -> new MobEffectInstance(MobEffects.HUNGER, 600, 0), 0.30f)
            .build();
    public static final FoodProperties CRISPY_BACON = new FoodProperties.Builder()
            .nutrition(4)
            .saturationModifier(0.50f)
            .fast()
            .build();

    // Mashed Potatoes
    public static final FoodProperties MASHED_POTATOES = new FoodProperties.Builder()
            .nutrition(5)
            .saturationModifier(0.60f)
            .build();
    public static final FoodProperties LOADED_MASHED_POTATOES = new FoodProperties.Builder()
            .nutrition(9)
            .saturationModifier(0.60f)
            .build();

    // Cheese
    public static final FoodProperties CHEESE = new FoodProperties.Builder()
            .nutrition(4)
            .saturationModifier(0.50f)
            .build();

    // Sandwiches
    public static final FoodProperties GRILLED_CHEESE = new FoodProperties.Builder()
            .nutrition(8)
            .saturationModifier(0.60f)
            .build();

    public static final FoodProperties HAM_AND_CHEESE = new FoodProperties.Builder()
            .nutrition(12)
            .saturationModifier(0.60f)
            .build();

    // Juices
    public static final FoodProperties MELON_JUICE= new FoodProperties.Builder()
            .nutrition(4)
            .saturationModifier(0.50f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200, 0), 100f)
            .fast()
            .build();
    public static final FoodProperties APPLE_JUICE= new FoodProperties.Builder()
            .nutrition(4)
            .saturationModifier(0.50f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 100, 0), 100f)
            .fast()
            .build();
    public static final FoodProperties CARROT_JUICE= new FoodProperties.Builder()
            .nutrition(4)
            .saturationModifier(0.50f)
            .effect(() -> new MobEffectInstance(MobEffects.NIGHT_VISION, 200, 0), 100f)
            .fast()
            .build();
    public static final FoodProperties BEETROOT_JUICE= new FoodProperties.Builder()
            .nutrition(4)
            .saturationModifier(0.50f)
            .effect(() -> new MobEffectInstance(MobEffects.ABSORPTION, 200, 1), 100f)
            .fast()
            .build();
    public static final FoodProperties SWEET_BERRY_JUICE= new FoodProperties.Builder()
            .nutrition(4)
            .saturationModifier(0.50f)
            .effect(() -> new MobEffectInstance(MobEffects.JUMP, 200, 0), 100f)
            .fast()
            .build();
    public static final FoodProperties GLOW_BERRY_JUICE= new FoodProperties.Builder()
            .nutrition(4)
            .saturationModifier(0.50f)
            .effect(() -> new MobEffectInstance(MobEffects.GLOWING, 600, 0), 100f)
            .fast()
            .build();
    public static final FoodProperties KELP_JUICE = new FoodProperties.Builder()
            .nutrition(4)
            .saturationModifier(0.50f)
            .effect(() -> new MobEffectInstance(MobEffects.WATER_BREATHING, 200, 0), 100f)
            .fast()
            .build();
    public static final FoodProperties ZOMBIE_JERKY = new FoodProperties.Builder()
            .nutrition(4)
            .saturationModifier(0.50f)
            .build();
    public static final FoodProperties SUNFLOWER_SEEDS = new FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(0.50f)
            .fast()
            .build();
    public static final FoodProperties TRAIL_MIX = new FoodProperties.Builder()
            .nutrition(4)
            .saturationModifier(0.75f)
            .fast()
            .build();
    public static final FoodProperties UNFLAVORED_SNOW_CONE = new FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(0.50f)
            .alwaysEdible()
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 300, 2), 0.20f)
            .build();
    public static final FoodProperties APPLE_SNOW_CONE = new FoodProperties.Builder()
            .nutrition(6)
            .saturationModifier(0.40f)
            .effect(() -> new MobEffectInstance(MobEffects.REGENERATION, 100, 0), 100f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 100, 2), 0.20f)
            .alwaysEdible()
            .build();
    public static final FoodProperties MELON_SNOW_CONE = new FoodProperties.Builder()
            .nutrition(6)
            .saturationModifier(0.40f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200, 0), 100f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 100, 2), 0.20f)
            .alwaysEdible()
            .build();
    public static final FoodProperties SWEET_BERRY_SNOW_CONE = new FoodProperties.Builder()
            .nutrition(6)
            .saturationModifier(0.40f)
            .effect(() -> new MobEffectInstance(MobEffects.JUMP, 200, 0), 100f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 100, 2), 0.20f)
            .alwaysEdible()
            .build();
    public static final FoodProperties GLOW_BERRY_SNOW_CONE = new FoodProperties.Builder()
            .nutrition(6)
            .saturationModifier(0.40f)
            .effect(() -> new MobEffectInstance(MobEffects.GLOWING, 600, 0), 100f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 100, 2), 0.20f)
            .alwaysEdible()
            .build();
    public static final FoodProperties RAW_CALAMARI = new FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(0.20f)
            .effect(() -> new MobEffectInstance(MobEffects.HUNGER, 600, 0), 0.30f)
            .build();
    public static final FoodProperties COOKED_CALAMARI = new FoodProperties.Builder()
            .nutrition(6)
            .saturationModifier(0.50f)
            .build();
    public static final FoodProperties RAW_CHICKEN_LEG = new FoodProperties.Builder()
            .nutrition(2)
            .saturationModifier(0.50f)
            .effect(() -> new MobEffectInstance(MobEffects.HUNGER, 600, 0), 0.30f)
            .usingConvertsTo(Items.BONE)
            .build();
    public static final FoodProperties COOKED_CHICKEN_LEG = new FoodProperties.Builder()
            .nutrition(6)
            .saturationModifier(0.40f)
            .usingConvertsTo(Items.BONE)
            .build();
}
