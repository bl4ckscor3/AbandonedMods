package Minecrafter1912.WoodConverter;

import Minecrafter1912.WoodConverter.blocks.BundledWood;
import Minecrafter1912.WoodConverter.blocks.ChopOre;
import Minecrafter1912.WoodConverter.blocks.Painter;
import Minecrafter1912.WoodConverter.blocks.Planer;
import Minecrafter1912.WoodConverter.blocks.PlanerBase;
import Minecrafter1912.WoodConverter.items.ChopShard;
import Minecrafter1912.WoodConverter.items.PlanerItem;
import Minecrafter1912.WoodConverter.proxy.CommonProxy;
import Minecrafter1912.WoodConverter.worldgen.WorldGenChopOre;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = WoodConverter.modid, name = "Wood Converter", version = "v3.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class WoodConverter
{	
	public static final String modid = "wc";
	
	//--------------------------------------------------
	public static Item chopshard;
	public int chopshardID = 17390;
	
	public static Item planerItem;
	public int planerItemID = 17391;
	
	
	public static Block planer;
	public int planerID = 4020;
	
	public static Block chopore;
	public int choporeID = 4021;
	
	public static Block planerBase;
	public int planerBaseID = 4022;
	
	public static Block bundledWood;
	public int bundledWoodID = 4023;

	public static Block paintingTable;
	public int paintingTableID = 4024;
	
	//Creative Tab
	public static CreativeTabs tabWc = new CreativeTabs("tabWc")
	{
		public ItemStack getIconItemStack()
		{
			return new ItemStack(planer);
		}
	};
	//--------------------------------------------------
	
	@Instance("Wood Converter")
	public static WoodConverter instance;
	
	@SidedProxy(clientSide = "Minecrafter1912.WoodConverter.proxy.ClientProxy", serverSide = "Minecrafter1912.WoodConverter.proxy.CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		chopshard = new ChopShard(chopshardID);
		planerItem = new PlanerItem(planerItemID);
		
		planer = new Planer(planerID, Material.wood);
		chopore = new ChopOre(choporeID, Material.rock);
		planerBase = new PlanerBase(planerBaseID, Material.wood);
		bundledWood = new BundledWood(bundledWoodID, Material.wood);
		paintingTable = new Painter(paintingTableID, Material.wood).setUnlocalizedName("painter");
		
		registerItems();
		registerBlocks();
		updateLanguage();
		initCraftingRecipes();
		initSmeltingRecipes();
		registerWorldGen();
		
		System.out.println("The Wood Converter Mod is ready to use! Happy converting :)");
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event)
	{
	}
	
	
	//---------------------------------------------------
	//    Own methods
	//---------------------------------------------------
	private void registerItems()
	{
	GameRegistry.registerItem(chopshard, "Chop Shard");
	GameRegistry.registerItem(planerItem, "Planer Item");
	}
	
	private void registerBlocks()
	{
		GameRegistry.registerBlock(planer, "Planer");
		GameRegistry.registerBlock(chopore, "Chop Ore");
		GameRegistry.registerBlock(planerBase, "Planer Base");
		GameRegistry.registerBlock(bundledWood, "Bundled Wood");
		GameRegistry.registerBlock(paintingTable, "Painting Table");

	}
	
	private void updateLanguage()
	{
		LanguageRegistry.addName(chopshard, "Chop Shard");
		LanguageRegistry.addName(planerItem, "Planer Item");
		
		LanguageRegistry.addName(planer, "Planer");
		LanguageRegistry.addName(chopore, "Chop Ore");
		LanguageRegistry.addName(planerBase, "Planer Base");
		LanguageRegistry.addName(bundledWood, "Bundled Wood");
		
		//Painting Tables
		LanguageRegistry.addName(new ItemStack(paintingTable, 1, 0), "Painting Table (Logs)");
		LanguageRegistry.addName(new ItemStack(paintingTable, 1, 1), "Painting Table (Planks)");
		LanguageRegistry.addName(new ItemStack(paintingTable, 1, 2), "Painting Table (Slabs)");
		LanguageRegistry.addName(new ItemStack(paintingTable, 1, 3), "Painting Table (Stairs)");
		
		LanguageRegistry.instance().addStringLocalization("itemGroup.tabWc", "en_US", "Wood Converter");
	}
	
	public void registerWorldGen()
	{
		GameRegistry.registerWorldGenerator(new WorldGenChopOre());
	}
	
	private void initCraftingRecipes()
	{		
		//*----------------------------------------------
		//* Recipes for new Wood Converter
		//*----------------------------------------------
		GameRegistry.addRecipe(new ItemStack(WoodConverter.bundledWood), "VXW", "XXX", "YXZ", 'V', new ItemStack(Block.planks, 1, 0), 'W', new ItemStack(Block.planks, 1, 1), 'X', Item.silk, 'Y', new ItemStack(Block.planks, 1, 3), 'Z', new ItemStack(Block.planks, 1, 2));
		GameRegistry.addRecipe(new ItemStack(WoodConverter.planerBase), "XXX", "XYX", "XXX", 'X', Block.wood, 'Y', WoodConverter.bundledWood);
		GameRegistry.addRecipe(new ItemStack(WoodConverter.planer), "X", "Y", "Z", 'X', WoodConverter.planerItem, 'Y', Item.stick, 'Z', WoodConverter.planerBase);
		GameRegistry.addRecipe(new ItemStack(WoodConverter.planerItem), "   ", "WXY", "ZZZ", 'W', Item.stick, 'X', new ItemStack(Block.woodSingleSlab, 1, 0), 'Y', Block.stairsWoodOak, 'Z', Block.planks); 
	}
	
	private void initSmeltingRecipes()
	{
		GameRegistry.addSmelting(chopore.blockID, new ItemStack(chopshard), 0.5F);
	}
}