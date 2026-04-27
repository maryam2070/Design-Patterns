package builder.builders

import builder.models.burger.BurgerBun
import builder.models.burger.BurgerSandwich
import builder.models.burger.Patty
import builder.models.ingredients.Cheese
import builder.models.ingredients.Extras
import builder.models.ingredients.Sauce

class DefaultBurgerSandwichBuilder : BurgerSandwichBuilder {
    private var bun: BurgerBun = BurgerBun.SESAME
    private var patty: Patty = Patty.BEEF
    private var cheese: Cheese? = null
    private var sauce: Sauce? = null
    private var extras: MutableList<Extras> = mutableListOf()

    override fun reset(): BurgerSandwichBuilder {
        bun = BurgerBun.SESAME
        patty = Patty.BEEF
        cheese = null
        sauce = null
        extras = mutableListOf()
        return this
    }

    override fun bun(bun: BurgerBun): BurgerSandwichBuilder {
        this.bun = bun
        return this
    }

    override fun patty(patty: Patty): BurgerSandwichBuilder {
        this.patty = patty
        return this
    }

    override fun cheese(cheese: Cheese): BurgerSandwichBuilder {
        this.cheese = cheese
        return this
    }

    override fun sauce(sauce: Sauce): BurgerSandwichBuilder {
        this.sauce = sauce
        return this
    }

    override fun extras(extras: List<Extras>): BurgerSandwichBuilder {
        this.extras.addAll(extras)
        return this
    }

    override fun build(): BurgerSandwich {
        return BurgerSandwich(bun, patty, cheese, sauce, extras)
    }
}
