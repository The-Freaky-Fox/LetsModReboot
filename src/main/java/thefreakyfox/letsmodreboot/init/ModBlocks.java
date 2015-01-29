package thefreakyfox.letsmodreboot.init;

import thefreakyfox.letsmodreboot.block.BlockFlag;
import thefreakyfox.letsmodreboot.block.BlockLMRB;
import thefreakyfox.letsmodreboot.lib.ModConstants;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder( ModConstants.MOD_ID )
public class ModBlocks {

	public static final BlockLMRB flag = new BlockFlag();

	public static void init() {
		GameRegistry.registerBlock( flag, "flag" );
	}

}
