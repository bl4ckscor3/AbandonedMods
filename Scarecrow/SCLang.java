package Minecrafter1912.Scarecrow;

import cpw.mods.fml.common.registry.LanguageRegistry;

public class SCLang
{
	Scarecrow sc;

	public SCLang()
	{
		LanguageRegistry.addName(Scarecrow.scHead, "Scarecrow Head");
		LanguageRegistry.addName(Scarecrow.gscHead, "Glowing Scarecrow's Head");
		LanguageRegistry.addName(Scarecrow.scBody, "Scarecrow Body");
		LanguageRegistry.addName(Scarecrow.oscBody, "Overpowered Scarecrow's Body");

		LanguageRegistry.instance().addStringLocalization("entity.Small Scarecrow.name", "Small Scarecrow");
	}
}
