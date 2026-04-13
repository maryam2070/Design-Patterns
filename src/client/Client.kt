package client

import builder.DefaultBurgerSandwichBuilder
import builder.DefaultChickenSandwichBuilder
import director.BurgerDirector
import director.ChickenSandwichDirector
import burger_sandwich.BurgerTypes
import chicken_sandwich.ChickenSandwichTypes

class Client {
    fun run() {
        val chickenDirector = ChickenSandwichDirector(DefaultChickenSandwichBuilder())

            val sandwich = chickenDirector.make(ChickenSandwichTypes.SPICY)
            println(sandwich)

        val burgerDirector = BurgerDirector(DefaultBurgerSandwichBuilder())
            val burger = burgerDirector.make(BurgerTypes.BBQ_BACON)
            println(burger)

    }
}

