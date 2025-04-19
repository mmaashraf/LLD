package builder;

import factory.Meal;
import factory.VeganMeal;

public class VeganMealBuilder implements MealBuilder {
    String mealType;
    Meal meal;
    @Override
    public Meal getProduct() {
        return this.meal;
    }

    @Override
    public void addIngreds(String name) {
        this.meal.addIngrd(name);
    }

    @Override
    public void removeIngreds(String name) {
        this.meal.removeIngrd(name);
    }

    @Override
    public int getTotalCost() {
        return this.meal.getTotalCost();
    }

    @Override
    public void reset() {
        this.meal = new VeganMeal();
    }

    @Override
    public void setMealType(String type) {
        this.mealType = new String(type);
    }
    
}
