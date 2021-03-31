package com.github.gabesc.matthewcox98.village_quests;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;

public class letter extends Item {
    public letter(Settings settings){
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext){
        tooltip.add(new TranslatableText("item.village_quests.letter.tooltip"));
        tooltip.add(new TranslatableText("item.village_quests.letter.tooltip2").formatted(Formatting.RED));
    }
}
