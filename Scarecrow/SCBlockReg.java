package Minecrafter1912.Scarecrow;

import cpw.mods.fml.common.registry.GameRegistry;

public class SCBlockReg
{
	Scarecrow sc;

	public SCBlockReg()
	{
		GameRegistry.registerBlock(sc.scHead, "scHead");
		GameRegistry.registerBlock(sc.gscHead, "scHeadGlow");
		GameRegistry.registerBlock(sc.scBody, "scBody");
		GameRegistry.registerBlock(sc.oscBody, "scBlock");
	}
}
