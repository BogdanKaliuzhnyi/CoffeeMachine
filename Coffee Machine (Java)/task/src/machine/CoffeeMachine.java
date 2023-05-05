package machine;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cups;
        final int WATER = 200;
        final int MILK = 50;
        final int BEANS = 15;
        /*System.out.println("""
                Starting to make a coffee
                Grinding coffee beans
                Boiling water
              / Mixing boiled water with crushed coffee beans
                Pouring coffee into the cup
                Pouring some milk into the cup
                Coffee is ready!"""); */
        System.out.println("Write how many cups of coffee you will need:");
        cups = sc.nextInt();
        System.out.printf("""
                For %d cups of coffee you will need:
                %d ml of water
                %d ml of milk
                %d g of coffee beans""", cups, WATER * cups, MILK * cups, BEANS * cups);

    }
}
