public class CoffeeVendingMachineDemo implements Runnable{
    public void run() {
        CoffeeMachine coffeeMachine = CoffeeMachine.getInstance();

        // Display coffee menu
        coffeeMachine.displayMenu();

        // Simulate user requests
        Coffee espresso = coffeeMachine.selectCoffee("Espresso");
        coffeeMachine.dispenseCoffee(espresso, new Payment(3.0));

        Coffee cappuccino = coffeeMachine.selectCoffee("Cappuccino");
        coffeeMachine.dispenseCoffee(cappuccino, new Payment(3.5));


        Coffee latte = coffeeMachine.selectCoffee("Latte");
        coffeeMachine.dispenseCoffee(latte, new Payment(4.0));
    }
    public static void main(String args[]){
        CoffeeVendingMachineDemo coffeeVendingMachineDemo = new CoffeeVendingMachineDemo();
        Thread t1 = new Thread(coffeeVendingMachineDemo);
        t1.start();
    }
}
