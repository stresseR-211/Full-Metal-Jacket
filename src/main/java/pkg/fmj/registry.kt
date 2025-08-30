package pkg.fmj.registry
import org.bukkit.NamespacedKey
enum class AFFECT {
	STAMINA, FATIGUE, DEHYDRATION, HYPOTHERMIA, HYPERTHERMIA, BLEEDING
};
enum class MATERIAL {
	WOOD, STONE, COPPER, IRON, STEEL, GOLD, DIAMOND, NETHERITE, EMERALD, RUBY
};
enum class ITEM {
	SALT,
	SALTED_WATER_BOTTLE,
	SALTED_BREAD,
	SALTED_CARROT,
	SALTED_BAKED_POTATO,
	SALTED_BEETROOT_SOUP, 
	SALTED_MUSHROOM_STEW,
	SALTED_RABBIT_STEW,
	SALTED_COOKED_CHICKEN,
	SALTED_COOKED_MUTTON,
	SALTED_COOKED_PORKCHOP,
	SALTED_COOKED_RABBIT,
	SALTED_STEAK,
	SALTED_COOKED_ROD,
	SALTED_COOKED_SALMON,
	OMELETTE,
	SALTED_OMELETTE,
	FLOUR;
	enum class CURRENCY {
		YEN, /* white */ 
		POUND, /* light grey */
		SHILLING, /* grey */
		UNIDENTIFIED, /* black */
		FORINT, /* brown */
		YUAN, /* red */
		PESO, /* orange */
		EURO, /* yellow */
		REAL, /* lime */
		DOLLAR, /* green */
		SHEKEL, /* cyan */
		ROUBLE, /* light blue */
		FRANC, /* blue */
		DINAR, /* purple */
		DEUTSCHEMARK, /* magenta */
		RUPEE /* pink*/
	};
	object INGOT {
		infix fun with(MATERIAL m) = ItemKind("ingot", m);
	}
	object COIN {
		infix fun with(MATERIAL m) = ItemKind("coin", m);
	}
	object KNIFE {
		infix fun with(MATERIAL m) = ItemKind("knife", m);
	}
}
data class ItemKind(val category: String, val material: MATERIAL): Enum<Nothing>;
val reg: Map<Enum<*>, NamespacedKey> = mapOf(
	AFFECT.STAMINA to NamespacedKey("fmj", "stamina"),
	AFFECT.FATIGUE to NamespacedKey("fmj", "fatigue"),
	AFFECT.DEHYDRATION to NamespacedKey("fmj", "dehydration"),
	AFFECT.HYPOTHERMIA to NamespacedKey("fmj", "hypothermia"),
	AFFECT.HYPERTHERMIA to NamespacedKey("fmj", "hyperthermia"),
	AFFECT.BLEEDING to NamespacedKey("fmj", "bleeding"),
	ITEM.SALT to NamespacedKey("fmj", "salt"),
	ITEM.SALTED_WATER_BOTTLE to NamespacedKey("fmj", "salted_water_bottle"),
	ITEM.SALTED_BREAD to NamespacedKey("fmj", "salted_bread"),
	ITEM.SALTED_CARROT to NamespacedKey("fmj", "salted_carrot"),
	ITEM.SALTED_BAKED_POTATO to NamespacedKey("fmj", "salted_baked_potato"),
	ITEM.SALTED_BEETROOT_SOUP to NamespacedKey("fmj", "salted_beetroot_soup"),
	ITEM.SALTED_MUSHROOM_STEW to NamespacedKey("fmj", "salted_mushroom_stew"),
	ITEM.SALTED_RABBIT_STEW to NamespacedKey("fmj", "salted_rabbit_stew"),
	ITEM.SALTED_COOKED_CHICKEN to NamespacedKey("fmj", "salted_cooked_chicken"),
	ITEM.SALTED_COOKED_MUTTON to NamespacedKey("fmj", "salted_cooked_mutton"),
	ITEM.SALTED_COOKED_PORKCHOP to NamespacedKey("fmj", "salted_cooked_porkchop"),
	ITEM.SALTED_COOKED_RABBIT to NamespacedKey("fmj", "salted_cooked_rabbit"),
	ITEM.SALTED_STEAK to NamespacedKey("fmj", "salted_steak"),
	ITEM.SALTED_COOKED_ROD to NamespacedKey("fmj", "salted_cooked_rod"),
	ITEM.SALTED_COOKED_SALMON to NamespacedKey("fmj", "salted_cooked_salmon"),
	ITEM.OMELETTE to NamespacedKey("fmj", "omelette"),
	ITEM.SALTED_OMELETTE to NamespacedKey("fmj", "salted_omelette"),
	ITEM.FLOUR to NamespacedKey("fmj", "flour"),
	ITEM.INGOT with MATERIAL.STEEL to NamespacedKey("fmj", "steel_ingot"),
	ITEM.CURRENCY.YEN to NamespacedKey("fmj", "yen"),
	ITEM.CURRENCY.POUND to NamespacedKey("fmj", "pound"),
	ITEM.CURRENCY.SHILLING to NamespacedKey("fmj", "shilling"),
	ITEM.CURRENCY.UNIDENTIFIED to NamespacedKey("fmj", "unidentified_currency"),
	ITEM.CURRENCY.FORINT to NamespacedKey("fmj", "forint"),
	ITEM.CURRENCY.YUAN to NamespacedKey("fmj", "yuan"),
	ITEM.CURRENCY.PESO to NamespacedKey("fmj", "peso"),
	ITEM.CURRENCY.EURO to NamespacedKey("fmj", "euro"),
	ITEM.CURRENCY.REAL to NamespacedKey("fmj", "real"),
	ITEM.CURRENCY.DOLLAR to NamespacedKey("fmj", "dollar"),
	ITEM.CURRENCY.SHEKEL to NamespacedKey("fmj", "shekel"),
	ITEM.CURRENCY.ROUBLE to NamespacedKey("fmj", "rouble"),
	ITEM.CURRENCY.FRANC to NamespacedKey("fmj", "franc"),
	ITEM.CURRENCY.DINAR to NamespacedKey("fmj", "dinar"),
	ITEM.CURRENCY.DEUTSCHEMARK to NamespacedKey("fmj", "deutschemark"),
	ITEM.CURRENCY.RUPEE to NamespacedKey("fmj", "rupee"),
	ITEM.COIN with MATERIAL.COPPER to NamespacedKey("fmj", "coppern_coin"),
	ITEM.COIN with MATERIAL.IRON to NamespacedKey("fmj", "iron_coin"),
	ITEM.COIN with MATERIAL.STEEL to NamespacedKey("fmj", "steel_coin"),
	ITEM.COIN with MATERIAL.GOLD to NamespacedKey("fmj", "golden_coin"),
	ITEM.KNIFE with MATERIAL.WOOD to NamespacedKey("fmj", "wooden_knife"),
	ITEM.KNIFE with MATERIAL.STONE to NamespacedKey("fmj", "stonen_knife"),
	ITEM.KNIFE with MATERIAL.COPPER to NamespacedKey("fmj", "coppern_knife"),
	ITEM.KNIFE with MATERIAL.IRON to NamespacedKey("fmj", "iron_knife"),
	ITEM.KNIFE with MATERIAL.STEEL to NamespacedKey("fmj", "steel_knife"),
	ITEM.KNIFE with MATERIAL.GOLD to NamespacedKey("fmj", "golden_knife"),
	ITEM.KNIFE with MATERIAL.DIAMOND to NamespacedKey("fmj", "diamond_knife"),
	ITEM.KNIFE with MATERIAL.NETHERITE to NamespacedKey("fmj", "netherite_knife"),
	ITEM.KNIFE with MATERIAL.EMERALD to NamespacedKey("fmj", "emerald_knife"),
	ITEM.KNIFE with MATERIAL.RUBY to NamespacedKey("fmj", "ruby_knife"),
);