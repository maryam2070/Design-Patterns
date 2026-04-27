package builder.builders

import builder.base.Builder
import builder.models.burger.BurgerBun
import builder.models.burger.BurgerSandwich
import builder.models.burger.Patty
import builder.models.ingredients.Cheese
import builder.models.ingredients.Extras
import builder.models.ingredients.Sauce

interface BurgerSandwichBuilder : Builder<BurgerSandwich> {
    fun reset(): BurgerSandwichBuilder
    fun bun(bun: BurgerBun): BurgerSandwichBuilder
    fun patty(patty: Patty): BurgerSandwichBuilder
    fun cheese(cheese: Cheese): BurgerSandwichBuilder
    fun sauce(sauce: Sauce): BurgerSandwichBuilder
    fun extras(extras: List<Extras>): BurgerSandwichBuilder
    
    fun extras(vararg extras: Extras): BurgerSandwichBuilder = extras(extras.toList())
    
    override fun build(): BurgerSandwich
}
