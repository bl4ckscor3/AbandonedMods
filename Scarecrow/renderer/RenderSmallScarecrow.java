package Minecrafter1912.Scarecrow.renderer;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import Minecrafter1912.Scarecrow.Scarecrow;
import Minecrafter1912.Scarecrow.entity.EntitySmallScarecrow;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderSmallScarecrow extends RenderLiving
{
    public RenderSmallScarecrow(ModelBase par1ModelBase, float par2)
    {
        super(par1ModelBase, par2);
    }

    protected ResourceLocation func_110832_a(EntitySmallScarecrow par1EntitySmallScarecrow)
    {
        return func_110775_a(par1EntitySmallScarecrow);
    }
    
    protected ResourceLocation func_110779_a(EntitySmallScarecrow par1EntitySmallScarecrow)
    {
        return func_110775_a(par1EntitySmallScarecrow);
    }
    
	@Override
	protected ResourceLocation func_110775_a(Entity entity) 
	{
		return new ResourceLocation(Scarecrow.modid + ":textures/entity/scarecrow.png");
	}
}
