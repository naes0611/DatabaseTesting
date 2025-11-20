package VMSOptions;

import static Main.VirtualMobileService.running;

public class Loans {
    static int select;
    static int option;
    static boolean isDone = false;
    static boolean isDone2=false;
    static boolean isDone3 = false;
    public static void LoansProc(){
        running=false;
        do{
            isDone = false;
            isDone2=false;
            Helper.clearTerminal();
            System.out.println("Globe Loans will move to GlobeOne soon.\n"+
                    "Download the app now!]\n"+"1 MBSOS/FOMOSOS\n"+"2 COMBOSOS\n"+
                    "3 TXTSOS\n"+"4 CALLSOS\n"+"5 IDDSOS\n"+"6 Pay Loan\n"+
                    "7 Status\n"+"8 Unsubscribe\n"+"9 Back");
            select = Helper.selectOption();
                switch(select){
                    case 1:
                        MBSOS();
                        break;
                    case 2:
                        COMBOSOS();
                        break;    
                    case 3:
                        TXTSOS();
                        break;    
                    case 4:
                        CALLSOS();
                        break;    
                    case 5:
                        IDDSOS();
                        break;    
                    case 6:
                        PayLoan();
                        break;    
                    case 7:
                        Status();
                        break;    
                    case 8:
                        Unsubscribe();
                        break;  
                    case 9:
                        isDone=true;
                        running=true;
                        break;   
                    case -99:
                        isDone=true;
                        break;  
                }
        }while(!isDone);
    }
    public static void MBSOS(){
        do{
            Helper.clearTerminal();
            System.out.println("MBSOS or FOMOSOS lets you borrow 100MB for\nsurfing valid for 1 day. Pay later by buying \nat least P6 (P5 + P1 servive fee) load.\n1 Subscribe\n2 Back");
                        option = Helper.selectOption();
                            switch(option){
                                case 1:
                                    Helper.clearTerminal();
                                    System.out.println("Thank you! You will get a response via text shortly.");
                                    isDone=true;
                                    isDone2=true;
                                    Helper.delay(1000);
                                    Helper.exit();
                                    break;
                                case 2:
                                    isDone2=true;
                                    break;
                                case -99:
                                    isDone2=true;
                                    isDone=true;
                                    break;
                            }
        }while(!isDone2);
    }
    public static void COMBOSOS(){
        do{
            Helper.clearTerminal();
            System.out.println("COMBOSOS lets you borrow 2 minute calls and\n 5 all-net texts valid for 1 day. Pay later by buying\nat least P6 (P5 + P1 service fee) load.\n1 Subscribe\n2 Back");
                        option = Helper.selectOption();
                            switch(option){
                                case 1:
                                    Helper.clearTerminal();
                                    System.out.println("Thank you! You will get a response via text shortly.");
                                    isDone=true;
                                    isDone2=true;
                                    Helper.delay(1000);
                                    Helper.exit();
                                    break;
                                case 2:
                                    isDone2=true;
                                    break;
                                case -99:
                                    isDone2=true;
                                    isDone=true;
                                    break;
                            }
        }while(!isDone2);
    }
    public static void TXTSOS(){
        do{
        Helper.clearTerminal();
        System.out.println("TXTSOS lets you borrow 10 all-net texts valid\nfor 1 day. Pay later by buying at least P6 (P5 +\n P1 service fee) load.\n1 Subscribe\n2 Back");
                        option = Helper.selectOption();
                            switch(option){
                                case 1:
                                    Helper.clearTerminal();
                                    System.out.println("Thank you! You will get a response via text shortly.");
                                    isDone=true;
                                    isDone2=true;
                                    Helper.delay(1000);
                                    Helper.exit();
                                    break;
                                case 2:
                                    isDone2=true;
                                    break;
                                case -99:
                                    isDone=true;
                                    isDone2=true;
                                    break;
                            }
        }while(!isDone2);
    }
    public static void CALLSOS(){
        do{
            Helper.clearTerminal();
            System.out.println("CALLSOS lets you borrow 3 min all-net calls,\n validfor 1 day. Pay later by buying at least P6\n(P5 + P1 service fee) load.\n1 Subscribe\n2 Back");
                        option = Helper.selectOption();
                            switch(option){
                                case 1:
                                    Helper.clearTerminal();
                                    System.out.println("Thank you! You will get a response via text shortly.");
                                    isDone=true;
                                    isDone2=true;
                                    Helper.delay(1000);
                                    Helper.exit();
                                    break;
                                case 2:
                                    isDone2=true;
                                    break;
                                case -99:
                                    isDone=true;
                                    isDone2=true;
                                    break;
                            }
        }while(!isDone2);
    }
    public static void IDDSOS(){
        do{
            Helper.clearTerminal();
                        System.out.println("IDDSOS lets you borrow 1 min call to M. East &\nEurope, N. America & Asia pac. valid for 1 day.\nPay later by buying at least P6 (P5 + P1 service\n fee) load.\n1 Subscribe\n2 Back");
                        option = Helper.selectOption();
                            switch(option){
                                case 1:
                                    Helper.clearTerminal();
                                    System.out.println("Thank you! You will get a response via text shortly.");
                                    isDone=true;
                                    isDone2=true;
                                    Helper.delay(1000);
                                    Helper.exit();
                                    break;
                                case 2:
                                    isDone2=true;
                                    break;
                                case -99:
                                    isDone=true;
                                    isDone2=true;
                                    break;
                            }
        }while(!isDone2);
    }
    public static void PayLoan(){
        System.out.println("Thank you! You will get a response via text shortly.");
        Helper.delay(1500);
        Helper.returning();
        isDone=false;
    }
    public static void Status(){
        do{
            Helper.clearTerminal();
            System.out.println("1 Load Status\n2 Loan Promo status\n3 Back");
            option = Helper.selectOption();
            Helper.clearTerminal();
            switch(option){
                case 1:
                    System.out.println("Thank you! You will get a response via text shortly.");
                    isDone2=true;
                    Helper.delay(1500);
                    Helper.returning();
                    break;
                case 2:
                    System.out.println("Thank you! You will get a response via text shortly.");
                    isDone2=true;
                    Helper.delay(1500);
                    Helper.returning();
                    break;
                case 3:
                    isDone2=true;
                    break;
                case -99:
                    isDone=true;
                    isDone2=true;
                    break;
            }    
        }while(!isDone2);
    }
    public static void Unsubscribe(){
        do{
            isDone3=false;
            Helper.clearTerminal();
            System.out.println("1 Stop MBSOS\n2 Stop COMBOSOS\n3 Others\n4 Back");
            option = Helper.selectOption();
            Helper.clearTerminal();
                                switch(option){
                                    case 1:
                                        System.out.println("Thank you! You will get a response via text shortly.");
                                        isDone2=true;
                                        Helper.delay(1500);
                                        Helper.returning();
                                        break;
                                    case 2:
                                        System.out.println("Thank you! You will get a response via text shortly.");
                                        isDone2=true;
                                        Helper.delay(1500);
                                        Helper.returning();
                                        break;
                                    case 3:
                                        do{
                                            Helper.clearTerminal();
                                        System.out.println("To unsubscribe from your Loan Promo just\ntext STOP<space><LOAN PROMO KEYWORD>\nand send to 3733 for free.\n1 Back");
                                        select = Helper.selectOption();
                                        if(select == 1){
                                        isDone3=true;
                                        }else if(option==-99){
                                            isDone=true;
                                            isDone2=true;
                                            isDone3=true;
                                        }
                                        }while(!isDone3);
                                        break;    
                                    case 4:
                                        isDone2 = true;
                                        break;    
                                    case -99:
                                        isDone2=true;
                                        isDone=true;
                                        break;

                                }
        }while(!isDone2);
    }
}