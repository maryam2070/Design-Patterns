package builder.directors

import builder.builders.ChickenSandwichBuilder
import builder.models.chicken.Bun
import builder.models.chicken.ChickenSandwich
import builder.models.chicken.ChickenSandwichTypes
import builder.models.chicken.FriedChicken
import builder.models.ingredients.Cheese
import builder.models.ingredients.Extras
import builder.models.ingredients.Sauce

class ChickenSandwichDirector(private val builder: ChickenSandwichBuilder) {
    
    fun make(type: ChickenSandwichTypes): ChickenSandwich {
        builder.reset()
        return when (type) {
            ChickenSandwichTypes.SPICY -> makeSpicy()
            ChickenSandwichTypes.REGULAR -> makeRegular()
            ChickenSandwichTypes.DELUXE -> makeDeluxe()
        }
    }

    private fun makeSpicy(): ChickenSandwich {
        return builder
            .bun(Bun.JALAPENO_CHEESE)
            .chicken(FriedChicken.SPICY)
            .cheese(Cheese.PEPPER_JACK)
            .sauce(Sauce.SIRACHA)
            .extras(Extras.JALAPENOS, Extras.PICKLES)
            .build()
    }

    private fun makeRegular(): ChickenSandwich {
        return builder
            .bun(Bun.WHOLE_WHEAT)
            .chicken(FriedChicken.CLASSIC)
            .cheese(Cheese.CHEDDAR)
            .sauce(Sauce.MAYO)
            .extras(Extras.LETTUCE, Extras.TOMATO)
            .build()
    }

    private fun makeDeluxe(): ChickenSandwich {
        return builder
            .bun(Bun.BRIOCHE)
            .chicken(FriedChicken.GRILLED)
            .cheese(Cheese.SWISS)
            .sauce(Sauce.GARLIC_AIOLI)
            .extras(Extras.LETTUCE, Extras.TOMATO, Extras.BACON)
            .build()
    }
}
