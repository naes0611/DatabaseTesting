package VMSOptions;
import Main.VirtualMobileService;
import static Main.VirtualMobileService.running;

public class Loading {
    static boolean isDone=false;
    public static double bal = 100;
public static double LoadingProc() {
    
    bal = bal;
    
    boolean validInput = false;
    do {
        Helper.clearTerminal();
        System.out.println("================================");
        System.out.println("=        Loading System        =");
        System.out.println("================================");
        System.out.println("                                ");
        System.out.println("Enter 'exit' to exit "
                            + "loading system.\n");
        System.out.print("Enter load amount (1-2999): ");

        
        while (!validInput) {
            String input = Helper.getNextLine();

            if (input.equalsIgnoreCase("exit")) {
                
                Helper.exit();
                    isDone=true;
                    validInput=true;
                    Helper.clearTerminal();
                    VirtualMobileService.main(new String[0]);
            } else {
                try{
                    int loadAmount = Integer.parseInt(input); // converts string into int
                    if (loadAmount >= 1 && loadAmount <= 2999) {
                        bal += loadAmount;
                        System.out.println("Thank you, load processing please wait..");
                        Helper.delay(2000);
                        System.out.println("Your balance is now: " + bal);
                        Helper.delay(1000);
                        Helper.returning();
                        Helper.clearTerminal();
                        isDone=true;
                        validInput = true;
                        VirtualMobileService.main(new String[0]); 
                    } else {
                        System.out.print("Invalid input: Please enter a load amount (1-2999) or 'exit': ");
                    }
                } catch (NumberFormatException e) {
                    System.out.print("Invalid input: Please enter a load amount (1-2999) or 'exit': ");
                }
            }
        }
    } while (!isDone);
    return bal;
}
}