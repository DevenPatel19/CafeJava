public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffeePrice = 2.5;
        double lattePrice = 3.5;
        double cappuccinoPrice = 3.0;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
        
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here
        
       // Cindhuri's order
        if (isReadyOrder1) {
            System.out.println(customer1 + readyMessage);
            System.out.println(displayTotalMessage + mochaPrice);
        } else {
            System.out.println(customer1 + pendingMessage);
        }

        // Noah's order
        if (isReadyOrder4) {
            System.out.println(customer4 + readyMessage);
            System.out.println(displayTotalMessage + cappuccinoPrice);
        } else {
            System.out.println(customer4 + pendingMessage);
        }

        // Sam's order
        int numLattesOrdered = 2;
        double totalAmount = lattePrice * numLattesOrdered;
        System.out.println(displayTotalMessage + totalAmount);

        if (isReadyOrder2) {
            System.out.println(customer2 + readyMessage);
        } else {
            System.out.println(customer2 + pendingMessage);
        }

        // Jimmy's order
        double coffeePrice = 2.5;
        double lattePriceCorrected = 4.5;
        double totalAmountJimmy = lattePriceCorrected - coffeePrice;
        System.out.println(displayTotalMessage + totalAmountJimmy);
    }
    }

