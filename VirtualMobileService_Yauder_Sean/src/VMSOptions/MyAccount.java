package VMSOptions;

import static Main.VirtualMobileService.running;
import static Main.VirtualMobileService.ussd;

public class MyAccount {
    static int select;
    static int option = 0;
    static boolean isDone = false;
    static boolean isDone2 = false;
    static boolean isDone3 = false;
    public static void MyAccountProc(){
        running=false;

        do{
            isDone = false;
            isDone2=false;
            Helper.clearTerminal();
            System.out.println("Manage your Account and check your balance with GlobeOne. Download it now.");
            System.out.println("1 Data Balance\n2 SurfAlert\n3 Load Call Card\n4 My Devices\n5 Back");

            select = Helper.selectOption();

            if(select == -99) {
                isDone=true;
            }
            else {
                Helper.clearTerminal();
                switch (select){
                    case 1:
                        DataBalance();
                        break;
                    case 2:
                        SurfAlert();
                        break;
                    case 3:
                        LoadCallCard();
                        break;
                    case 4:
                        MyDevices();
                        break;
                    case 5:
                        running = true;
                        isDone = true;
                        break;
                    case -99:
                        isDone=true;
                        break;
                    default:
                }
            }
        } while (!isDone);

    }
    public static void DataBalance(){
        Helper.clearTerminal();
        System.out.println("Thank you! You will get a response via text shortly\n");
        Helper.delay(1500);
        Helper.returning();                       
    }
    public static void SurfAlert(){
        do{
            Helper.clearTerminal();
            System.out.println("To register to this service, text SURFALERT ON\n"+
                                    "to 8080 now.\n"+"For more info, text SURFALERT to 8080 for\n"+"free.\n"+
                                    "1 Back");
            option = Helper.selectOption();
            if(option == 1){
                isDone2 = true;
            }else if (option==-99){
                isDone=true;
                isDone2=true;
            }else{
                
            }
        }while(!isDone2);
    }
    public static void LoadCallCard(){
        do{
            Helper.clearTerminal();
            System.out.println("Buy load & promos, and enjoy exclusive\n" +
                                    "rewards anytime, anywhere with GlobeOne!\n" +
                                    "Download the app now via Google Play Store\n" +
                                    "or the App Store.\n" +
                                    "\n" +
                                    "1 Next\n"+
                                    "2 Back");

                            option = Helper.selectOption();

                            if(option == 2){
                                isDone2 = true;
                            }else if(option == 1){
                                Helper.clearTerminal();
                                System.out.println("Enter 10-digit call card number");
                                String enter = ussd.nextLine();
                                Helper.delay(1000);
                                Helper.returning();
                            }else if(option==-99){
                                isDone2=true;
                                isDone=true;
                            }else{
                                
                            }
        }while(!isDone2);
    }
    public static void MyDevices(){
        do{
            
            Helper.clearTerminal();
                            System.out.println("Easily manage your account with GlobeOne.\n" +
                                    "Download the app now!\n" +
                                    "\n" +
                                    "1 Globe At Home\n" +
                                    "2 Back");

                            option = Helper.selectOption();

                            if(option == 2){
                                isDone2 = true;
                            }else if(option == 1){
                                do{
                                    isDone3=false;
                                    Helper.clearTerminal();
                                    System.out.println("Choose the Globe at Home (Broadband)\n" +
                                            "account that you wish to manage\n" +
                                            "\n" +
                                            "1 Globe At Home Prepaid Wifi\n" +
                                            "2 Back");
                                    option = Helper.selectOption();
                                    switch (option){
                                        case 1:
                                            Helper.clearTerminal();
                                            System.out.println("Please enter your 10-digit Globe At Home\n" +
                                                    "Prepaid WiFi number:\n" +
                                                    "(Example: 905XXXXXXX)");
                                            String enter = ussd.nextLine();
                                            isDone3=true;
                                            isDone2 = true;
                                            Helper.delay(1000);
                                            Helper.returning();
                                           
                                            break;
                                        case 2:
                                            isDone3 = true;
                                            break;
                                        case -99:
                                            isDone=true;
                                            isDone2=true;
                                            isDone3=true;
                                            break;
                                        default:
                                    }
                                }while(!isDone3);
                            }else{
                                
                            }
         }while(!isDone2);

    }
            
}
