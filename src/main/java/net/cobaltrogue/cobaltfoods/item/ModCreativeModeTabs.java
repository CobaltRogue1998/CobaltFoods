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
                        output.accept(ModItems.SNOW_CREAM);
                        output.accept(ModItems.RAW_BACON);
                        output.accept(ModItems.CRISPY_BACON);
                        output.accept(ModItems.ROTTEN_APPLE);
                        output.accept(ModItems.IRON_APPLE);
                        output.accept(ModItems.OBSIDIAN_APPLE);
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
