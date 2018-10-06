package Minecrafter1912.Scarecrow.entity;

import Minecrafter1912.Scarecrow.Scarecrow;
import net.minecraft.entity.EntityLiving;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntitySmallScarecrow extends EntityLiving
{
	public EntitySmallScarecrow(World world)
	{
		super(world);
		this.setVelocity(0, 0, 0);
	}

	public void dropFewItems(boolean b, int i)
	{
		this.entityDropItem(new ItemStack(Scarecrow.scHead, 1), 0.0F);
		this.entityDropItem(new ItemStack(Scarecrow.scBody, 1), 0.0F);
		this.entityDropItem(new ItemStack(Blocks.fence, 1), 0.0F);
		this.entityDropItem(new ItemStack(Blocks.wooden_button, 2), 0.0F);
	}
}
