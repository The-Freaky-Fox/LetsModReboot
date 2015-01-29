package thefreakyfox.letsmodreboot.init;

import thefreakyfox.letsmodreboot.item.ItemLMRB;
import thefreakyfox.letsmodreboot.item.ItemMapleLeaf;
import thefreakyfox.letsmodreboot.lib.ModConstants;
import cpw.mods.fml.common.registry.GameRegistry;


@GameRegistry.ObjectHolder( ModConstants.MOD_ID )
public class ModItems {

	public static final ItemLMRB mapleLeaf = new ItemMapleLeaf();

	public static void init() {
		GameRegistry.registerItem( mapleLeaf, "mapleLeaf" );
	}

}
