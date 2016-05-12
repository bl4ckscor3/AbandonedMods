package Minecrafter1912.Scarecrow;

import cpw.mods.fml.common.registry.LanguageRegistry;

public class SCLang
{
	Scarecrow sc;
	
	public SCLang()
	{
		LanguageRegistry.addName(sc.scHead, "Scarecrow Head");
		LanguageRegistry.addName(sc.gscHead, "Glowing Scarecrow's Head");
		LanguageRegistry.addName(sc.scBody, "Scarecrow Body");
		LanguageRegistry.addName(sc.oscBody, "Overpowered Scarecrow's Body");
		
		LanguageRegistry.instance().addStringLocalization("entity.Small Scarecrow.name", "Small Scarecrow");
	}
}
