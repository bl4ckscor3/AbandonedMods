package Minecrafter1912.WoodConverter.blocks;

import Minecrafter1912.WoodConverter.WoodConverter;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class Painter extends Block 
{
	public Painter(int id, Material mat)
	{
		super(id, mat);
		this.setUnlocalizedName("painter");
		this.setCreativeTab(WoodConverter.tabWc);
	}
	
	@Override
	public void registerIcons(IconRegister reg)
	{
		this.blockIcon = reg.registerIcon("WoodConverter:painter");
	}
}
