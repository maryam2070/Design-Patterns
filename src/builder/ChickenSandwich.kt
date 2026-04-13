package builder

import chicken_sandwich.Bun
import chicken_sandwich.FriedChicken
import chicken_sandwich.ChickenSandwich
import ingredients.Cheese
import ingredients.Extras
import ingredients.Sauce

/**
 * Builder interface (GoF-style) for constructing [ChickenSandwich] step-by-step.
 * ChickenSandwichDirector depends on this interface, not a concrete builder.
 */
interface ChickenSandwichBuilder : Builder<ChickenSandwich> {
    fun reset(): ChickenSandwichBuilder

    fun bun(bun: Bun): ChickenSandwichBuilder
    fun cheese(cheese: Cheese): ChickenSandwichBuilder
    fun sauce(sauce: Sauce): ChickenSandwichBuilder
    fun chicken(chicken: FriedChicken): ChickenSandwichBuilder
    fun extras(extras: List<Extras>): ChickenSandwichBuilder

    fun extras(vararg extras: Extras): ChickenSandwichBuilder =
        extras(extras.toList())

    override fun build(): ChickenSandwich
}

