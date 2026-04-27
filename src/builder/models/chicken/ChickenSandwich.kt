package builder.models.chicken

import builder.base.Product
import builder.models.ingredients.*

data class ChickenSandwich(
    val bun: Bun,
    val chicken: FriedChicken,
    val cheese: Cheese? = null,
    val sauce: Sauce? = null,
    val extras: List<Extras> = emptyList(),
) : Product
