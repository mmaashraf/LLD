package client;

import builder.VeganMealBuilder;
import factory.Meal;
import factory.VeganMealFactory;

public class Client {
    public static void main(String[] args) {
        // instantiate a vegan builder and passes that to the vegan factory
        VeganMealBuilder vmb = new VeganMealBuilder();
        VeganMealFactory vmf = new VeganMealFactory();
        Meal meal = vmf.createMeal(vmb);
        
        System.out.println("meal created " + meal.getTotalCost() + " meal ingrd " + meal.getIngrd());

        // it can be customized further if needed, the difference is now the interaction is with the meal product not the builder
        
    }
}
