package VMSOptions;

import static Main.VirtualMobileService.running;
import static Main.VirtualMobileService.subscription;


public class Unli5G {
    
    static int select;
    static int option = 0;
    static boolean isDone = false;
    static boolean isDone2=false;
    public static void Unli5GProc(){
        running=false;
        do {
            isDone = false;
            isDone2=false;
            Helper.clearTerminal();
            System.out.println("You can earn reward points when you\n" +
                    "purchase your promos via GlobeOne.\n" +
                    "Download the app now!\n" +
                    "\n" +
                    "1 UNLI 5G 50\n" +
                    "2 UNLI 5G 80\n" +
                    "3 Back");


            select = Helper.selectOption();

                Helper.clearTerminal();
                switch (select){
                    case 1:
                        Unli50();
                        break;
                    case 2:
                        Unli80();
                        break;
                    case 3:
                        running = true;
                        isDone = true;
                        break;
                    case -99:
                        isDone=true;
                        break;
                    default:
                }
        } while (!isDone);
    }
    public static void Unli50(){
        do{
            Helper.clearTerminal();
        System.out.println("Feel the unlimited 5g experience with UNLI 5G\n" +
                                "50! Get unli 5G data + 2GB data for all sites,\n" +
                                "valid for 2 days for only P50.\n" +
                                "\n" +
                                "1 Subscribe\n" +
                                "2 Back");

                        option = Helper.selectOption();

                        if(option == 2){
                            isDone2 = true;
                        }else if(option == 1){
                            subscription("UNLI 5G 50",50);
                            isDone = true;
                            isDone2=true;
                            Helper.delay(1500);
                            Helper.exit();
                        }else if(option==-99){
                            isDone2 = true;
                            isDone = true;
                        }else{
                            
                        }
        }while(!isDone2);
    }
    public static void Unli80(){
        do{
            Helper.clearTerminal();
        System.out.println("Feel the unlimited 5g experience with UNLI 5G\n" +
                                "data + 2GB data for all sites + unli allnet calls &\n" +
                                "texts, valid for 2 days for only P80.\n" +
                                "\n" +
                                "1 Subscribe\n" +
                                "2 Back");

                        option = Helper.selectOption();

                        if(option == 2){
                            isDone2 = true;
                        }else if(option == 1){
                            subscription("UNLI 5G 80",80);
                            isDone = true;
                            isDone2=true;
                            Helper.delay(1500);
                            Helper.exit();
                        }else if(option==-99){
                            isDone2=true;
                            isDone = true;
                        }else{
                            
                        }
        }while(!isDone2);
    }
}
