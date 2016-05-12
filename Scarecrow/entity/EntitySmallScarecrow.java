package Minecrafter1912.Scarecrow.entity;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import Minecrafter1912.Scarecrow.Scarecrow;

public class EntitySmallScarecrow extends Entity
{
	public EntitySmallScarecrow(World world)
	{
		super(world);
		this.setVelocity(0, 0, 0);
	}
	
	public int getMaxHealth()
	{
		return 100;
	}
	
	public void dropFewItems(boolean b, int i)
	{
		this.dropItem(Scarecrow.scHead.blockID, 1);
		this.dropItem(Scarecrow.scBody.blockID, 1);
		this.dropItem(Block.fence.blockID, 1);
		this.dropItem(Block.woodenButton.blockID, 2);
	}

	@Override
	protected void entityInit() 
	{	
	}

	@Override
	protected void readEntityFromNBT(NBTTagCompound nbttagcompound)
	{	
	}

	@Override
	protected void writeEntityToNBT(NBTTagCompound nbttagcompound) 
	{
	}
}
