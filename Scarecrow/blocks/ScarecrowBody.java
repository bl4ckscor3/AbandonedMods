package Minecrafter1912.Scarecrow.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class ScarecrowBody extends Block
{
	public ScarecrowBody(Material mat)
	{
		super(mat);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setHardness(0.8F);
	}

	@Override
	public void registerIcons(IIconRegister reg)
	{
		this.blockIcon = reg.registerIcon("minecraft:wool_colored_brown");
	}
}
