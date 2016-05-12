package Minecrafter1912.Scarecrow;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.Configuration;
import Minecrafter1912.Scarecrow.blocks.OPScarecrowBody;
import Minecrafter1912.Scarecrow.blocks.ScarecrowBody;
import Minecrafter1912.Scarecrow.blocks.ScarecrowHead;
import Minecrafter1912.Scarecrow.blocks.GlowScarecrowHead;
import Minecrafter1912.Scarecrow.proxy.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = SCInfo.modid, name = SCInfo.name, version = SCInfo.version)
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class Scarecrow
{	
	//Stuff
	public static final String modid = "scarecrow";
	
	@SidedProxy(clientSide = "Minecrafter1912.Scarecrow.proxy.ClientProxy", serverSide = "Minecrafter1912.Scarecrow.proxy.CommonProxy")
	public static CommonProxy proxy;
	
	//Block stuff
	public static Block scHead;
	public static int scHeadID = 1865;
	
	public static Block gscHead;
	//ID is scHeadID + 1
	
	public static Block scBody;
	//ID is scHeadID + 2
	
	public static Block oscBody;
	//ID is scHeadID + 3
	
	//Pre Init
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		config.load();
		SCConfig.config(config);
		config.save();
	}
	
	//Init
	@EventHandler
	public void Init(FMLInitializationEvent event)
	{
		scHead = new ScarecrowHead(scHeadID, Material.pumpkin).setUnlocalizedName("scHead").setStepSound(Block.soundWoodFootstep);
		gscHead = new GlowScarecrowHead(scHeadID + 1, Material.pumpkin).setUnlocalizedName("scHeadGlow").setStepSound(Block.soundWoodFootstep);
		scBody = new ScarecrowBody(scHeadID + 2, Material.cloth).setUnlocalizedName("scBody").setStepSound(Block.soundClothFootstep);
		oscBody = new OPScarecrowBody(scHeadID + 3, Material.rock).setUnlocalizedName("scBlock").setStepSound(Block.soundStoneFootstep);
		
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