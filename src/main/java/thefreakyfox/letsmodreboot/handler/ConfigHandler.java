package thefreakyfox.letsmodreboot.handler;

import java.io.File;

import net.minecraftforge.common.config.Configuration;
import thefreakyfox.letsmodreboot.lib.ModConstants;
import cpw.mods.fml.client.event.ConfigChangedEvent.OnConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;


public class ConfigHandler {

	public static Configuration config;
	public static boolean testValue = false;

	public static void init( File configFile ) {
		// Create the configuration object from the given configuration file
		if ( config == null ) {
			config = new Configuration( configFile );
			loadConfig();
		}
	}

	private static void loadConfig() {
		testValue = config.getBoolean( "configValue", Configuration.CATEGORY_GENERAL, true,
				"This is an example config value" );

		if ( config.hasChanged() ) {
			config.save();
		}
	}

	@SubscribeEvent
	public void onConfigurationChangedEvent( OnConfigChangedEvent event ) {
		if ( event.modID.equalsIgnoreCase( ModConstants.MOD_ID ) ) {
			loadConfig();
		}
	}
}
