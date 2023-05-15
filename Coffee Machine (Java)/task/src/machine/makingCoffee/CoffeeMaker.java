package machine.makingCoffee;

public class CoffeeMaker {

    Recipe recipe;
    int currentWater;
    int currentMilk;
    int currentCoffeeBeans;
    int currentCups;
    int currentMoney;

    public int getCurrentMoney() {
        return currentMoney;
    }
    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public void setWater(int water) {
        this.currentWater = water;
    }

    public void setMilk(int milk) {
        this.currentMilk = milk;
    }

    public void setCoffeeBeans(int coffeeBeans) {
        this.currentCoffeeBeans = coffeeBeans;
    }

    public void setCups (int cups) {
        this.currentCups = cups;
    }

    public void setMoney (int money) {
        this.currentMoney = money;
    }
    public void addWater (int water) {
        this.currentWater += water;
    }

    public void addMilk (int milk) {
        this.currentMilk += milk;
    }
    public void addCoffeeBeans (int coffeeBeans) {
        this.currentCoffeeBeans += coffeeBeans;
    }
    public void addCups (int cups) {
        this.currentCups += cups;
    }
    public void takeMoney(int money) {
        this.currentMoney = money;
    }

    public boolean checkIngredients() {
        return checkRequiredWater() &&
                checkRequiredMilk() &&
                checkRequiredCoffeeBeans() &&
                checkRequiredCups();
    }

    public boolean checkRequiredWater() {
        if (currentWater > recipe.getWater()) {
            return true;
        } else {
            System.out.println("Sorry, not enough water!");
            return false;
        }
    }

    public boolean checkRequiredMilk() {
        if (currentWater > recipe.getMilk()) {
            return true;
        } else {
            System.out.println("Sorry, not enough milk!");
            return false;
        }
    }

    public boolean checkRequiredCoffeeBeans() {
        if (currentCoffeeBeans > recipe.getCoffeeBeans()) {
            return true;
        } else {
            System.out.println("Sorry, not enough coffee beans!");
            return false;
        }
    }

    public boolean checkRequiredCups() {
        if (currentCups > 0) {
            return true;
        } else {
            System.out.println("Sorry, not enough disposable cups!");
            return false;
        }

    }
    public void showCurrentIngredients() {
        System.out.printf("""
                        The coffee machine has:
                        %d ml of water
                        %d ml of milk
                        %d g of coffee beans
                        %d disposable cups
                        $%d of money""",
                currentWater, currentMilk, currentCoffeeBeans, currentCups, currentMoney);
    }

    public void makeCoffee() {
        if (!checkIngredients()) {
            return;
        }
            System.out.println("I have enough resources, making you a coffee!");
            currentCups--;
            currentWater -= recipe.getWater();
            currentMilk -= recipe.getMilk();
            currentCoffeeBeans -= recipe.getCoffeeBeans();
            currentMoney += recipe.getPrice();
    }
}

