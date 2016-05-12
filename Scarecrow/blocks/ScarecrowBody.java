package Minecrafter1912.Scarecrow.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class ScarecrowBody extends Block
{
	public ScarecrowBody(int id, Material mat)
	{
		super(id, mat);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setHardness(0.8F);
	}
	
	@Override
	public void registerIcons(IconRegister reg)
	{
		this.blockIcon = reg.registerIcon("minecraft:wool_colored_brown");
	}
}
