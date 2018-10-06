package Minecrafter1912.Scarecrow.proxy;

import Minecrafter1912.Scarecrow.Scarecrow;
import Minecrafter1912.Scarecrow.entity.EntitySmallScarecrow;
import cpw.mods.fml.common.registry.EntityRegistry;

public class ServerProxy
{
	public void registerRenderInformation()
	{
	}

	public void register()
	{
		EntityRegistry.registerModEntity(EntitySmallScarecrow.class, "Small Scarecrow", 0, Scarecrow.modid, 64, 5, false);
		registerRenderInformation();
	}
}
