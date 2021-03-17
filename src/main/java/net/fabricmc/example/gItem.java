package net.fabricmc.example;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.client.ClientSpriteRegistryCallback;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class gItem implements ModInitializer{
    //instance of the new gabe item
    public static final Item GABE_ITEM = new Item(new FabricItemSettings().group(ItemGroup.MISC));

    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("gabe", "gabe_item"), GABE_ITEM);

    }
}