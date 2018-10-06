package Minecrafter1912.Scarecrow;

import cpw.mods.fml.common.registry.GameRegistry;

public class SCBlockReg
{
	Scarecrow sc;

	public SCBlockReg()
	{
		GameRegistry.registerBlock(Scarecrow.scHead, "scHead");
		GameRegistry.registerBlock(Scarecrow.gscHead, "scHeadGlow");
		GameRegistry.registerBlock(Scarecrow.scBody, "scBody");
		GameRegistry.registerBlock(Scarecrow.oscBody, "scBlock");
	}
}
