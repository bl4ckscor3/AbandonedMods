package Minecrafter1912.Scarecrow.renderer;

import Minecrafter1912.Scarecrow.Scarecrow;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class RenderSmallScarecrow extends RenderLiving
{
	public RenderSmallScarecrow(ModelBase par1ModelBase, float par2)
	{
		super(par1ModelBase, par2);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity p_110775_1_)
	{
		return new ResourceLocation(Scarecrow.modid + ":textures/mobs/scarecrow.png");
	}
}
