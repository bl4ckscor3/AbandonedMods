package Minecrafter1912.Scarecrow;

import Minecrafter1912.Scarecrow.blocks.GlowScarecrowHead;
import Minecrafter1912.Scarecrow.blocks.OPScarecrowBody;
import Minecrafter1912.Scarecrow.blocks.ScarecrowBody;
import Minecrafter1912.Scarecrow.blocks.ScarecrowHead;
import Minecrafter1912.Scarecrow.proxy.ServerProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

@Mod(modid = SCInfo.modid, name = SCInfo.name, version = SCInfo.version)

public class Scarecrow
{
	//Stuff
	public static final String modid = "scarecrow";

	@SidedProxy(clientSide = "Minecrafter1912.Scarecrow.proxy.ClientProxy", serverSide = "Minecrafter1912.Scarecrow.proxy.ServerProxy")
	public static ServerProxy proxy;

	//Block stuff
	public static Block scHead;

	public static Block gscHead;

	public static Block scBody;

	public static Block oscBody;

	//Pre Init
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
	}

	//Init
	@EventHandler
	public void Init(FMLInitializationEvent event)
	{
		scHead = new ScarecrowHead(Material.wood).setUnlocalizedName("scHead").setStepSound(Block.soundTypeWood);
		gscHead = new GlowScarecrowHead(Material.wood).setUnlocalizedName("scHeadGlow").setStepSound(Block.soundTypeWood);
		scBody = new ScarecrowBody(Material.wood).setUnlocalizedName("scBody").setStepSound(Block.soundTypeWood);
		oscBody = new OPScarecrowBody(Material.wood).setUnlocalizedName("scBlock").setStepSound(Block.soundTypeWood);

		new SCBlockReg();
		new SCLang();
		//		new SCCraft();
		proxy.register();
	}

	//Post Init
	//	Unused atm
	//	@EventHandler
	//	public void postInit(FMLPostInitializationEvent event)
	//	{
	//	}
}