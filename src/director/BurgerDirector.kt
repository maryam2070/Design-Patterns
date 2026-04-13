package director

import builder.BurgerSandwichBuilder
import burger_sandwich.BurgerBun
import burger_sandwich.BurgerSandwich
import burger_sandwich.BurgerTypes
import burger_sandwich.Patty
import ingredients.Cheese
import ingredients.Extras
import ingredients.Sauce

class BurgerDirector(private var builder: BurgerSandwichBuilder) {

    fun make(type: BurgerTypes): BurgerSandwich {
        builder.reset()

        when (type) {
            BurgerTypes.CLASSIC -> {
                builder
                    .bun(BurgerBun.SESAME)
                    .patty(Patty.BEEF)
                    .cheese(Cheese.AMERICAN)
                    .sauce(Sauce.SPECIAL)
                    .extras(
                        Extras.LETTUCE,
                        Extras.TOMATO,
                        Extras.ONIONS,
                        Extras.PICKLES,
                    )
            }

            BurgerTypes.BBQ_BACON -> {
                builder
                    .bun(BurgerBun.BRIOCHE)
                    .patty(Patty.BEEF)
                    .cheese(Cheese.CHEDDAR)
                    .sauce(Sauce.BBQ)
                    .extras(
                        Extras.BACON,
                        Extras.ONIONS,
                        Extras.PICKLES,
                    )
            }

            BurgerTypes.VEGGIE -> {
                builder
                    .bun(BurgerBun.WHOLE_WHEAT)
                    .patty(Patty.VEGGIE)
                    .cheese(Cheese.SWISS)
                    .sauce(Sauce.MAYO)
                    .extras(
                        Extras.LETTUCE,
                        Extras.TOMATO,
                        Extras.MUSHROOMS,
                    )
            }
        }

        return builder.build()
    }
}

