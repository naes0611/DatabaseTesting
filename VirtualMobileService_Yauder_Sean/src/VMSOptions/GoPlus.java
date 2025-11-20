/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VMSOptions;

import static Main.VirtualMobileService.running;
import static Main.VirtualMobileService.subscription;

public class GoPlus {
    static int select;
    static int option;
    static boolean isDone = false;
    static boolean isDone2=false;
    static boolean isDone3=false;
    static boolean isDone4 = false;
    public static void GoPlusProc(){
        running =false;
        do{
            isDone = false;
            isDone2=false;
            Helper.clearTerminal();
            System.out.println("You can earn reward points when you purchase your promos via GlobeOne. Download the app now!\n" +
                    "\n" +
                    "1 Go+99\n" +
                    "2 Go+129\n" +
                    "3 Go+149\n" +
                    "4 Go+179\n" +
                    "5 Go+250\n" +
                    "6 Go+400\n" +
                    "7 Back");
            select = Helper.selectOption();
            
            switch(select){
                case 1:
                    Go99();
                    break;
                case 2:
                    Go129();
                    break;
                case 3:
                    Go149();
                    break;
                case 4:
                    Go179();
                    break;
                case 5:
                    Go250();
                    break;
                case 6:
                    Go400();
                    break;
                case 7:
                    isDone=true;
                    running=true;
                    break;
                case -99:
                    isDone=true;
                    break;
            }
        }while(!isDone);
        
    }
    public static void Go99(){
        do{
            isDone3=false;
            Helper.clearTerminal();
                        System.out.println("Get 8GB for all sites + 8GB for 5g OR apps \n" +
                                        "+ unli allnet texts for 7 days, plus a FREE\n" +
                                        "voucher. Register via GlobeOne to earn 1.98 \n" +
                                        "Globe Reward points\n" +
                                        "\n" +
                                        "1 Subscribe\n" +
                                        "2 Back");
                        option = Helper.selectOption();

                        if(option ==1){
                            do{
                                isDone4=false;
                                Helper.clearTerminal();
                                System.out.println("Choose your app freebie:\n" +
                                                "1 Go5G\n" +
                                                "2 GoWATCH\n" +
                                                "3 GoSHARE\n" +
                                                "4 GoPLAY\n" +
                                                "5 Back");
                                select = Helper.selectOption();
                                switch(select){
                                    case 1:
                                        do{
                                            Helper.clearTerminal();
                                            System.out.println("Register to Go+99 w/ 8GB for all sites, 8GB 5G all-access data,\n"
                                                    + "unli allnet texts, plus a FREE voucher. Valid for 7 days.\n"
                                                    + " P99 only. For 5G phones in 5G area only.\n"
                                                    + "\n1 Proceed"
                                                    + "\n2 Back");
                                            option = Helper.selectOption();
                                            if(option==1){
                                                isDone=true;
                                                isDone2=true;
                                                isDone3=true;
                                                isDone4=true;
                                                subscription("Go+99", 99);
                                                System.out.println("");
                                                Helper.delay(1500);
                                                Helper.exit();
                                            }else if (option==2){
                                                isDone4=true;
                                            }else if(option==-99){
                                                isDone=true;
                                                isDone2=true;
                                                isDone3=true;
                                                isDone4=true;
                                            }
                                        }while(!isDone4);
                                        break;
                                    case 2:
                                        do{
                                          Helper.clearTerminal();
                                            System.out.println("Register to Go+99 w/ 8GB for all sites, 8GB for YT, Netflix\n"
                                                    + " and more, unli allnet texts, plus a FREE voucher.\n"
                                                    + " Valid for 7 days. P99 only\n"
                                                    + "\n1 Proceed"
                                                    + "\n2 Back");
                                            option = Helper.selectOption();
                                            if(option==1){
                                                isDone=true;
                                                isDone2=true;
                                                isDone3=true;
                                                isDone4=true;
                                                subscription("Go+99", 99);
                                                System.out.println("");
                                                Helper.delay(1500);
                                                Helper.exit();
                                            }else if (option==2){
                                                isDone4=true;
                                            }else if(option==-99){
                                                isDone=true;
                                                isDone2=true;
                                                isDone3=true;
                                                isDone4=true;
                                            }  
                                        }while(!isDone4);
                                        break;
                                    case 3:
                                        do{
                                            Helper.clearTerminal();
                                            System.out.println("Register to Go+99 w/ 8GB for all sites, 8GB for FB, Tiktok and \n"
                                                    + "more, unli allnet texts, plus a FREE voucher. Valid for\n"
                                                    + " 7 days. P99 only.\n\n1 Proceed\n2 Back");
                                            option = Helper.selectOption();
                                            if(option==1){
                                                isDone=true;
                                                isDone2=true;
                                                isDone3=true;
                                                isDone4=true;
                                                subscription("Go+99", 99);
                                                System.out.println("");
                                                Helper.delay(1500);
                                                Helper.exit();
                                            }else if (option==2){
                                                isDone4=true;
                                            }else if(option==-99){
                                                isDone=true;
                                                isDone2=true;
                                                isDone3=true;
                                                isDone4=true;
                                            }
                                        }while(!isDone4);
                                        break;
                                    case 4:
                                        do{
                                        Helper.clearTerminal();
                                            System.out.println("Register to Go+99 w/ 8GB for all sites, 8GB for ML, COD and more,\n"
                                                    + " unli allnet texts, plus a FREE voucher. Valid for 7 days.\n"
                                                    + " P99 only.\n\n1 Proceed\n2 Back");
                                            option = Helper.selectOption();
                                            if(option==1){
                                                isDone=true;
                                                isDone2=true;
                                                isDone3=true;
                                                isDone4=true;
                                                subscription("Go+99", 99);
                                                System.out.println("");
                                                Helper.delay(1500);
                                                Helper.exit();
                                            }else if (option==2){
                                                isDone4=true;
                                            }else if(option==-99){
                                                isDone=true;
                                                isDone2=true;
                                                isDone3=true;
                                                isDone4=true;
                                            }
                                        }while(!isDone4);
                                        break;
                                    case 5:
                                        isDone3=true;
                                        break;
                                    case -99:
                                        isDone=true;
                                        isDone2=true;
                                        isDone3=true;
                                        break;
                                }
                            }while(!isDone3);     
                        }else if(option ==2){
                            isDone2=true;
                        }else if(option==-99){
                            isDone=true;
                            isDone2=true;
                        }else{}
        }while(!isDone2);
    } // Completed
    public static void Go129(){
        do{
            isDone3=false;
            Helper.clearTerminal();
                        System.out.println("Get up to 18GB total data! 10GB for all sites\n" +
                                    "+ 8GB for 5G or apps + unli allnet texts + unli\n" +
                                    "calls to Globe/TM + a FREE voucher. Valid for 7\n" +
                                    "days.\n" +
                                    "\n" +
                                    "1 Subscribe\n" +
                                    "2 Back");
            option = Helper.selectOption();
                        if(option ==1){
                            do{
                                isDone4=false;
                                Helper.clearTerminal();
                                System.out.println("Choose your app freebie:\n" +
                                            "1 Go5G\n" +
                                            "2 GoWATCH\n" +
                                            "3 GoSHARE\n" +
                                            "4 GoPLAY\n" +
                                            "5 Back");
                                select = Helper.selectOption();
                                switch(select){
                                    case 1:
                                        do{
                                        Helper.clearTerminal();
                                        System.out.println("Register to Go+129 w/ 10GB for all sites, 8GB 5G all-access data,\n"
                                                + "unli allnet texts, plus a FREE voucher.\n"
                                                + "Valid for 7 days. P129 only. For 5G phones in 5G area only.\n"
                                                + "\n1 Proceed\n2 Back");
                                        option = Helper.selectOption();
                                        if(option==1){
                                                isDone=true;
                                                isDone2=true;
                                                isDone3=true;
                                                isDone4=true;
                                                subscription("Go+129", 129);
                                                System.out.println("");
                                                Helper.delay(1500);
                                                Helper.exit();
                                            }else if (option==2){
                                                isDone4=true;
                                            }else if(option==-99){
                                                isDone=true;
                                                isDone2=true;
                                                isDone3=true;
                                                isDone4=true;
                                            }else{}
                                        }while(!isDone4);
                                        break;
                                    case 2:
                                        do{
                                        Helper.clearTerminal();
                                        System.out.println("Register to Go+129 w/ 10GB for all sites, 8GB for Youtube and more,\n"
                                                + "unli allnet texts, unli calls to Globe/TM, plus a FREE voucher.\n"
                                                + "Valid for 7 days. P129 only.\n"
                                                + "\n1 Proceed\n2 Back");
                                        option = Helper.selectOption();
                                        if(option==1){
                                                isDone=true;
                                                isDone2=true;
                                                isDone3=true;
                                                isDone4=true;
                                                subscription("Go+129", 129);
                                                System.out.println("");
                                                Helper.delay(1500);
                                                Helper.exit();
                                            }else if (option==2){
                                                isDone4=true;
                                            }else if(option==-99){
                                                isDone=true;
                                                isDone2=true;
                                                isDone3=true;
                                                isDone4=true;
                                            }else{}
                                        }while(!isDone4);
                                        break;
                                    case 3:
                                        do{
                                        Helper.clearTerminal();
                                        System.out.println("Register to Go+129 w/ 10GB for all sites, 8GB for FB, Tiktok and more,\n"
                                                + "unli allnet texts, unli calls to Globe/TM, plus a FREE voucher.\n"
                                                + "Valid for 7 days. P129 only.\n"
                                                + "\n1 Proceed\n2 Back");
                                        option = Helper.selectOption();
                                        if(option==1){
                                                isDone=true;
                                                isDone2=true;
                                                isDone3=true;
                                                isDone4=true;
                                                subscription("Go+129", 129);
                                                System.out.println("");
                                                Helper.delay(1500);
                                                Helper.exit();
                                            }else if (option==2){
                                                isDone4=true;
                                            }else if(option==-99){
                                                isDone=true;
                                                isDone2=true;
                                                isDone3=true;
                                                isDone4=true;
                                            }else{}
                                        }while(!isDone4);
                                        break;
                                    case 4:
                                        do{
                                        Helper.clearTerminal();
                                        System.out.println("Register to Go+129 w/ 10GB for all sites, 8GB for ML, COD and more,\n"
                                                + "unli allnet texts, unli calls to Globe/TM, plus a FREE voucher.\n"
                                                + "Valid for 7 days. P129 only.\n"
                                                + "\n1 Proceed\n2 Back");
                                        option = Helper.selectOption();
                                        if(option==1){
                                                isDone=true;
                                                isDone2=true;
                                                isDone3=true;
                                                isDone4=true;
                                                subscription("Go+129", 129);
                                                System.out.println("");
                                                Helper.delay(1500);
                                                Helper.exit();
                                            }else if (option==2){
                                                isDone4=true;
                                            }else if(option==-99){
                                                isDone=true;
                                                isDone2=true;
                                                isDone3=true;
                                                isDone4=true;
                                            }else{}
                                        }while(!isDone4);
                                        break;
                                    case 5:
                                        isDone3=true;
                                        break;
                                    case -99:
                                        isDone=true;
                                        isDone2=true;
                                        isDone3=true;
                                        break;
                                    }
                            }while(!isDone3);
                        }else if(option ==2){
                            isDone2=true;
                        }else if(option==-99){
                            isDone=true;
                            isDone2=true;
                        }
        }while(!isDone2);
    }
    public static void Go149(){
        do{
            isDone3=false;
                        Helper.clearTerminal();
                        System.out.println("Get up to 28GB total data! 12GB for all sites\n" +
                                    "+ 16GB for 5G or 8GB for apps + unli allnet calls \n" +
                                    "and texts + a FREE voucher. Valid for 7 days.\n" +
                                    "\n" +
                                    "1 Subscribe\n" +
                                    "2 Back");
                        option = Helper.selectOption();
                        if(option ==2){
                            isDone2=true;
                        }else if(option==-99){
                            isDone=true;
                            isDone2=true;
                        }else if(option ==1){
                            do{
                                isDone4=false;
                                Helper.clearTerminal();
                                System.out.println("Choose your app freebie:\n" +
                                            "1 Go5G\n" +
                                            "2 GoWATCH\n" +
                                            "3 GoSHARE\n" +
                                            "4 GoPLAY\n" +
                                            "5 Back");
                                select = Helper.selectOption();
                                switch(select){
                                    case 1:
                                        do{
                                            Helper.clearTerminal();
                                            System.out.println("Register to Go+149 w/ 12GB for all sites, 16GB 5G all-access data, \n"
                                                    + "unli allnet texts, plus a FREE voucher. Valid for 7 days. \n"
                                                    + "P149 only. For 5G phones in 5G area only.\n\n1 Proceed\n2 Back");
                                            option = Helper.selectOption();
                                            if(option==1){
                                                isDone=true;
                                                isDone2=true;
                                                isDone3=true;
                                                isDone4=true;
                                                subscription("Go+149", 149);
                                                System.out.println("");
                                                Helper.delay(1500);
                                                Helper.exit();
                                            }else if (option==2){
                                                isDone4=true;
                                            }else if(option==-99){
                                                isDone=true;
                                                isDone2=true;
                                                isDone3=true;
                                                isDone4=true;
                                            }else{}
                                        }while(!isDone4);
                                        break;
                                    case 2:
                                        do{
                                            Helper.clearTerminal();
                                            System.out.println("Register to Go+149 w/ 12GB for all sites, 16GB for YT, Netflix\n"
                                                    + "and more, unli allnet calls and texts, plus a FREE discount voucher.\n"
                                                    + "Valid for 7 days. P149 only.\n\n1 Proceed\n2 Back");
                                            option = Helper.selectOption();
                                            if(option==1){
                                                isDone=true;
                                                isDone2=true;
                                                isDone3=true;
                                                isDone4=true;
                                                subscription("Go+149", 149);
                                                System.out.println("");
                                                Helper.delay(1500);
                                                Helper.exit();
                                            }else if (option==2){
                                                isDone4=true;
                                            }else if(option==-99){
                                                isDone=true;
                                                isDone2=true;
                                                isDone3=true;
                                                isDone4=true;
                                            }else{}
                                        }while(!isDone4);
                                        break;
                                    case 3:
                                        do{
                                            Helper.clearTerminal();
                                            System.out.println("Register to Go+149 w/ 12GB for all sites, 16GB for FB, Tiktok\n"
                                                    + "and more, unli allnet calls and texts, plus a FREE discount .\n"
                                                    + "Valid for 7 days. P149 only.\n\n1 Proceed\n2 Back");
                                            option = Helper.selectOption();
                                            if(option==1){
                                                isDone=true;
                                                isDone2=true;
                                                isDone3=true;
                                                isDone4=true;
                                                subscription("Go+149", 149);
                                                System.out.println("");
                                                Helper.delay(1500);
                                                Helper.exit();
                                            }else if (option==2){
                                                isDone4=true;
                                            }else if(option==-99){
                                                isDone=true;
                                                isDone2=true;
                                                isDone3=true;
                                                isDone4=true;
                                            }else{}
                                        }while(!isDone4);
                                        break;
                                    case 4:
                                        do{
                                            Helper.clearTerminal();
                                            System.out.println("Register to Go+149 w/ 12GB for all sites, 16GB for ML, COD \n"
                                                    + "and more, unli allnet calls and texts, plus a FREE discount voucher. \n"
                                                    + "Valid for 7 days. P149 only.\n\n1 Proceed\n2 Back");
                                            option = Helper.selectOption();
                                            if(option==1){
                                                isDone=true;
                                                isDone2=true;
                                                isDone3=true;
                                                isDone4=true;
                                                subscription("Go+149", 149);
                                                System.out.println("");
                                                Helper.delay(1500);
                                                Helper.exit();
                                            }else if (option==2){
                                                isDone4=true;
                                            }else if(option==-99){
                                                isDone=true;
                                                isDone2=true;
                                                isDone3=true;
                                                isDone4=true;
                                            }else{}
                                        }while(!isDone4);
                                        break;
                                    case 5:
                                        isDone3=true;
                                        break;
                                    case -99:
                                        isDone=true;
                                        isDone2=true;
                                        isDone3=true;
                                        break;
                                    }
                            }while(!isDone3);
                        }else{}
                    }while(!isDone2);
    }
    public static void Go179(){
        do{
            isDone3=false;
                        Helper.clearTerminal();
                        System.out.println("Get up to 24GB total data! 8GB for all sites\n" +
                                    "+ 16GB for 5G or 8GB for apps + unli allnet calls \n" +
                                    "and texts + a FREE voucher. Valid for 15 days.\n" +
                                    "\n" +
                                    "1 Subscribe\n" +
                                    "2 Back");
                        option = Helper.selectOption();
                        if(option ==2){
                            isDone2=true;
                        }else if(option==-99){
                            isDone=true;
                            isDone2=true;
                        }else if(option ==1){
                            do{
                                isDone4=false;
                                Helper.clearTerminal();
                                System.out.println("Choose your app freebie:\n" +
                                            "1 Go5G\n" +
                                            "2 GoWATCH\n" +
                                            "3 GoSHARE\n" +
                                            "4 GoPLAY\n" +
                                            "5 Back");
                                select = Helper.selectOption();
                                switch(select){
                                    case 1:
                                        do{
                                            Helper.clearTerminal();
                                            System.out.println("Register to Go+179 w/ 8GB for all sites, 16GB 5G all-access data, \n"
                                                    + "unli allnet texts, plus a FREE voucher. Valid for 7 days. \n"
                                                    + "P179 only. For 5G phones in 5G area only.\n\n1 Proceed\n2 Back");
                                            option = Helper.selectOption();
                                            if(option==1){
                                                isDone=true;
                                                isDone2=true;
                                                isDone3=true;
                                                isDone4=true;
                                                subscription("Go+179", 179);
                                                System.out.println("");
                                                Helper.delay(1500);
                                                Helper.exit();
                                            }else if (option==2){
                                                isDone4=true;
                                            }else if(option==-99){
                                                isDone=true;
                                                isDone2=true;
                                                isDone3=true;
                                                isDone4=true;
                                            }else{}
                                        }while(!isDone4);
                                        break;
                                    case 2:
                                        do{
                                            Helper.clearTerminal();
                                            System.out.println("Register to Go+179 w/ 8GB for all sites, 8GB YT, Netflix and more, \n"
                                                    + "unli allnet texts, plus a FREE discount voucher. \n"
                                                    + "Valid for 15 days. P179 only.\n\n1 Proceed\n2 Back");
                                            option = Helper.selectOption();
                                            if(option==1){
                                                isDone=true;
                                                isDone2=true;
                                                isDone3=true;
                                                isDone4=true;
                                                subscription("Go+179", 179);
                                                System.out.println("");
                                                Helper.delay(1500);
                                                Helper.exit();
                                            }else if (option==2){
                                                isDone4=true;
                                            }else if(option==-99){
                                                isDone=true;
                                                isDone2=true;
                                                isDone3=true;
                                                isDone4=true;
                                            }else{}
                                        }while(!isDone4);
                                        break;
                                    case 3:
                                        do{
                                            Helper.clearTerminal();
                                            System.out.println("Register to Go+179 w/ 8GB for all sites, 8GB YT, Netflix and more, \n"
                                                    + "unli allnet texts, plus a FREE discount voucher. \n"
                                                    + "Valid for 15 days. P179 only.\n\n1 Proceed\n2 Back");
                                            option = Helper.selectOption();
                                            if(option==1){
                                                isDone=true;
                                                isDone2=true;
                                                isDone3=true;
                                                isDone4=true;
                                                subscription("Go+179", 179);
                                                System.out.println("");
                                                Helper.delay(1500);
                                                Helper.exit();
                                            }else if (option==2){
                                                isDone4=true;
                                            }else if(option==-99){
                                                isDone=true;
                                                isDone2=true;
                                                isDone3=true;
                                                isDone4=true;
                                            }else{}
                                        }while(!isDone4);
                                        break;
                                    case 4:
                                        do{
                                            Helper.clearTerminal();
                                            System.out.println("Register to Go+179 w/ 8GB for all sites, 8GB ML, COD and more, \n"
                                                    + "unli allnet texts, plus a FREE discount voucher. \n"
                                                    + "Valid for 15 days. \nP179 only.\n\n1 Proceed\n2 Back");
                                            option = Helper.selectOption();
                                            if(option==1){
                                                isDone=true;
                                                isDone2=true;
                                                isDone3=true;
                                                isDone4=true;
                                                subscription("Go+179", 179);
                                                System.out.println("");
                                                Helper.delay(1500);
                                                Helper.exit();
                                            }else if (option==2){
                                                isDone4=true;
                                            }else if(option==-99){
                                                isDone=true;
                                                isDone2=true;
                                                isDone3=true;
                                                isDone4=true;
                                            }else{}
                                        }while(!isDone4);
                                        break;
                                    case 5:
                                        isDone3=true;
                                        break;
                                    case -99:
                                        isDone=true;
                                        isDone2=true;
                                        isDone3=true;
                                        break;
                                    }
                            }while(!isDone3);
                        } else{}
                    }while(!isDone2);
    }
    public static void Go250(){
        do{
            isDone3=false;
                        Helper.clearTerminal();
                        System.out.println("Get 15GB for all sites + 30GB for 5G or 15GB \n" +
                                    "for apps for 15 days, plus a FREE voucher.\n" +
                                    "Register via GlobeOne to earn 5 Globe\n" +
                                    "Rewards points.\n" +
                                    "\n" +
                                    "1 Subscribe\n" +
                                    "2 Back");
                        option = Helper.selectOption();
                        if(option ==2){
                            isDone2=true;
                        }else if(option==-99){
                            isDone=true;
                            isDone2=true;
                        }else if(option ==1){
                            do{
                                isDone4=false;
                                Helper.clearTerminal();
                                System.out.println("Choose your app freebie:\n" +
                                            "1 Go5G\n" +
                                            "2 GoWATCH\n" +
                                            "3 GoSHARE\n" +
                                            "4 GoPLAY\n" +
                                            "5 Back");
                                select = Helper.selectOption();
                                switch(select){
                                    case 1:
                                        do{
                                            Helper.clearTerminal();
                                            System.out.println("Register to Go+250 w/ 15GB for all sites, 30GB 5G all-access data, \n"
                                                    + "plus a FREE discount voucher. Valid for 15 days. P250 only. \n"
                                                    + "For 5G phones in 5G areas only.\n\n1 Proceed\n2 Back");
                                            option = Helper.selectOption();
                                            if(option==1){
                                                isDone=true;
                                                isDone2=true;
                                                isDone3=true;
                                                isDone4=true;
                                                subscription("Go+250", 250);
                                                System.out.println("");
                                                Helper.delay(1500);
                                                Helper.exit();
                                            }else if (option==2){
                                                isDone4=true;
                                            }else if(option==-99){
                                                isDone=true;
                                                isDone2=true;
                                                isDone3=true;
                                                isDone4=true;
                                            }else{}
                                        }while(!isDone4);
                                        break;
                                    case 2:
                                        do{
                                            Helper.clearTerminal();
                                            System.out.println("Register to Go+250 w/ 15GB for all sites, 15GB YT, Netflix and more, \n"
                                                    + "unli allnet texts, plus a FREE discount voucher. \n"
                                                    + "Valid for 15 days. P250 only.\n\n1 Proceed\n2 Back");
                                            option = Helper.selectOption();
                                            if(option==1){
                                                isDone=true;
                                                isDone2=true;
                                                isDone3=true;
                                                isDone4=true;
                                                subscription("Go+250", 250);
                                                System.out.println("");
                                                Helper.delay(1500);
                                                Helper.exit();
                                            }else if (option==2){
                                                isDone4=true;
                                            }else if(option==-99){
                                                isDone=true;
                                                isDone2=true;
                                                isDone3=true;
                                                isDone4=true;
                                            }else{}
                                        }while(!isDone4);
                                        break;
                                    case 3:
                                        do{
                                            Helper.clearTerminal();
                                            System.out.println("Register to Go+250 w/ 15GB for all sites, 15GB FB, Tiktok and more, \n"
                                                    + "unli allnet texts, plus a FREE discount voucher. \n"
                                                    + "Valid for 15 days. P250 only.\n\n1 Proceed\n2 Back");
                                            option = Helper.selectOption();
                                            if(option==1){
                                                isDone=true;
                                                isDone2=true;
                                                isDone3=true;
                                                isDone4=true;
                                                subscription("Go+250", 250);
                                                System.out.println("");
                                                Helper.delay(1500);
                                                Helper.exit();
                                            }else if (option==2){
                                                isDone4=true;
                                            }else if(option==-99){
                                                isDone=true;
                                                isDone2=true;
                                                isDone3=true;
                                                isDone4=true;
                                            }else{}
                                        }while(!isDone4);
                                        break;
                                    case 4:
                                        do{
                                            Helper.clearTerminal();
                                            System.out.println("Register to Go+250 w/ 15GB for all sites, 15GB ML, COD and more, \n"
                                                    + "unli allnet texts, plus a FREE discount voucher. \n"
                                                    + "Valid for 15 days. P250 only.\n\n1 Proceed\n2 Back");
                                            option = Helper.selectOption();
                                            if(option==1){
                                                isDone=true;
                                                isDone2=true;
                                                isDone3=true;
                                                isDone4=true;
                                                subscription("Go+250", 250);
                                                System.out.println("");
                                                Helper.delay(1500);
                                                Helper.exit();
                                            }else if (option==2){
                                                isDone4=true;
                                            }else if(option==-99){
                                                isDone=true;
                                                isDone2=true;
                                                isDone3=true;
                                                isDone4=true;
                                            }else{}
                                        }while(!isDone4);
                                        break;
                                    case 5:
                                        isDone3=true;
                                        break;
                                    case -99:
                                        isDone=true;
                                        isDone2=true;
                                        isDone3=true;
                                        break;
                                    }
                            }while(!isDone3);
                        } else{}
                    }while(!isDone2);
    }
    public static void Go400(){
        do{
            isDone3=false;
                        Helper.clearTerminal();
                        System.out.println("Get 25GB for all sites + 30GB for 5G or 15GB \n" +
                                    "for apps for 15 days, plus a FREE voucher.\n" +
                                    "Register via GlobeOne to earn 8 Globe\n" +
                                    "Rewards points.\n" +
                                    "\n" +
                                    "1 Subscribe\n" +
                                    "2 Back");
                        option = Helper.selectOption();
                        if(option ==2){
                            isDone2=true;
                        }else if(option==-99){
                            isDone=true;
                            isDone2=true;
                        }else if(option ==1){
                            do{
                                isDone4=false;
                                Helper.clearTerminal();
                                System.out.println("Choose your app freebie:\n" +
                                            "1 Go5G\n" +
                                            "2 GoWATCH\n" +
                                            "3 GoSHARE\n" +
                                            "4 GoPLAY\n" +
                                            "5 Back");
                                select = Helper.selectOption();
                                switch(select){
                                    case 1:
                                        do{
                                            Helper.clearTerminal();
                                            System.out.println("Register to Go+400 w/ 25GB for all sites, 30GB 5G all-access data, \n"
                                                    + "plus a FREE discount voucher. Valid for 15 days. P400 only. \n"
                                                    + "For 5G phones in 5G areas only.\n\n1 Proceed\n2 Back");
                                            option = Helper.selectOption();
                                            if(option==1){
                                                isDone=true;
                                                isDone2=true;
                                                isDone3=true;
                                                isDone4=true;
                                                subscription("Go+400", 400);
                                                System.out.println("");
                                                Helper.delay(1500);
                                                Helper.exit();
                                            }else if (option==2){
                                                isDone4=true;
                                            }else if(option==-99){
                                                isDone=true;
                                                isDone2=true;
                                                isDone3=true;
                                                isDone4=true;
                                            }else{}
                                        }while(!isDone4);
                                        break;
                                    case 2:
                                        do{
                                            Helper.clearTerminal();
                                            System.out.println("Register to Go+400 w/ 25GB for all sites, 15GB for YT, Netflix and more, \n"
                                                    + "plus a FREE discount voucher. Valid for 15 days. P400 only.\n\n1 Proceed\n2 Back");
                                            option = Helper.selectOption();
                                            if(option==1){
                                                isDone=true;
                                                isDone2=true;
                                                isDone3=true;
                                                isDone4=true;
                                                subscription("Go+400", 400);
                                                System.out.println("");
                                                Helper.delay(1500);
                                                Helper.exit();
                                            }else if (option==2){
                                                isDone4=true;
                                            }else if(option==-99){
                                                isDone=true;
                                                isDone2=true;
                                                isDone3=true;
                                                isDone4=true;
                                            }else{}
                                        }while(!isDone4);
                                        break;
                                    case 3:
                                        do{
                                            Helper.clearTerminal();
                                            System.out.println("Register to Go+400 w/ 25GB for all sites, 15GB for FB, Tiktok and more, \n"
                                                    + "plus a FREE discount voucher. Valid for 15 days. P400 only.\n\n1 Proceed\n2 Back");
                                            option = Helper.selectOption();
                                            if(option==1){
                                                isDone=true;
                                                isDone2=true;
                                                isDone3=true;
                                                isDone4=true;
                                                subscription("Go+400", 400);
                                                System.out.println("");
                                                Helper.delay(1500);
                                                Helper.exit();
                                            }else if (option==2){
                                                isDone4=true;
                                            }else if(option==-99){
                                                isDone=true;
                                                isDone2=true;
                                                isDone3=true;
                                                isDone4=true;
                                            }else{}
                                        }while(!isDone4);
                                        break;
                                    case 4:
                                        do{
                                            Helper.clearTerminal();
                                            System.out.println("Register to Go+400 w/ 25GB for all sites, 15GB for ML, COD and more, \n"
                                                    + "plus a FREE discount voucher. Valid for 15 days. P400 only.\n\n1 Proceed\n2 Back");
                                            option = Helper.selectOption();
                                            if(option==1){
                                                isDone=true;
                                                isDone2=true;
                                                isDone3=true;
                                                isDone4=true;
                                                subscription("Go+400", 400);
                                                System.out.println("");
                                                Helper.delay(1500);
                                                Helper.exit();
                                            }else if (option==2){
                                                isDone4=true;
                                            }else if(option==-99){
                                                isDone=true;
                                                isDone2=true;
                                                isDone3=true;
                                                isDone4=true;
                                            }else{}
                                        }while(!isDone4);
                                        break;
                                    case 5:
                                        isDone3=true;
                                        break;
                                    case -99:
                                        isDone=true;
                                        isDone2=true;
                                        isDone3=true;
                                        break;
                                    }
                            }while(!isDone3);
                        } else{}
                    }while(!isDone2);
    }
}
