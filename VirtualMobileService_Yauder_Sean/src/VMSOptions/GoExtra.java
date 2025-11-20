package VMSOptions;

import static Main.VirtualMobileService.running;
import static Main.VirtualMobileService.subscription;


public class GoExtra {
    static int select;
    static int option = 0;
    static boolean isDone = false;
    static boolean isDone2 = false;
    public static void GoExtraProc(){
        running=false;
        do {
            isDone = false;
            isDone2=false;
            Helper.clearTerminal();
            System.out.println("You can earn reward points when you\n" +
                    "purchase your promos via GlobeOne.\n" +
                    "Download the app now!\n" +
                    "\n" +
                    "1 GoEXTRA99\n" +
                    "2 GoEXTRA199\n" +
                    "3 Back");


            select = Helper.selectOption();

           
                Helper.clearTerminal();
                switch (select){
                    case 1:
                        GoEXTRA99();
                        break;
                    case 2:
                        GoEXTRA199();
                        break;
                    case 3:
                        isDone=true;
                        running=true;
                        break;
                    case -99:
                        isDone = true;
                        break;
                    default:
                }
        } while (!isDone);
    }
    public static void GoEXTRA99(){
        do{
            Helper.clearTerminal();
            System.out.println("Go all-in with GoEXTRA99! Get 8GB for all\n" +
                                    "sites, unli all-net calls & texts, valid for 7 days,\n" +
                                    "for only P99.\n" +
                                    "\n" +
                                    "1 Subscribe\n" +
                                    "2 Back");

                            option = Helper.selectOption();

                            if(option == 2){
                                isDone2 = true;
                            }else if(option == 1){
                                subscription("GoEXTRA99",99);
                                Helper.delay(1500);
                            Helper.exit();
                                isDone=true;
                                isDone2 = true;
                            }else if (option==-99){
                                isDone=true;
                                isDone2= true;
                            }else{
                                
                            }
        }while(!isDone2);
    }
    public static void GoEXTRA199(){
        do{
            Helper.clearTerminal();
        System.out.println("Go all-in for 15 days with GoEXTRA199! Get\n" +
                                "8GB for all sites, unli all-net calls & texts, valid\n" +
                                "for 15 days, for only P199.\n" +
                                "\n" +
                                "1 Subscribe\n" +
                                "2 Back");

                        option = Helper.selectOption();

                        if(option == 2){
                            isDone2 = true;
                        }else if(option == 1){
                            subscription("GoEXTRA199",199);
                            Helper.delay(1500);
                            Helper.exit();
                            isDone = true;
                            isDone2 = true;
                        }else if (option ==-99){
                            isDone = true;
                            isDone2 = true;
                        }else{
                            
                        }
        }while(!isDone2);
    }
}
