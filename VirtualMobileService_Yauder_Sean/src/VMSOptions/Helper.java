package VMSOptions;

import Main.VirtualMobileService;
import static Main.VirtualMobileService.*;


public class Helper {
    //clearing terminal
    public static void clearTerminal() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }


    public static int selectOption() {
        String input;
        while (true) {
            System.out.print("Select your choice: ");
            input = ussd.nextLine().trim();
            if (input.equalsIgnoreCase("exit")) {
            Helper.exit();
            Helper.clearTerminal();
            System.out.println("Thank you for using VMS!");
            running=false;
            return -99;
            }
            try {
            int number = Integer.parseInt(input);
            return number;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please try again.");
            }
        }
    }
    
    public static String getNextLine() {
        return ussd.nextLine();
    }
    
    public static int delay(int delayMS){
        try{
            Thread.sleep(delayMS);
        }catch (InterruptedException e){
            System.out.println("Something went wrong..");
        }
        return delayMS;
    }
    
    public static void exit(){
        String[] dots = {".", "..", "...",".", "..", "...",};
        for (String dot : dots) {
            System.out.print("\rExiting" + dot);
            Helper.delay(500);
        }
        Helper.clearTerminal();
        System.out.println("\rThank you for using VMS!");
    }
    public static void returning(){
        String[] dots = {".", "..", "...",".", "..", "...",};
        for (String dot : dots) {
            System.out.print("\rReturning" + dot);
            Helper.delay(500);
        }
        Helper.clearTerminal();
    }
}