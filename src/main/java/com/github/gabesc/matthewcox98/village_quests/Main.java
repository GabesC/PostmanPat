package com.github.gabesc.matthewcox98.village_quests;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Main implements ModInitializer {
    public static final Item GABE_ITEM = new Item(new FabricItemSettings().maxDamage(50).group(ItemGroup.MISC));
    public static final Item COOL_ITEM = new Item(new FabricItemSettings().group(ItemGroup.MISC));
    public static final letter LETTER_ITEM = new letter(new FabricItemSettings().group(ItemGroup.MISC).maxCount(1));
    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("village_quests", "cool_item"), COOL_ITEM);
        Registry.register(Registry.ITEM, new Identifier("village_quests", "gabe_item"), GABE_ITEM);
        Registry.register(Registry.ITEM, new Identifier("village_quests","letter"), LETTER_ITEM);
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        //System.out.println("Hello Fabric world!");
    }
}
