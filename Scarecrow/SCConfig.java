package Minecrafter1912.Scarecrow;

import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.Property;

public class SCConfig
{
	public static Scarecrow sc;
	
	public static void config(Configuration config)
	{
		Property scHead = config.get(config.CATEGORY_BLOCK, "Scarecrow Head", sc.scHeadID);
		scHead.comment = "Choose the ID of this block if there are any conflicts!";
		scHead.getInt();
	}
}
