package thefreakyfox.letsmodreboot.client.handler;

import thefreakyfox.letsmodreboot.client.settings.KeyBindings;
import thefreakyfox.letsmodreboot.lib.Key;
import thefreakyfox.letsmodreboot.util.LogHelper;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent.KeyInputEvent;


public class KeyInputEventHandler {

	private static Key getPressedKeybinding() {
		if ( KeyBindings.charge.isPressed() ) {
			return Key.CHARGE;
		} else if ( KeyBindings.release.isPressed() ) {
			return Key.RELEASE;
		}
		return Key.UNKNOWN;
	}

	@SubscribeEvent
	public void handleKeyInputEvent( KeyInputEvent event ) {
		LogHelper.info( getPressedKeybinding() );
	}

}
