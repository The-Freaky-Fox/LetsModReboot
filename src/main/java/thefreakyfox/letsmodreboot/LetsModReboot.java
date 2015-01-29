package thefreakyfox.letsmodreboot;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod( modid = "LetsModReboot", name = "LetsModReboot", version = "1.7.10-1.0" )
public class LetsModReboot {


	@Instance( "LetsModReboot" )
	public static LetsModReboot instance;

	/**
	 * Load network handlers, config, blocks and items
	 */
	@EventHandler
	public void preInit( FMLPreInitializationEvent event ) {}

	/**
	 * Register GUIs, tile entities, crafting recipes and general event handlers
	 */
	@EventHandler
	public void init( FMLInitializationEvent event ) {}

	/**
	 * Do stuff after other mods load, etc.
	 */
	@EventHandler
	public void postInit( FMLPostInitializationEvent event ) {}
}
