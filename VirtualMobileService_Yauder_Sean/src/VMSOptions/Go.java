package VMSOptions;

import static Main.VirtualMobileService.running;
import static Main.VirtualMobileService.subscription;


public class Go{
    static int select;
    static int option = 0;
    static boolean isDone = false;
    static boolean isDone2 = false;
    
    public static void GoProc(){
        running = false;
        do{
            isDone = false;
            isDone2=false;
            Helper.clearTerminal();
            System.out.println("You can earn reward points when you\n" +
                "purchase your promos via GlobeOne.\n" +
                "Download the app now!\n" +
                "\n" +
                "1 Go59\n" +
                "2 Go75\n" +
                "3 Back");
            select = Helper.selectOption();
            switch(select){
                case 1:
                    Go59();
                    break;
                case 2:
                    Go75();
                    break;
                case 3:
                    isDone=true;
                    running=true;
                    break;
                case -99:
                    isDone=true;
                    break;
                default:
            }
        }while(!isDone);
    }
    public static void Go59(){
        do{
            Helper.clearTerminal();
            System.out.println("Get 5GB for all sites + unli allnet text for 3\n" +
                "days. Register via GlobeOne to earn 1.18 Globe\n" +
                "Rewards points.\n" +
                "\n" +
                "1 Subscribe\n" +
                "2 Back");
            option = Helper.selectOption();
            if(option==1){
                isDone=true;
                isDone2=true;
                subscription("Go59", 59);
                System.out.println("");
                Helper.delay(2000);
                Helper.exit();
                
            }else if(option==2){
                isDone2=true;
            }else if(option==-99){
                isDone2=true;
                isDone=true;
            }else{}
        }while(!isDone2);
    }
    public static void Go75(){
        do{
            Helper.clearTerminal();
            System.out.println("Get 5GB for all sites + unli allnet calls & text \n" +
                "for 7 days. Register via GlobeOne to earn 1.5 \n" +
                "Globe Rewards points.\n" +
                "\n" +
                "1 Subscribe\n" +
                "2 Back");
            option = Helper.selectOption();
            if(option==1){
                isDone=true;
                isDone2=true;
                subscription("Go75", 75);
                System.out.println("");
                Helper.delay(2000);
                Helper.exit();
                
            }else if(option==2){
                isDone2=true;
            }else if(option==-99){
                isDone2=true;
                isDone=true;
            }else{}
        }while(!isDone2);
    }
}
