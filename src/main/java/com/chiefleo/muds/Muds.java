package com.chiefleo.muds;



import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Muds implements ModInitializer {
	
	public static final Item MUD_BALL = new Item(new Item.Settings().group(ItemGroup.MISC));
	
	@Override
	public void onInitialize() {

		Registry.register(Registry.ITEM, new Identifier("muds", "mud_ball"), MUD_BALL);
	
	}
}
