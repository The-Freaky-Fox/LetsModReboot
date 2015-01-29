package thefreakyfox.letsmodreboot.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import thefreakyfox.letsmodreboot.lib.ModConstants;


public class BlockLMRB extends Block {

	public BlockLMRB( Material material ) {
		super( material );
	}

	public BlockLMRB() {
		this( Material.rock );
	}

	@Override
	public String getUnlocalizedName() {
		return String.format( "tile.%s%s", ModConstants.MOD_ID.toLowerCase() + ':',
				getUnwrappedUnlocalizedName( super.getUnlocalizedName() ) );
	}

	@Override
	public void registerBlockIcons( IIconRegister register ) {
		blockIcon = register.registerIcon( String.format( "%s", getUnwrappedUnlocalizedName( this.getUnlocalizedName() ) ) );
	}

	protected String getUnwrappedUnlocalizedName( String unlocalizedName ) {
		return unlocalizedName.substring( unlocalizedName.indexOf( '.' ) + 1 );
	}

}
