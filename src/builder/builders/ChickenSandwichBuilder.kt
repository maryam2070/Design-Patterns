package builder.builders

import builder.base.Builder
import builder.models.chicken.Bun
import builder.models.chicken.ChickenSandwich
import builder.models.chicken.FriedChicken
import builder.models.ingredients.Cheese
import builder.models.ingredients.Extras
import builder.models.ingredients.Sauce

interface ChickenSandwichBuilder : Builder<ChickenSandwich> {
    fun reset(): ChickenSandwichBuilder
    fun bun(bun: Bun): ChickenSandwichBuilder
    fun cheese(cheese: Cheese): ChickenSandwichBuilder
    fun sauce(sauce: Sauce): ChickenSandwichBuilder
    fun chicken(chicken: FriedChicken): ChickenSandwichBuilder
    fun extras(extras: List<Extras>): ChickenSandwichBuilder
    
    fun extras(vararg extras: Extras): ChickenSandwichBuilder = extras(extras.toList())
    
    override fun build(): ChickenSandwich
}
