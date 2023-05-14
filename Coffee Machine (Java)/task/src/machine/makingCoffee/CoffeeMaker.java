package machine.makingCoffee;

public class CoffeeMaker {

    Recipe recipe;
    int currentWater = 400;
    int currentMilk = 540;
    int currentCoffeeBeans = 120;
    int currentCups = 9;
    int currentMoney = 550;

    public int getCurrentMoney() {
        return currentMoney;
    }
    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public void setWater(int water) {
        this.currentWater += water;
    }

    public void setMilk(int milk) {
        this.currentMilk += milk;
    }

    public void setCoffeeBeans(int coffeeBeans) {
        this.currentCoffeeBeans += coffeeBeans;
    }

    public void setCups (int cups) {
        this.currentCups += cups;
    }

    public void setMoney () {
        this.currentMoney = 0;
    }

    public void checkIngredients(int cups) {
        int indeedWater = recipe.getWater();
        int indeedMilk = recipe.getMilk();
        int indeedBeans = recipe.getCoffeeBeans();

        int allowedWater = currentWater / indeedWater;
        int allowedMilk = currentMilk / indeedMilk;
        int allowedBeans = currentCoffeeBeans / indeedBeans;

        int allowedCups = Math.min(allowedBeans, Math.min(allowedMilk, allowedWater));

        if (allowedCups > 0 && currentCups > 0) {
            makeCoffee();
        ///// Piece of old stage start
        /*} else if (cups < allowCups) {
            System.out.println("Yes, I can make that amount of coffee (and even " +
                    (allowCups - cups) + " more than that)");*/
        ///// Piece of old stage end
        } else {
            System.out.println("Sorry, not enough ingredients.");
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
        currentCups--;
        currentWater -= recipe.getWater();
        currentMilk -= recipe.getMilk();
        currentCoffeeBeans -= recipe.getCoffeeBeans();
        currentMoney += recipe.getPrice();
    }
}

