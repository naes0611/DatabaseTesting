package VMSOptions;

import static Main.VirtualMobileService.running;
import static Main.VirtualMobileService.subscription;

public class GoBooster {
    
    static int select;
    static int option = 0;
    static boolean isDone = false;
    static boolean isDone2 = false;
    static boolean isDone3 = false;
    public static void GoBoosterProc(){
        running=false;
        do {
            isDone = false;
            isDone2=false;
            Helper.clearTerminal();
            System.out.println("Add more with your Go promo by registering to\n" +
                    "any of the following GoBOOSTERS:\n" +
                    "\n" +
                    "1 GoBOOST15\n" +
                    "2 GoWATCH10\n" +
                    "3 GoPLAY10\n" +
                    "4 GoSHARE10\n" +
                    "5 More\n" +
                    "6 Back");
            select = Helper.selectOption();
            switch(select){
                case 1:
                    GoBoost();
                    break;
                case 2:
                    GoWatch();
                    break;
                case 3:
                    GoPlay();
                    break;
                case 4:
                    GoShare();
                    break;
                case 5:
                    MoreOptions();
                    break;
                case 6:
                    isDone=true;
                    running=true;
                    break;
                case -99:
                    isDone=true;
                    break;
            }
        } while (!isDone);
    }
    public static void GoBoost(){
        do{
            Helper.clearTerminal();
            System.out.println("Enjoy additional 1GB data for all sites for 1\n" +
                    "day. P15 only.\n" +
                    "\n" +
                    "1 Subscribe\n" +
                    "2 Back");
            option = Helper.selectOption();
            if(option ==1){
                subscription("GoBOOST15", 15);
                System.out.println("");
                Helper.delay(3000);
                Helper.exit();
                isDone=true;
                isDone2=true;
            }else if(option==2){
                isDone2=true;
            }else if(option==-99){
                isDone=true;
                isDone2=true;
            }else{
                
            }
        }while(!isDone2);
    }
    public static void GoWatch(){
        do{
            Helper.clearTerminal();
            System.out.println("Enjoy additional 1GB data for Youtube, Netflix,\n" +
                    "Viu, and Disney+ for 1 day. P10 only.\n" +
                    "\n" +
                    "1 Subscribe\n" +
                    "2 Back");
            option = Helper.selectOption();
            if(option ==1){
                subscription("GoWATCH", 10);
                System.out.println("");
                Helper.delay(3000);
                Helper.exit();
                isDone=true;
                isDone2=true;
            }else if(option==2){
                isDone2=true;
            }else if(option==-99){
                isDone=true;
                isDone2=true;
            }else{
                
            }
        }while(!isDone2);
    }
    public static void GoPlay(){
        do{
            Helper.clearTerminal();
            System.out.println("Enjoy additional 1GB data for Mobile Legends, \n" +
                    "Call of Duty, PUBG, Discord, Twitch and Honor\n" +
                    "of Kings for 1 day. P10 only.\n" +
                    "\n" +
                    "1 Subscribe\n" +
                    "2 Back");
            option = Helper.selectOption();
            if(option ==1){
                subscription("GoPLAY10", 10);
                System.out.println("");
                Helper.delay(3000);
                Helper.exit();
                isDone=true;
                isDone2=true;
            }else if(option==2){
                isDone2=true;
            }else if(option==-99){
                isDone=true;
                isDone2=true;
            }else{
                
            }
        }while(!isDone2);
    }
    public static void GoShare(){
        do{
            Helper.clearTerminal();
            System.out.println("Enjoy additional 1GB data for FB, IG, Tiktok, X,\n" +
                    "Viber and WhatsApp for 1 day. P10 only.\n" +
                    "\n" +
                    "1 Subscribe\n" +
                    "2 Back");
            option = Helper.selectOption();
            if(option ==1){
                subscription("GoSHARE10", 10);
                System.out.println("");
                Helper.delay(3000);
                Helper.exit();
                isDone=true;
                isDone2=true;
            }else if(option==2){
                isDone2=true;
            }else if(option==-99){
                isDone=true;
                isDone2=true;
            }else{
                
            }
        }while(!isDone2);
    }
    public static void MoreOptions(){
        do{
            Helper.clearTerminal();
            System.out.println("1 GoCALL10\n" +
                "2 GoLONGER10\n" +
                "3 GoMIDNIGHT10\n" +
                "4 Back");
            option = Helper.selectOption();
            if(option==1){
                do{
                Helper.clearTerminal();
                System.out.println("Enjoy unli allnet calls with your Go promo for 1\n" +
                "day. P10 only.\n" +
                "\n" +
                "1 Subscribe\n" +
                "2 Back");
                option = Helper.selectOption();
                if(option ==1){
                    subscription("GoCALL10", 10);
                    System.out.println("");
                    Helper.delay(3000);
                    Helper.exit();
                    isDone=true;
                    isDone2=true;
                    isDone3=true;
                }else if(option==2){
                    isDone3=true;
                }else if(option==-99){
                    isDone=true;
                    isDone2=true;
                    isDone3=true;
                }else{
                isDone3=false;
            }
                }while(!isDone3);
            }else if(option==2){
                do{
                Helper.clearTerminal();
                System.out.println("Enjoy additional 1 day validity of your Go\n" +
                "promo for 1 day. P10 only.\n" +
                "\n" +
                "1 Subscribe\n" +
                "2 Back");
                option = Helper.selectOption();
                if(option ==1){
                    subscription("GoLONGER10", 10);
                    System.out.println("");
                    Helper.delay(3000);
                    Helper.exit();
                    isDone=true;
                    isDone2=true;
                    isDone3=true;
                }else if(option==2){
                    isDone3=true;
                }else if(option==-99){
                    isDone=true;
                    isDone2=true;
                    isDone3=true;
                }else{
                isDone3=false;
            }
                }while(!isDone3);
            }else if(option==3){
                do{
                Helper.clearTerminal();
                System.out.println("Enjoy additional 1 GB data for all sites, from\n" +
                "12mn to 6am. P10 only.\n" +
                "\n" +
                "1 Subscribe\n" +
                "2 Back");
                option = Helper.selectOption();
                if(option ==1){
                    subscription("GoMIDNIGHT10", 10);
                    System.out.println("");
                    Helper.delay(3000);
                    Helper.exit();
                    isDone=true;
                    isDone2=true;
                    isDone3=true;
                }else if(option==2){
                    isDone3=true;
                }else if(option==-99){
                    isDone=true;
                    isDone2=true;
                    isDone3=true;
                }else{
                isDone3=false;
            }
                }while(!isDone3);
            }else if(option==4){
                isDone2=true;
            }else if(option==-99){
                isDone2=true;
                isDone=true;
            }else{
                isDone2=false;
            }
        }while(!isDone2);
    }
    
}
