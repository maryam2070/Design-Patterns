package builder.builders

import builder.models.chicken.Bun
import builder.models.chicken.ChickenSandwich
import builder.models.chicken.FriedChicken
import builder.models.ingredients.Cheese
import builder.models.ingredients.Extras
import builder.models.ingredients.Sauce

class DefaultChickenSandwichBuilder : ChickenSandwichBuilder {
    private var bun: Bun? = null
    private var chicken: FriedChicken? = null
    private var cheese: Cheese? = null
    private var sauce: Sauce? = null
    private var extras: List<Extras> = emptyList()

    override fun reset() = apply {
        bun = null
        chicken = null
        cheese = null
        sauce = null
        extras = emptyList()
    }

    override fun bun(bun: Bun) = apply { this.bun = bun }

    override fun chicken(chicken: FriedChicken) = apply { this.chicken = chicken }

    override fun cheese(cheese: Cheese) = apply { this.cheese = cheese }

    override fun sauce(sauce: Sauce) = apply { this.sauce = sauce }

    override fun extras(extras: List<Extras>) = apply { this.extras = extras.toList() }

    override fun build(): ChickenSandwich {
        val builtBun = requireNotNull(bun) { "bun is required" }
        val builtChicken = requireNotNull(chicken) { "chicken is required" }
        
        return ChickenSandwich(
            bun = builtBun,
            chicken = builtChicken,
            cheese = cheese,
            sauce = sauce,
            extras = extras
        )
    }
}
