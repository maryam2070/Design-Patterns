package director

import builder.ChickenSandwichBuilder
import chicken_sandwich.Bun
import chicken_sandwich.ChickenSandwich
import chicken_sandwich.ChickenSandwichTypes
import chicken_sandwich.FriedChicken
import ingredients.Cheese
import ingredients.Extras
import ingredients.Sauce

class ChickenSandwichDirector(private var builder: ChickenSandwichBuilder) {


    fun changeBuilder(builder: ChickenSandwichBuilder) {
        this.builder = builder
    }

    fun make(type: ChickenSandwichTypes): ChickenSandwich {
        builder.reset()

        when (type) {
            ChickenSandwichTypes.SPICY -> {
                builder
                    .bun(Bun.JALAPENO_CHEESE)
                    .chicken(FriedChicken.SPICY)
                    .cheese(Cheese.PEPPER_JACK)
                    .sauce(Sauce.SIRACHA)
                    .extras(
                        Extras.JALAPENOS,
                        Extras.PICKLES,
                        Extras.CRISPY_ONIONS,
                    )
            }
            ChickenSandwichTypes.PESTO -> {
                builder
                    .bun(Bun.PARMESAN_OREGANO)
                    .chicken(FriedChicken.CLASSIC)
                    .cheese(Cheese.MOZZARELLA)
                    .sauce(Sauce.GARLIC_AIOILI)
                    .extras(
                        Extras.TOMATO,
                        Extras.OLIVES,
                        Extras.PEPPERS,
                    )
            }
            ChickenSandwichTypes.REGULAR -> {
                builder
                    .bun(Bun.WHOLE_WHEAT)
                    .chicken(FriedChicken.CLASSIC)
                    .cheese(Cheese.AMERICAN)
                    .sauce(Sauce.MAYO)
                    .extras(
                        Extras.LETTUCE,
                        Extras.TOMATO,
                        Extras.ONIONS,
                    )
            }
        }

        return builder.build()
    }
}