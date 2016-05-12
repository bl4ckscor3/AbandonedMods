package Minecrafter1912.WoodConverter.blocks;

import Minecrafter1912.WoodConverter.WoodConverter;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Planer extends Block
{
    @SideOnly(Side.CLIENT)
    private Icon field_94385_a;
    @SideOnly(Side.CLIENT)
    private Icon field_94384_b;
	
	public Planer(int id, Material mat) 
	{
		super(id, mat);
		this.setUnlocalizedName("planer");
		this.setCreativeTab(WoodConverter.tabWc);
		this.setStepSound(Block.soundWoodFootstep);
	}
	
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon("WoodConverter:planer_side");
        this.field_94385_a = par1IconRegister.registerIcon("WoodConverter:planer_top");
        this.field_94384_b = par1IconRegister.registerIcon("WoodConverter:planer_front");
    }
}
