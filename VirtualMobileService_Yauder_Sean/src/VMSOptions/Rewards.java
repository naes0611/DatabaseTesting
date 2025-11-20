package VMSOptions;

import static Main.VirtualMobileService.running;


public class Rewards {
    public static void RewardsProc(){
        running=false;
        int select;
        boolean isDone = false;

        do {
            Helper.clearTerminal();
            System.out.println("Upgrade your rewards with GlobeOne!\n" +
                    "You may continue to enjoy and redeem your\n" +
                    "favorite rewards using GlobeOne App.\n" +
                    "Download the app now! via NIGGER STORE\n" +
                    "\n" +
                    "1 Back");


            select = Helper.selectOption();

            if(select == 1) {
                isDone = true;
                running = true;
            }
            else if (select==-99){
                isDone = true;
            }else{
                
            }
        } while (!isDone);
    }
}
