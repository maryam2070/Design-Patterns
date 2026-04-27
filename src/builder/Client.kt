package builder

import builder.builders.DefaultBurgerSandwichBuilder
import builder.builders.DefaultChickenSandwichBuilder
import builder.directors.BurgerDirector
import builder.directors.ChickenSandwichDirector
import builder.models.burger.BurgerTypes
import builder.models.chicken.ChickenSandwichTypes

class Client {
    fun run() {
        println("\n--- Builder Pattern: Burger ---")
        val burgerDirector = BurgerDirector(DefaultBurgerSandwichBuilder())
        val burger = burgerDirector.make(BurgerTypes.BBQ_BACON)
        println(burger)

        println("\n--- Builder Pattern: Chicken Sandwich ---")
        val chickenDirector = ChickenSandwichDirector(DefaultChickenSandwichBuilder())
        val chicken = chickenDirector.make(ChickenSandwichTypes.REGULAR)
        println(chicken)
    }
}
