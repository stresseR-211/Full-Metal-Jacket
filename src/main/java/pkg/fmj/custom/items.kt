package pkg.fmj.custom
import org.bukkit.Material
import org.bukkit.inventory.ItemStack
import org.bukkit.inventory.Recipe
import org.bukkit.inventory.ShapelessRecipe
import pkg.fmj.registry.reg as Registry
fun <out T> setRecipe(recipe: Recipe, setup: (T)->Unit): Recipe {
	setup(recipe);
	return recipe;
}

val item: List<Recipe> = listOf(
	setRecipe<ShapelessRecipe> {
		rgrtyuihyrtgfcdvg //biscuits
	},
	ShapelessRecipe(Registry[ITEM.COIN with MATERIAL.COPPER], ItemStack(Material.GOLD_NUGGET))
	ShapelessRecipe(Registry[ITEM.COIN with MATERIAL.IRON], ItemStack(Material.GOLD_NUGGET)),
	ShapelessRecipe(Registry[ITEM.COIN with MATERIAL.STEEL], ItemStack(Material.GOLD_NUGGET)),
	ShapelessRecipe(Registry[ITEM.COIN with MATERIAL.GOLD], ItemStack(Material.GOLD_NUGGET))
);



/*import org.bukkit.Material
import org.bukkit.NamespacedKey
import org.bukkit.inventory.ItemStack
import org.bukkit.inventory.ShapedRecipe
import org.bukkit.Bukkit
class FMJ {
	fun test() {
		val key = NamespacedKey("fmj", "warrior_sword");
		val item = ItemStack(Material.SUGAR);
		val recipe = ShapedRecipe(key, item);
		recipe.shape(" A ", "AAA", " B ");
		recipe.setIngredient('A', Material.SUGAR);
		recipe.setIngredient('B', Material.STICK);
		Bukkit.getServer().addRecipe(recipe);
	}
}*/