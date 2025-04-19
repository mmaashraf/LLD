package factory;

import java.util.ArrayList;
import java.util.List;

public class VeganMeal implements Meal {
    private int costOfMeal = 10;

    List<String> ls = new ArrayList<>();

    @Override
    public void addIngrd(String name) {
        // TODO Auto-generated method stub
        ls.add(name);
        this.costOfMeal++;
    }

    @Override
    public void removeIngrd(String name) {
        // TODO Auto-generated method stub
        this.ls.remove(name);
        this.costOfMeal--;
    }

    @Override
    public int getTotalCost() {
        // TODO Auto-generated method stub
        return this.costOfMeal;
    }

    @Override
    public String getIngrd() {
        return this.ls.toString();
    }

}
