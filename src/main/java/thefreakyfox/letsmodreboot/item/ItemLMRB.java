package thefreakyfox.letsmodreboot.item;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import thefreakyfox.letsmodreboot.lib.ModConstants;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class ItemLMRB extends Item {

	public ItemLMRB() {
		super();
	}

	@Override
	public String getUnlocalizedName() {
		return String.format( "item.%s%s", ModConstants.MOD_ID.toLowerCase() + ':',
				getUnwrappedUnlocalizedName( super.getUnlocalizedName() ) );
	}

	@Override
	public String getUnlocalizedName( ItemStack p_77667_1_ ) {
		return String.format( "item.%s%s", ModConstants.MOD_ID.toLowerCase() + ':',
				getUnwrappedUnlocalizedName( super.getUnlocalizedName() ) );
	}

	protected String getUnwrappedUnlocalizedName( String unlocalizedName ) {
		return unlocalizedName.substring( unlocalizedName.indexOf( '.' ) + 1 );
	}

	@Override
	@SideOnly( Side.CLIENT )
	public void registerIcons( IIconRegister register ) {
		itemIcon = register.registerIcon( getUnlocalizedName().substring( getUnlocalizedName().indexOf( '.' ) + 1 ) );
	}
}
