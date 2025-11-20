package Main;

import java.util.Scanner;
import  VMSOptions.*;
import static VMSOptions.Loading.bal;

public class VirtualMobileService {

    public static Scanner ussd = new Scanner(System.in);
    public static boolean running = true;
    public static void main(String[] args) {

        //initialization
        
        String initialSelect = initialdisplay();
        int accSelect = 0;

        if(initialSelect.equalsIgnoreCase("*143#"))
        {
            do{
                Helper.clearTerminal();
                accSelect = accSelection();

                switch(accSelect){
                    case 0:
                        MyAccount.MyAccountProc(); // done
                        break;
                    case 1:
                        GoPlus.GoPlusProc(); // Done
                        break;
                    case 2:
                        SuperGo99.SuperGo99Proc(); // Done
                        break;
                    case 3:
                        GoExtra.GoExtraProc(); // Done
                        break;
                    case 4:
                        Unli5G.Unli5GProc(); // Done
                        break;
                    case 5:
                        Go.GoProc(); // Done
                        break;
                    case 6:
                        GoBooster.GoBoosterProc(); // Done
                        break;
                    case 7:
                        SurfAll.SurfAllProc(); // Done
                        break;
                    case 8:
                        AllNet.AllNetProc(); //  DOne
                        break;
                    case 9:
                        GlobeOne.GlobeOneProc(); // doNE
                        break;
                    case 10:
                        Rewards.RewardsProc(); // done
                        break;
                    case 11:
                        Loans.LoansProc();// Done
                        break;
                    case 12:
                        running = false;
                        Helper.exit();
                        break;
                }
            }while(running);
        }else if(initialSelect.equalsIgnoreCase("sean")){
            System.out.println("SEAN YAUDER POGI :)");
        }else if (initialSelect.equalsIgnoreCase("#load"))
        {
           Loading.LoadingProc();// DOne
        }else{
            
        }
    }

    //initial display
    static String initialdisplay(){
        String number;
        System.out.println("================================");
        System.out.println("=   VIRTUAL MOBILE SERVICE     =");
        System.out.println("================================");
        System.out.println("=                              =");
        System.out.println("=       1      2      3        =");
        System.out.println("=                              =");
        System.out.println("=       4      5      6        =");
        System.out.println("=                              =");
        System.out.println("=       7      8      9        =");
        System.out.println("=                              =");
        System.out.println("=       *      0      #        =");
        System.out.println("=                              =");
        System.out.println("================================");
        System.out.println("=     Enter *143# to enter     =");
        System.out.println("=        Mobile Service        =");
        System.out.println("=                              =");
        System.out.println("=     Enter #Load to load      =");
        System.out.println("=         your device          =");
        System.out.println("=                              =");
        System.out.println("=     Enter Exit to Exit       =");
        System.out.println("================================");
        System.out.println("     ");

        do{
            System.out.print("Enter USSD code: ");
            number = ussd.nextLine();

            if(!number.equalsIgnoreCase("*143#") && !number.equalsIgnoreCase("exit") && !number.equalsIgnoreCase("#load") && !number.equalsIgnoreCase("sean")){
                System.out.println("Invalid USSD code - Please enter again");
            }
            else if(number.equalsIgnoreCase("sean")){
                return number;
            }
            else if(number.equalsIgnoreCase("*143#")){
                return number;
            }
            else if(number.equalsIgnoreCase("#load")){
                return number;
            }
        }while(!number.equalsIgnoreCase("exit") && !number.equalsIgnoreCase("sean"));
        Helper.exit();
        Helper.clearTerminal();
        System.out.println("Thank you for using VMS!");

        return number;
    }
    //account selection
    static int accSelection(){
        int select;
        boolean isDone=false;
        do{
        Helper.clearTerminal();
        System.out.println("Current Bal " +bal +"\n" +
                "0  MyAccount\n" +
                "1  Go+\n" +
                "2  SuperGo99\n" +
                "3  GoEXTRA\n" +
                "4  UNLI 5G\n" +
                "5  Go\n" +
                "6  GoBOOSTERS\n" +
                "7  Surf4All\n" +
                "8  ALLNET\n" +
                "9  GlobeONE\n" +
                "10 Rewards\n" +
                "11 Loans\n" +
                "12 Exit");

        
            select = Helper.selectOption();

            if(select > 13) {

            }
            else{
                isDone=true;
                return select;
            }
            

        } while (!isDone);

        return select;


    }

    //Subscription Process
    public static void subscription(String type, int price){
        Helper.clearTerminal();
        
        if(bal >= price){
            double rbal = bal - price;
            System.out.println("Thank you for subscribing to " + type + "! You will get a response via text shortly.\n");
            System.out.print("remaining balance : " + rbal);
        }else{
            System.out.println("insufficient Balance, reload your account!");
            System.out.print("remaining balance : " + bal);
            System.exit(0);
        }
    }
}

