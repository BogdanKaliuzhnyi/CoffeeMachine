package machine;
import machine.makingCoffee.*;
import machine.utils.ScannerUtil;

public class CoffeeMachine {

    public static void main(String[] args) {
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        setInitialData(coffeeMaker);
        action(coffeeMaker);
    }


    public static void setInitialData(CoffeeMaker coffeeMaker) {
        int initialWater = 400;
        //ScannerUtil.getAmountOfWater();
        coffeeMaker.setWater(initialWater);
        int initialMilk = 540;
        //ScannerUtil.getAmountOfMilk();
        coffeeMaker.setMilk(initialMilk);
        int initialCoffeeBeans = 120;
        //ScannerUtil.getAmountOfCoffeeBeans();
        coffeeMaker.setCoffeeBeans(initialCoffeeBeans);
        int initialCups = 9;
        coffeeMaker.setCups(initialCups);
        //ScannerUtil.getCups();
        int initialMoney = 550;
        coffeeMaker.setMoney(initialMoney);
    }

    public static void action(CoffeeMaker coffeeMaker) {
        boolean coffeeMachineRun = true;
        while (coffeeMachineRun) {
            String option = ScannerUtil.action();
            switch (option) {
                case "buy" -> {
                    Recipe chosen = null;
                    switch (ScannerUtil.getMenu()) {
                        case "1" -> chosen = new Espresso();
                        case "2" -> chosen = new Latte();
                        case "3" -> chosen = new Cappuccino();
                        case "back" -> {
                        }
                    }
                    if (chosen != null) {
                    coffeeMaker.setRecipe(chosen);
                    coffeeMaker.makeCoffee();
                    }
                }
                case "fill" -> {
                    fillingCoffeeMachine(coffeeMaker);
                }
                case "take" -> {
                    System.out.println("I gave you $" + coffeeMaker.getCurrentMoney());
                    coffeeMaker.takeMoney(0);
                }
                case "remaining" -> coffeeMaker.showCurrentIngredients();
                case "exit" -> coffeeMachineRun = false;
                default -> System.out.println("Wrong command");
            }
        }
    }

    public static void fillingCoffeeMachine(CoffeeMaker coffeeMaker) {
        int water = ScannerUtil.fillingWater();
        coffeeMaker.addWater(water);
        int milk = ScannerUtil.fillingMilk();
        coffeeMaker.addMilk(milk);
        int coffeeBeans = ScannerUtil.fillingCoffeeBeans();
        coffeeMaker.addCoffeeBeans(coffeeBeans);
        int cups = ScannerUtil.fillingCups();
        coffeeMaker.addCups(cups);
    }
}


