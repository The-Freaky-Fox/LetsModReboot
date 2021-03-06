package thefreakyfox.letsmodreboot.client.gui;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import thefreakyfox.letsmodreboot.handler.ConfigHandler;
import thefreakyfox.letsmodreboot.lib.ModConstants;
import cpw.mods.fml.client.config.GuiConfig;


public class ModGuiConfig extends GuiConfig {

	public ModGuiConfig( GuiScreen guiScreen ) {
		super( guiScreen, new ConfigElement( ConfigHandler.config.getCategory( Configuration.CATEGORY_GENERAL ) )
				.getChildElements(), ModConstants.MOD_ID, false, false, GuiConfig
				.getAbridgedConfigPath( ConfigHandler.config.toString() ) );
	}
}
