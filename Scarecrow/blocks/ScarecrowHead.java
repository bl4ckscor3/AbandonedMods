package Minecrafter1912.Scarecrow.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class ScarecrowHead extends BlockDirectional
{
	@SideOnly(Side.CLIENT)
	private IIcon field_94474_b;
	@SideOnly(Side.CLIENT)
	private IIcon field_94475_c;

	public ScarecrowHead(Material mat)
	{
		super(mat);
		this.setTickRandomly(true);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setHardness(1.0F);
	}

	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int par1, int par2)
	{
		return par1 == 1 ? this.field_94474_b : (par1 == 0 ? this.field_94474_b : (par2 == 2 && par1 == 2 ? this.field_94475_c : (par2 == 3 && par1 == 5 ? this.field_94475_c : (par2 == 0 && par1 == 3 ? this.field_94475_c : (par2 == 1 && par1 == 4 ? this.field_94475_c : this.blockIcon)))));
	}

	public void onBlockAdded(World par1World, int x, int y, int z)
	{
		if (par1World.getBlock(x, y - 1, z) == Blocks.wool && par1World.getBlock(x, y - 2, z) == Blocks.fence)
		{
			boolean flag = par1World.getBlock(x - 1, y - 1, z) == Blocks.wooden_button && par1World.getBlock(x + 1, y - 1, z) == Blocks.wooden_button;
			boolean flag1 = par1World.getBlock(x, y - 1, z - 1) == Blocks.wooden_button && par1World.getBlock(x, y - 1, z + 1) == Blocks.wooden_button;

			if (flag || flag1)
			{
				par1World.setBlock(x, y, z, Blocks.air, 0, 2);
				par1World.setBlock(x, y - 1, z, Blocks.air, 0, 2);
				par1World.setBlock(x, y - 2, z, Blocks.air, 0, 2);

				if (flag)
				{
					par1World.setBlock(x - 1, y - 1, z, Blocks.air, 0, 2);
					par1World.setBlock(x + 1, y - 1, z, Blocks.air, 0, 2);
				}
				else
				{
					par1World.setBlock(x, y - 1, z - 1, Blocks.air, 0, 2);
					par1World.setBlock(x, y - 1, z + 1, Blocks.air, 0, 2);
				}

				EntityIronGolem entityirongolem = new EntityIronGolem(par1World);
				entityirongolem.setPlayerCreated(true);
				entityirongolem.setLocationAndAngles(x + 0.5D, y - 1.95D, z + 0.5D, 0.0F, 0.0F);
				par1World.spawnEntityInWorld(entityirongolem);

				for (int i1 = 0; i1 < 120; ++i1)
				{
					par1World.spawnParticle("snowballpoof", x + par1World.rand.nextDouble(), y - 2 + par1World.rand.nextDouble() * 3.9D, z + par1World.rand.nextDouble(), 0.0D, 0.0D, 0.0D);
				}

				par1World.notifyBlockChange(x, y, z, this);
				par1World.notifyBlockChange(x, y - 1, z, this);
				par1World.notifyBlockChange(x, y - 2, z, this);

				if (flag)
				{
					par1World.notifyBlockChange(x - 1, y - 1, z, this);
					par1World.notifyBlockChange(x + 1, y - 1, z, this);
				}
				else
				{
					par1World.notifyBlockChange(x, y - 1, z - 1, this);
					par1World.notifyBlockChange(x, y - 1, z + 1, this);
				}
			}
		}
	}

	public boolean canPlaceBlockAt(World par1World, int par2, int par3, int par4)
	{
		Block block = par1World.getBlock(par2, par3, par4);
		return (block == null || block.isReplaceable(par1World, par2, par3, par4)) && World.doesBlockHaveSolidTopSurface(par1World, par2, par3 - 1, par4);
	}

	public void onBlockPlacedBy(World par1World, int par2, int par3, int par4, EntityLivingBase par5EntityLivingBase, ItemStack par6ItemStack)
	{
		int l = MathHelper.floor_double(par5EntityLivingBase.rotationYaw * 4.0F / 360.0F + 2.5D) & 3;
		par1World.setBlockMetadataWithNotify(par2, par3, par4, l, 2);
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister par1IconRegister)
	{
		this.field_94475_c = par1IconRegister.registerIcon("minecraft:pumpkin_face_off");
		this.field_94474_b = par1IconRegister.registerIcon("minecraft:pumpkin_top");
		this.blockIcon = par1IconRegister.registerIcon("minecraft:pumpkin_side");
	}
}
