package com.github.gabesc.matthewcox98.village_quests;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Main implements ModInitializer {
    public static final Item GABE_ITEM = new Item(new FabricItemSettings().maxDamage(50).group(ItemGroup.MISC));
    public static final Item COOL_ITEM = new Item(new FabricItemSettings().group(ItemGroup.MISC));
    public static final Block POSTBOX = new Block(FabricBlockSettings.of(Material.WOOD).strength(0.5f).resistance(1200.0f));
    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("village_quests", "cool_item"), COOL_ITEM);
        Registry.register(Registry.ITEM, new Identifier("village_quests", "gabe_item"), GABE_ITEM);
        Registry.register(Registry.BLOCK, new Identifier("village_quests","postbox"), POSTBOX);
        Registry.register(Registry.ITEM, new Identifier("village_quests", "postbox"), new BlockItem(POSTBOX, new FabricItemSettings().group(ItemGroup.MISC)));
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        //System.out.println("Hello Fabric world!");
    }
}
