package chicken_sandwich

import builder.Product
import ingredients.Cheese
import ingredients.Extras
import ingredients.Sauce

data class ChickenSandwich(
    val bun: Bun,
    val chicken: FriedChicken,
    val cheese: Cheese? = null,
    val sauce: Sauce? = null,
    val extras: List<Extras> = emptyList(),
) : Product

