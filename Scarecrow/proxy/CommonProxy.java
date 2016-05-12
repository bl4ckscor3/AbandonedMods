package Minecrafter1912.Scarecrow.proxy;

import Minecrafter1912.Scarecrow.entity.EntitySmallScarecrow;
import cpw.mods.fml.common.registry.EntityRegistry;

public class CommonProxy
{
	public void registerRenderInformation()
	{
	}
	
	public void register()
	{
		EntityRegistry.registerGlobalEntityID(EntitySmallScarecrow.class, "Small Scarecrow", EntityRegistry.findGlobalUniqueEntityId(), 746885, 456125);
		registerRenderInformation();
	}
}
