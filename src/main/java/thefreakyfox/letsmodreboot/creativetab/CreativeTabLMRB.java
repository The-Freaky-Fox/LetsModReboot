package thefreakyfox.letsmodreboot.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import thefreakyfox.letsmodreboot.init.ModItems;
import thefreakyfox.letsmodreboot.lib.ModConstants;


public class CreativeTabLMRB {

	public static final CreativeTabs LMRB_TAB = new CreativeTabs( ModConstants.MOD_ID ) {

		@Override
		public Item getTabIconItem() {
			return ModItems.mapleLeaf;
		}

		@Override
		public String getTranslatedTabLabel() {
			return "Let's Mod Reboot";
		};
	};
}
