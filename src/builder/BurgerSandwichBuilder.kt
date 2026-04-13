package builder

import burger_sandwich.BurgerBun
import burger_sandwich.BurgerSandwich
import burger_sandwich.Patty
import ingredients.Cheese
import ingredients.Extras
import ingredients.Sauce

interface BurgerSandwichBuilder : Builder<BurgerSandwich> {
    fun reset(): BurgerSandwichBuilder

    fun bun(bun: BurgerBun): BurgerSandwichBuilder
    fun patty(patty: Patty): BurgerSandwichBuilder
    fun cheese(cheese: Cheese): BurgerSandwichBuilder
    fun sauce(sauce: Sauce): BurgerSandwichBuilder
    fun extras(extras: List<Extras>): BurgerSandwichBuilder

    fun extras(vararg extras: Extras): BurgerSandwichBuilder =
        extras(extras.toList())

    override fun build(): BurgerSandwich
}

