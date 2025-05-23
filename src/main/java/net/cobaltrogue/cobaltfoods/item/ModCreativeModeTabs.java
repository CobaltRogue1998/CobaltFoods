package net.cobaltrogue.cobaltfoods.item;

import net.cobaltrogue.cobaltfoods.CobaltFoods;
import net.cobaltrogue.cobaltfoods.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;


import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CobaltFoods.MOD_ID);

    public static final Supplier<CreativeModeTab> COBALT_FOODS_TAB = CREATIVE_MODE_TAB.register("cobalt_foods",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TOAST.get()))
                    .title(Component.translatable("CREATIVE_MODE_TAB.cobalt_foods"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.DOUGH);
                        output.accept(ModItems.APPLE_DOUGH);
                        output.accept(ModItems.PUMPKIN_DOUGH);
                        output.accept(ModItems.TOAST);
                        output.accept(ModItems.HONEY_TOAST);
                        output.accept(ModItems.APPLE_BREAD);
                        output.accept(ModItems.PUMPKIN_BREAD);
                        output.accept(ModItems.GRILLED_CHEESE);
                        output.accept(ModItems.HAM_AND_CHEESE);
                        output.accept(ModItems.SNOW_CREAM);
                        output.accept(ModItems.MASHED_POTATOES);
                        output.accept(ModItems.LOADED_MASHED_POTATOES);
                        output.accept(ModItems.RAW_BACON);
                        output.accept(ModItems.CRISPY_BACON);
                        output.accept(ModItems.RAW_CALAMARI);
                        output.accept(ModItems.COOKED_CALAMARI);
                        output.accept(ModItems.RAW_CHICKEN_LEG);
                        output.accept(ModItems.COOKED_CHICKEN_LEG);
                        output.accept(ModItems.ROTTEN_APPLE);
                        output.accept(ModItems.IRON_APPLE);
                        output.accept(ModItems.OBSIDIAN_APPLE);
                        output.accept(ModItems.CHEESE);
                        output.accept(ModItems.MELON_JUICE);
                        output.accept(ModItems.APPLE_JUICE);
                        output.accept(ModItems.CARROT_JUICE);
                        output.accept(ModItems.BEETROOT_JUICE);
                        output.accept(ModItems.GLOW_BERRY_JUICE);
                        output.accept(ModItems.SWEET_BERRY_JUICE);
                        output.accept(ModItems.KELP_JUICE);
                        output.accept(ModItems.ZOMBIE_JERKY);
                        output.accept(ModItems.PAPER_CONE);
                        output.accept(ModItems.UNFLAVORED_SNOW_CONE);
                        output.accept(ModItems.APPLE_SNOW_CONE);
                        output.accept(ModItems.MELON_SNOW_CONE);
                        output.accept(ModItems.GLOW_BERRY_SNOW_CONE);
                        output.accept(ModItems.SWEET_BERRY_SNOW_CONE);
                        output.accept(ModItems.SUNFLOWER_SEEDS);
                        output.accept(ModItems.TRAIL_MIX);
                        output.accept(ModItems.ROASTED_BROWN_MUSHROOM);
                        output.accept(ModItems.ROASTED_RED_MUSHROOM);
                        output.accept(ModItems.TOASTED_PUMPKIN_SEEDS);
                        output.accept(ModItems.CARAMEL);
                        output.accept(ModItems.CARAMEL_APPLE);
                        output.accept(ModItems.PASTA);


                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
