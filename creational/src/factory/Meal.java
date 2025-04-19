// this will be the product interface that factory methods produce

package factory;

public interface Meal {
    void addIngrd(String name);
    void removeIngrd(String name);
    int getTotalCost();
    String getIngrd();
}