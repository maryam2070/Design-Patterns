package builder

import burger_sandwich.BurgerBun
import burger_sandwich.BurgerSandwich
import burger_sandwich.Patty
import ingredients.Cheese
import ingredients.Extras
import ingredients.Sauce

class DefaultBurgerSandwichBuilder : BurgerSandwichBuilder {
    private var bun: BurgerBun? = null
    private var patty: Patty? = null
    private var cheese: Cheese? = null
    private var sauce: Sauce? = null
    private var extras: List<Extras> = emptyList()

    override fun reset(): BurgerSandwichBuilder = apply {
        bun = null
        patty = null
        cheese = null
        sauce = null
        extras = emptyList()
    }

    override fun bun(bun: BurgerBun): BurgerSandwichBuilder = apply { this.bun = bun }
    override fun patty(patty: Patty): BurgerSandwichBuilder = apply { this.patty = patty }
    override fun cheese(cheese: Cheese): BurgerSandwichBuilder = apply { this.cheese = cheese }
    override fun sauce(sauce: Sauce): BurgerSandwichBuilder = apply { this.sauce = sauce }
    override fun extras(extras: List<Extras>): BurgerSandwichBuilder = apply { this.extras = extras.toList() }

    override fun build(): BurgerSandwich {
        val builtBun = requireNotNull(bun) { "bun is required" }
        val builtPatty = requireNotNull(patty) { "patty is required" }

        return BurgerSandwich(
            bun = builtBun,
            patty = builtPatty,
            cheese = cheese,
            sauce = sauce,
            extras = extras.toList(),
        )
    }
}

