package net.norbee.tutorialmod.datagen;

import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.norbee.tutorialmod.TutorialMod;
import net.norbee.tutorialmod.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, TutorialMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.RAW_ALEXANDRITE.get());
        basicItem(ModItems.ALEXANDRITE.get());

        basicItem(ModItems.CHISEL.get());
        basicItem(ModItems.AURORA_ASHES.get());
        basicItem(ModItems.KOHLRABI.get());
        basicItem(ModItems.KOBANYAI.get());
    }
}
