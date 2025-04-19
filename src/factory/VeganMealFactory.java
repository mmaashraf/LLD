package factory;

import builder.MealBuilder;

public class VeganMealFactory implements AbstractMealFactory{

    @Override
    public Meal createMeal(MealBuilder builder) {
        // using the builder to reset ,and then add addIngreds and return the product
        builder.reset();
        builder.setMealType("Vegan");
        builder.addIngreds("Lettuce");
        builder.addIngreds("Tofu");
        builder.addIngreds("Tomato");
        builder.addIngreds("Spinach");
        return builder.getProduct();
    }
    
}
