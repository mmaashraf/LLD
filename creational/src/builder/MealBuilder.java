/*

this will be builder, that is responsible for assembling ingredients and returning a product, 
that is of type Meal
It should defines the common methods that are needed to construct the product
-- 

the concrete implementation of this interface should take of instance creating, reset, and return
*/

package builder;

import factory.Meal;

public interface MealBuilder {
    Meal getProduct();
    void addIngreds(String name);
    void removeIngreds(String name);
    int getTotalCost();
    void reset();
    void setMealType(String type);
}