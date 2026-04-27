package builder.models.burger

import builder.base.Product
import builder.models.ingredients.*

data class BurgerSandwich(
    val bun: BurgerBun,
    val patty: Patty,
    val cheese: Cheese? = null,
    val sauce: Sauce? = null,
    val extras: List<Extras> = emptyList(),
) : Product
