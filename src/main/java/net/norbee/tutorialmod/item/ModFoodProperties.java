package net.norbee.tutorialmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Items;

public class ModFoodProperties {
    public static final FoodProperties KOHLRABI = new FoodProperties.Builder()
            .nutrition(3)
            .saturationModifier(0.25f)
            .effect(new MobEffectInstance(MobEffects.INVISIBILITY, 400), 0.20f)
            .fast()
            .alwaysEdible()
            .build();

    public static final FoodProperties KOBANYAI = new FoodProperties.Builder()
            .nutrition(10)
            .saturationModifier(1f)
            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 400),1f)
            .effect(new MobEffectInstance(MobEffects.HUNGER, 400), 1f)
            .alwaysEdible()
            .usingConvertsTo(Items.GLASS_BOTTLE)
            .build();
}
