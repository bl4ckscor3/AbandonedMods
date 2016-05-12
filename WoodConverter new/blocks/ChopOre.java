package Minecrafter1912.WoodConverter.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.world.World;

import Minecrafter1912.WoodConverter.WoodConverter;

public class ChopOre extends Block
{
	public ChopOre(int id, Material mat)
	{
		super(id, mat);
		this.setUnlocalizedName("chopore");
		this.setCreativeTab(WoodConverter.tabWc);
		this.setStepSound(Block.soundStoneFootstep);
		this.setHardness(4.0F);
	}
	
	@Override
	public void registerIcons(IconRegister reg)
	{
		this.blockIcon = reg.registerIcon("WoodConverter:chopore");
	}
}
