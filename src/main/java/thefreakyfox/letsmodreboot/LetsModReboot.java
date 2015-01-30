package thefreakyfox.letsmodreboot;

import thefreakyfox.letsmodreboot.client.handler.KeyInputEventHandler;
import thefreakyfox.letsmodreboot.handler.ConfigHandler;
import thefreakyfox.letsmodreboot.init.ModBlocks;
import thefreakyfox.letsmodreboot.init.ModItems;
import thefreakyfox.letsmodreboot.init.Recipes;
import thefreakyfox.letsmodreboot.lib.ModConstants;
import thefreakyfox.letsmodreboot.proxy.IProxy;
import thefreakyfox.letsmodreboot.util.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod( modid = ModConstants.MOD_ID, name = ModConstants.MOD_NAME, version = ModConstants.VERSION,
		guiFactory = ModConstants.GUI_FACTORY_CLASS )
public class LetsModReboot {


	@Instance( ModConstants.MOD_ID )
	public static LetsModReboot instance;

	@SidedProxy( clientSide = ModConstants.CLIENT_PROXY_CLASS, serverSide = ModConstants.SERVER_PROXY_CLASS )
	public static IProxy proxy;

	/**
	 * Load network handlers, config, blocks and items
	 */
	@EventHandler
	public void preInit( FMLPreInitializationEvent event ) {
		ConfigHandler.init( event.getSuggestedConfigurationFile() );
		FMLCommonHandler.instance().bus().register( new ConfigHandler() );

		proxy.registerKeyBindings();

		ModItems.init();
		ModBlocks.init();

		LogHelper.info( "Pre-initialisation complete!" );
	}

	/**
	 * Register GUIs, tile entities, crafting recipes and general event handlers
	 */
	@EventHandler
	public void init( FMLInitializationEvent event ) {
		Recipes.init();
		FMLCommonHandler.instance().bus().register( new KeyInputEventHandler() );
		LogHelper.info( "Initialisation complete!" );
	}

	/**
	 * Do stuff after other mods load, etc.
	 */
	@EventHandler
	public void postInit( FMLPostInitializationEvent event ) {
		LogHelper.info( "Post-initialisation complete!" );
	}
}
