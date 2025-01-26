package net.norbee.tutorialmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.norbee.tutorialmod.TutorialMod;
import net.norbee.tutorialmod.item.custom.ChiselItem;
import net.norbee.tutorialmod.item.custom.Fueltem;
import net.norbee.tutorialmod.item.custom.Kobanyai;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> ALEXANDRITE = ITEMS.register("alexandrite",
            ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_ALEXANDRITE = ITEMS.register("raw_alexandrite",
            ()-> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CHISEL = ITEMS.register("chisel",
            ()-> new ChiselItem(new Item.Properties().durability(32)));

    public static final RegistryObject<Item> KOHLRABI = ITEMS.register("kohlrabi",
            ()-> new Item(new Item.Properties().food(ModFoodProperties.KOHLRABI)));
    public static final RegistryObject<Item> KOBANYAI = ITEMS.register("kobanyai",
            ()-> new Kobanyai(new Item.Properties().food(ModFoodProperties.KOBANYAI)));

    public static final RegistryObject<Item> AURORA_ASHES = ITEMS.register("aurora_ashes",
            ()->new Fueltem(new Item.Properties(), 1200));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
