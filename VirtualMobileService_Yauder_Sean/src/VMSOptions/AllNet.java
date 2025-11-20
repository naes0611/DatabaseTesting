package VMSOptions;


import static Main.VirtualMobileService.running;
import static Main.VirtualMobileService.ussd;
import static Main.VirtualMobileService.subscription;

public class AllNet {
    static int select;
    static int option = 0;
    static boolean isDone = false;
    static boolean isDone2 = false;
    static String BM;
    public static void AllNetProc(){
        running=false;
        do {
            isDone = false;
            isDone2=false;
            Helper.clearTerminal();
            System.out.println("You can earn reward points when you\n" +
                    "purchase your promos via GlobeOne.\n" +
                    "Download the app now!\n" +
                    "\n" +
                    "1 GoUnli20\n" +
                    "2 GoUnli30\n" +
                    "3 GoUnli50\n" +
                    "4 GoUnli95\n" +
                    "5 GoUnli180\n" +
                    "6 GoUnli350\n" +
                    "7 Back");


            select = Helper.selectOption();
            switch(select){
                case 1:
                    GoUnli20();
                    break;
                case 2:
                    GoUnli30();
                    break;
                case 3:
                    GoUnli50();
                    break;
                case 4:
                    GoUnli95();
                    break;
                case 5:
                    GoUnli180();
                    break;
                case 6:
                    GoUnli350();
                    break;
                case 7:
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
    public static void GoUnli20(){
        do{
            Helper.clearTerminal();
            System.out.println("GoUNLI20 comes with :\n" +
                                "- Unli calls & text to all networks\n" +
                                "- 50MB data for all sites\n" +
                                "- P20 valid for 1 day\n" +
                                "\n" +
                                "1 Subscribe\n" +
                                "2 Status\n" +
                                "3 Back\n" +
                                "4 Bookmark");

                        option = Helper.selectOption();
                        
                        if(option == 1){
                            subscription("GoUNLI20",20);
                            Helper.delay(2000);
                            Helper.exit();
                            isDone = true;
                            isDone2 = true;
                        }else if(option == 2){
                            isDone=true;
                            isDone2=true;
                            Helper.clearTerminal();
                            System.out.println("Thank you! You will get a response via text shortly" );
                            
                        }else if(option == 3){
                            isDone2 = true;
                        }else if(option == 4){
                            Helper.clearTerminal();
                            System.out.println("Name this option! Max 10 chars only.\n" +
                                    "(EX: S3ANP0G1)");
                            BM = ussd.nextLine();
                            System.out.println("");
                            Helper.exit();
                        }else{
                        }
        }while(!isDone2);
    }
    public static void GoUnli30(){
        do{
            Helper.clearTerminal();
            System.out.println("GoUNLI30 comes with :\n" +
                                "- Unli calls & text to all networks\n" +
                                "- 50MB data for all sites\n" +
                                "- P20 valid for 1 day\n" +
                                "\n" +
                                "1 Subscribe\n" +
                                "2 Status\n" +
                                "3 Back\n" +
                                "4 Bookmark");
            option = Helper.selectOption();
                        
                        if(option == 1){
                            subscription("GoUNLI30",30);
                            Helper.delay(2000);
                            Helper.exit();
                            isDone = true;
                            isDone2 = true;
                        }else if(option == 2){
                            isDone=true;
                            isDone2=true;
                            Helper.clearTerminal();
                            System.out.println("Thank you! You will get a response via text shortly" );
                            
                        }else if(option == 3){
                            isDone2 = true;
                        }else if(option == 4){
                            Helper.clearTerminal();
                            System.out.println("Name this option! Max 10 chars only.\n" +
                                    "(EX: S3ANP0G1)");
                            BM = ussd.nextLine();
                            System.out.println("");
                            Helper.exit();
                        }else{
                        }
        }while(!isDone2);
    }
    public static void GoUnli50(){
        do{
            Helper.clearTerminal();
            System.out.println("GoUNLI50 comes with :\n" +
                                "- Unli calls & text to all networks\n" +
                                "- 50MB data for all sites\n" +
                                "- P20 valid for 1 day\n" +
                                "\n" +
                                "1 Subscribe\n" +
                                "2 Status\n" +
                                "3 Back\n" +
                                "4 Bookmark");
            
            option = Helper.selectOption();
                        
                        if(option == 1){
                            subscription("GoUNLI50",50);
                            Helper.delay(2000);
                            Helper.exit();
                            isDone = true;
                            isDone2 = true;
                        }else if(option == 2){
                            isDone=true;
                            isDone2=true;
                            Helper.clearTerminal();
                            System.out.println("Thank you! You will get a response via text shortly" );
                            
                        }else if(option == 3){
                            isDone2 = true;
                        }else if(option == 4){
                            Helper.clearTerminal();
                            System.out.println("Name this option! Max 10 chars only.\n" +
                                    "(EX: S3ANP0G1)");
                            BM = ussd.nextLine();
                            System.out.println("");
                            Helper.exit();
                        }else{
                        }
        }while(!isDone2);
    }
    public static void GoUnli95(){
        do{
            Helper.clearTerminal();
            System.out.println("GoUNLI95 comes with :\n" +
                                "- Unli calls & text to all networks\n" +
                                "- 50MB data for all sites\n" +
                                "- P20 valid for 1 day\n" +
                                "\n" +
                                "1 Subscribe\n" +
                                "2 Status\n" +
                                "3 Back\n" +
                                "4 Bookmark");
            option = Helper.selectOption();
                        
                        if(option == 1){
                            subscription("GoUNLI95",95);
                            Helper.delay(2000);
                            Helper.exit();
                            isDone = true;
                            isDone2 = true;
                        }else if(option == 2){
                            isDone=true;
                            isDone2=true;
                            Helper.clearTerminal();
                            System.out.println("Thank you! You will get a response via text shortly" );
                            
                        }else if(option == 3){
                            isDone2 = true;
                        }else if(option == 4){
                            Helper.clearTerminal();
                            System.out.println("Name this option! Max 10 chars only.\n" +
                                    "(EX: S3ANP0G1)");
                            BM = ussd.nextLine();
                            System.out.println("");
                            Helper.exit();
                        }else{
                        }
        }while(!isDone2);
    }
    public static void GoUnli180(){
        do{
            Helper.clearTerminal();
            System.out.println("GoUNLI180 comes with :\n" +
                                "- Unli calls & text to all networks\n" +
                                "- 50MB data for all sites\n" +
                                "- P20 valid for 1 day\n" +
                                "\n" +
                                "1 Subscribe\n" +
                                "2 Status\n" +
                                "3 Back\n" +
                                "4 Bookmark");
            option = Helper.selectOption();
                        
                        if(option == 1){
                            subscription("GoUNLI180",180);
                            Helper.delay(2000);
                            Helper.exit();
                            isDone = true;
                            isDone2 = true;
                        }else if(option == 2){
                            isDone=true;
                            isDone2=true;
                            Helper.clearTerminal();
                            System.out.println("Thank you! You will get a response via text shortly" );
                            
                        }else if(option == 3){
                            isDone2 = true;
                        }else if(option == 4){
                            Helper.clearTerminal();
                            System.out.println("Name this option! Max 10 chars only.\n" +
                                    "(EX: S3ANP0G1)");
                            BM = ussd.nextLine();
                            System.out.println("");
                            Helper.exit();
                        }else{
                        }
        }while(!isDone2);
    }
    public static void GoUnli350(){
        do{
            Helper.clearTerminal();
            System.out.println("GoUNLI350 comes with :\n" +
                                "- Unli calls & text to all networks\n" +
                                "- 50MB data for all sites\n" +
                                "- P20 valid for 1 day\n" +
                                "\n" +
                                "1 Subscribe\n" +
                                "2 Status\n" +
                                "3 Back\n" +
                                "4 Bookmark");
            option = Helper.selectOption();
                        
                        if(option == 1){
                            subscription("GoUNLI180",180);
                            Helper.delay(2000);
                            Helper.exit();
                            isDone = true;
                            isDone2 = true;
                        }else if(option == 2){
                            isDone=true;
                            isDone2=true;
                            Helper.clearTerminal();
                            System.out.println("Thank you! You will get a response via text shortly" );
                            
                        }else if(option == 3){
                            isDone2 = true;
                        }else if(option == 4){
                            Helper.clearTerminal();
                            System.out.println("Name this option! Max 10 chars only.\n" +
                                    "(EX: S3ANP0G1)");
                            BM = ussd.nextLine();
                            System.out.println("");
                            Helper.exit();
                        }else{
                        }
        }while(!isDone2);
    }
}