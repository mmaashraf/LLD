// this will createMeal using the builder that is passed
package factory;

import builder.MealBuilder;

public interface AbstractMealFactory {
    Meal createMeal(MealBuilder builder);
}