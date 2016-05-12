package Minecrafter1912.WoodConverter.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import Minecrafter1912.WoodConverter.WoodConverter;

public class ChopShard extends Item
{
	public ChopShard(int id) 
	{
		super(id);
		this.setUnlocalizedName("chopshard");
		this.setMaxStackSize(16);
		this.setCreativeTab(WoodConverter.tabWc);
	}

	@SideOnly(Side.CLIENT)
	public void registerIcon(IconRegister reg)
	{
		this.itemIcon = reg.registerIcon("WoodConverter:chopshard");
	}
}
