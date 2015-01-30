package thefreakyfox.letsmodreboot.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import cpw.mods.fml.common.registry.GameRegistry;


public class Recipes {

	public static void init() {
		// GameRegistry.addRecipe( new ItemStack( ModItems.mapleLeaf ), " s ", "sss", " s ", 's',
		// new ItemStack( Items.stick ) );
		GameRegistry.addRecipe( new ShapedOreRecipe( new ItemStack( ModItems.mapleLeaf ), " s ", "sss", " s ", 's',
				"stickWood" ) );
		// GameRegistry.addShapelessRecipe( new ItemStack( ModBlocks.flag ), new ItemStack(
		// ModItems.mapleLeaf ),
		// new ItemStack( ModItems.mapleLeaf ) );
		GameRegistry.addRecipe( new ShapelessOreRecipe( new ItemStack( ModBlocks.flag ),
				new ItemStack( ModItems.mapleLeaf ), new ItemStack( ModItems.mapleLeaf ) ) );
	}

}
