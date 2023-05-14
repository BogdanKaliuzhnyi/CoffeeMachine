package machine;
import machine.makingCoffee.*;
import machine.utils.ScannerUtil;

public class CoffeeMachine {

    public static void main(String[] args) {
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        coffeeMaker.showCurrentIngredients();
        action(coffeeMaker);
    }

        /*
        int water = ScannerUtil.getAmountOfWater();
        coffeeMaker.setWater(water);
        int milk = ScannerUtil.getAmountOfMilk();
        coffeeMaker.setMilk(milk);
        int coffeeBeans = ScannerUtil.getAmountOfCoffeeBeans();
        coffeeMaker.setCoffeeBeans(coffeeBeans);
        int cups = ScannerUtil.getCups();
        */

    public static void action(CoffeeMaker coffeeMaker) {
        String option = ScannerUtil.action();
        Recipe espresso = new Espresso();
        Recipe cappuccino = new Cappuccino();
        Recipe latte = new Latte();
        switch (option) {
            case "buy" -> {
                switch (ScannerUtil.getMenu()) {
                    case 1 -> coffeeMaker.setRecipe(espresso);
                    case 2 -> coffeeMaker.setRecipe(latte);
                    case 3 -> coffeeMaker.setRecipe(cappuccino);
                }
                coffeeMaker.makeCoffee();
                coffeeMaker.showCurrentIngredients();
            }
            case "fill" -> {
                fillingCoffeeMachine(coffeeMaker);
                coffeeMaker.showCurrentIngredients();
            }
            case "take" -> {
                System.out.println("I gave you $" + coffeeMaker.getCurrentMoney());
                coffeeMaker.setMoney(0);
                coffeeMaker.showCurrentIngredients();
            }
            default -> {
                System.out.println("Wrong command");
            }
        }
    }

    public static void fillingCoffeeMachine(CoffeeMaker coffeeMaker) {
        int water = ScannerUtil.fillingWater();
        coffeeMaker.setWater(water);
        int milk = ScannerUtil.fillingMilk();
        coffeeMaker.setMilk(milk);
        int coffeeBeans = ScannerUtil.fillingCoffeeBeans();
        coffeeMaker.setCoffeeBeans(coffeeBeans);
        int cups = ScannerUtil.fillingCups();
        coffeeMaker.setCups(cups);
    }
}


