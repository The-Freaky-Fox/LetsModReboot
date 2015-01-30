package thefreakyfox.letsmodreboot.client.settings;

import net.minecraft.client.settings.KeyBinding;

import org.lwjgl.input.Keyboard;

import thefreakyfox.letsmodreboot.lib.Names;


public class KeyBindings {

	public static KeyBinding charge = new KeyBinding( Names.Keys.CHARGE, Keyboard.KEY_C, Names.Keys.CATEGORY );
	public static KeyBinding release = new KeyBinding( Names.Keys.RELEASE, Keyboard.KEY_R, Names.Keys.CATEGORY );

}
