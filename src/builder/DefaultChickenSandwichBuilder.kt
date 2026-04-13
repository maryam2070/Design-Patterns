package builder

import chicken_sandwich.Bun
import chicken_sandwich.ChickenSandwich
import chicken_sandwich.FriedChicken
import ingredients.Cheese
import ingredients.Extras
import ingredients.Sauce

class DefaultChickenSandwichBuilder : ChickenSandwichBuilder {
    private var bun: Bun? = null
    private var cheese: Cheese? = null
    private var sauce: Sauce? = null
    private var chicken: FriedChicken? = null
    private var extras: List<Extras> = emptyList()

    override fun reset(): ChickenSandwichBuilder = apply {
        bun = null
        cheese = null
        sauce = null
        chicken = null
        extras = emptyList()
    }

    override fun bun(bun: Bun): ChickenSandwichBuilder = apply { this.bun = bun }
    override fun cheese(cheese: Cheese): ChickenSandwichBuilder = apply { this.cheese = cheese }
    override fun sauce(sauce: Sauce): ChickenSandwichBuilder = apply { this.sauce = sauce }
    override fun chicken(chicken: FriedChicken): ChickenSandwichBuilder = apply { this.chicken = chicken }
    override fun extras(extras: List<Extras>): ChickenSandwichBuilder = apply { this.extras = extras.toList() }

    override fun build(): ChickenSandwich {
        val builtBun = requireNotNull(bun) { "bun is required" }
        val builtChicken = requireNotNull(chicken) { "chicken is required" }

        return ChickenSandwich(
            bun = builtBun,
            chicken = builtChicken,
            cheese = cheese,
            sauce = sauce,
            extras = extras.toList(),
        )
    }
}

