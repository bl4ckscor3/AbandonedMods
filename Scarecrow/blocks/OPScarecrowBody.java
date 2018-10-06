package Minecrafter1912.Scarecrow.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class OPScarecrowBody extends Block
{
	public OPScarecrowBody(Material mat)
	{
		super(mat);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setHardness(5.0F);
		this.setResistance(25.0F);
	}

	@Override
	public void registerIcons(IIconRegister reg)
	{
		this.blockIcon = reg.registerIcon("minecraft:obsidian");
	}
}
