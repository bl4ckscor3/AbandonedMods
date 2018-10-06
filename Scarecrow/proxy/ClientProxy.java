package Minecrafter1912.Scarecrow.proxy;

import Minecrafter1912.Scarecrow.entity.EntitySmallScarecrow;
import Minecrafter1912.Scarecrow.model.ModelSmallScarecrow;
import Minecrafter1912.Scarecrow.renderer.RenderSmallScarecrow;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends ServerProxy
{
	@Override
	public void registerRenderInformation()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntitySmallScarecrow.class, new RenderSmallScarecrow(new ModelSmallScarecrow(), 1.0F));
	}
}