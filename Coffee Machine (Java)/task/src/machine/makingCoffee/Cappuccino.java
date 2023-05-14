package machine.makingCoffee;

public class Cappuccino extends Recipe {
    final int WATER = 200;
    final int MILK = 100;
    final int BEANS = 12;
    final int CUPS = 1;
    final int PRICE = 6;

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
