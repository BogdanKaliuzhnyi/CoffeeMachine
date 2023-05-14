package machine.utils;

import java.util.Scanner;

public class ScannerUtil {
    static Scanner sc = new Scanner(System.in);
    public static int getAmountOfWater() {
        System.out.println("Write how many ml of water the coffee machine has:");
        return sc.nextInt();
    }
    public static int getAmountOfMilk() {
        System.out.println("Write how many ml of milk the coffee machine has:");
        return sc.nextInt();
    }

    public static int getAmountOfCoffeeBeans() {
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        return sc.nextInt();
    }

    public static int getCups() {
        System.out.println("Write how many cups of coffee you wil need:");
        return sc.nextInt();
    }

    public static String action() {
        System.out.println("Write action (buy, fill, take):");
        return sc.next();
    }

    public static int getMenu() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
        return sc.nextInt();
    }

    public static int fillingWater() {
        System.out.println("Write how many ml of water you want to add:");
        return sc.nextInt();
    }
    public static int fillingMilk() {
        System.out.println("Write how many ml of milk you want to add:");
        return sc.nextInt();
    }
    public static int fillingCoffeeBeans() {
        System.out.println("Write how many grams of coffee beans you want to add:");
        return sc.nextInt();
    }
    public static int fillingCups() {
        System.out.println("Write how many disposable cups you want to add:");
        return sc.nextInt();
    }
}
