package machine.makingCoffee;

public class Espresso extends Recipe {

    final int WATER = 250;
    final int MILK = 0;
    final int BEANS = 16;
    final int PRICE = 4;

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
