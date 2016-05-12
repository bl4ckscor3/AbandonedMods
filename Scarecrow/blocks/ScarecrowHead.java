package Minecrafter1912.Scarecrow.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ScarecrowHead extends BlockDirectional
{
	private boolean blockType;
	@SideOnly(Side.CLIENT)
	private Icon field_94474_b;
	@SideOnly(Side.CLIENT)
	private Icon field_94475_c;

	public ScarecrowHead(int par1, Material mat)
	{
		super(par1, mat);
		this.setTickRandomly(true);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setHardness(1.0F);
	}

	@SideOnly(Side.CLIENT)
	public Icon getIcon(int par1, int par2)
	{
		return par1 == 1 ? this.field_94474_b : (par1 == 0 ? this.field_94474_b : (par2 == 2 && par1 == 2 ? this.field_94475_c : (par2 == 3 && par1 == 5 ? this.field_94475_c : (par2 == 0 && par1 == 3 ? this.field_94475_c : (par2 == 1 && par1 == 4 ? this.field_94475_c : this.blockIcon)))));
	}

	public void onBlockAdded(World par1World, int x, int y, int z)
	{
		if (par1World.getBlockId(x, y - 1, z) == Block.cloth.blockID && par1World.getBlockId(x, y - 2, z) == Block.fence.blockID)
		{
			boolean flag = par1World.getBlockId(x - 1, y - 1, z) == Block.woodenButton.blockID && par1World.getBlockId(x + 1, y - 1, z) == Block.woodenButton.blockID;
			boolean flag1 = par1World.getBlockId(x, y - 1, z - 1) == Block.woodenButton.blockID && par1World.getBlockId(x, y - 1, z + 1) == Block.woodenButton.blockID;

			if (flag || flag1)
			{
				par1World.setBlock(x, y, z, 0, 0, 2);
				par1World.setBlock(x, y - 1, z, 0, 0, 2);
				par1World.setBlock(x, y - 2, z, 0, 0, 2);

				if (flag)
				{
					par1World.setBlock(x - 1, y - 1, z, 0, 0, 2);
					par1World.setBlock(x + 1, y - 1, z, 0, 0, 2);
				}
				else
				{
					par1World.setBlock(x, y - 1, z - 1, 0, 0, 2);
					par1World.setBlock(x, y - 1, z + 1, 0, 0, 2);
				}

				EntityIronGolem entityirongolem = new EntityIronGolem(par1World);
				entityirongolem.setPlayerCreated(true);
				entityirongolem.setLocationAndAngles((double)x + 0.5D, (double)y - 1.95D, (double)z + 0.5D, 0.0F, 0.0F);
				par1World.spawnEntityInWorld(entityirongolem);

				for (int i1 = 0; i1 < 120; ++i1)
				{
					par1World.spawnParticle("snowballpoof", (double)x + par1World.rand.nextDouble(), (double)(y - 2) + par1World.rand.nextDouble() * 3.9D, (double)z + par1World.rand.nextDouble(), 0.0D, 0.0D, 0.0D);
				}

				par1World.notifyBlockChange(x, y, z, 0);
				par1World.notifyBlockChange(x, y - 1, z, 0);
				par1World.notifyBlockChange(x, y - 2, z, 0);

				if (flag)
				{
					par1World.notifyBlockChange(x - 1, y - 1, z, 0);
					par1World.notifyBlockChange(x + 1, y - 1, z, 0);
				}
				else
				{
					par1World.notifyBlockChange(x, y - 1, z - 1, 0);
					par1World.notifyBlockChange(x, y - 1, z + 1, 0);
				}
			}
		}
	}

	public boolean canPlaceBlockAt(World par1World, int par2, int par3, int par4)
	{
		int l = par1World.getBlockId(par2, par3, par4);
		Block block = Block.blocksList[l];
		return (block == null || block.isBlockReplaceable(par1World, par2, par3, par4)) && par1World.doesBlockHaveSolidTopSurface(par2, par3 - 1, par4);
	}

	public void onBlockPlacedBy(World par1World, int par2, int par3, int par4, EntityLivingBase par5EntityLivingBase, ItemStack par6ItemStack)
	{
		int l = MathHelper.floor_double((double)(par5EntityLivingBase.rotationYaw * 4.0F / 360.0F) + 2.5D) & 3;
		par1World.setBlockMetadataWithNotify(par2, par3, par4, l, 2);
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
	{
		this.field_94475_c = par1IconRegister.registerIcon("minecraft:pumpkin_face_off");
		this.field_94474_b = par1IconRegister.registerIcon("minecraft:pumpkin_top");
		this.blockIcon = par1IconRegister.registerIcon("minecraft:pumpkin_side");
	}
}
