package Minecrafter1912.WoodConverter.blocks;

import Minecrafter1912.WoodConverter.WoodConverter;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.World;

public class BundledWood extends Block 
{
	public BundledWood(int id, Material mat)
	{
		super(id, mat);
		this.setUnlocalizedName("bundledWood");
		this.setCreativeTab(WoodConverter.tabWc);
		this.setResistance(0.0F);
		this.setHardness(0.0F);
		this.setStepSound(Block.soundWoodFootstep);
	}
	
	@Override
	public void registerIcons(IconRegister reg)
	{
		this.blockIcon = reg.registerIcon("WoodConverter:bundledWood");
	}
}
