package builder.directors

import builder.builders.BurgerSandwichBuilder
import builder.models.burger.BurgerBun
import builder.models.burger.BurgerSandwich
import builder.models.burger.BurgerTypes
import builder.models.burger.Patty
import builder.models.ingredients.Cheese
import builder.models.ingredients.Extras
import builder.models.ingredients.Sauce

class BurgerDirector(private val builder: BurgerSandwichBuilder) {
    fun make(type: BurgerTypes): BurgerSandwich {
        return when (type) {
            BurgerTypes.CLASSIC -> makeClassic()
            BurgerTypes.CHEESEBURGER -> makeCheeseburger()
            BurgerTypes.BBQ_BACON -> makeBBQBacon()
            BurgerTypes.VEGGIE_DELIGHT -> makeVeggieDelight()
        }
    }

    private fun makeClassic(): BurgerSandwich {
        return builder.reset()
            .bun(BurgerBun.SESAME)
            .patty(Patty.BEEF)
            .sauce(Sauce.KETCHUP)
            .extras(Extras.LETTUCE, Extras.TOMATO, Extras.ONION, Extras.PICKLES)
            .build()
    }

    private fun makeCheeseburger(): BurgerSandwich {
        return builder.reset()
            .bun(BurgerBun.SESAME)
            .patty(Patty.BEEF)
            .cheese(Cheese.CHEDDAR)
            .sauce(Sauce.KETCHUP)
            .extras(Extras.PICKLES)
            .build()
    }

    private fun makeBBQBacon(): BurgerSandwich {
        return builder.reset()
            .bun(BurgerBun.BRIOCHE)
            .patty(Patty.BEEF)
            .cheese(Cheese.CHEDDAR)
            .sauce(Sauce.BBQ)
            .extras(Extras.BACON, Extras.ONION)
            .build()
    }

    private fun makeVeggieDelight(): BurgerSandwich {
        return builder.reset()
            .bun(BurgerBun.WHOLE_WHEAT)
            .patty(Patty.VEGGIE)
            .cheese(Cheese.SWISS)
            .sauce(Sauce.MAYONNAISE)
            .extras(Extras.LETTUCE, Extras.TOMATO, Extras.AVOCADO)
            .build()
    }
}
