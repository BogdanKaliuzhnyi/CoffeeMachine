package machine.makingCoffee;

public class Latte extends Recipe {
    final int WATER = 350;
    final int MILK = 75;
    final int BEANS = 20;
    final int PRICE = 7;

    public int getWater() {
        return WATER;
    }

    public int getMilk() {
        return MILK;
    }

    public int getCoffeeBeans() {
        return BEANS;
    }

    public int getPrice(){
        return PRICE;
    }
}
