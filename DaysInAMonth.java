import java.util.Scanner;

public class DaysInAMonth {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean checker = true;
        String s_month = "";
        String s_days = "31 days.";
    
        System.out.print("Enter the month: ");
        short month = input.nextShort();
        System.out.print("Enter the year: ");
        int year = input.nextInt();

        switch(month) {
            case 1: s_month = "January " ; break;
            case 2: s_month = "February "; 
                    if(year % 4 == 0 && year % 100 != 0) {
                        s_days = "29 days.";
                    } else {
                        s_days = "28 days.";
                    }
                    break;
            case 3: s_month = "March "; break;
            case 4: s_month = "April "; s_days = "30 days."; break;
            case 5: s_month = "May "; break;
            case 6: s_month = "June "; s_days = "30 days."; break;
            case 7: s_month = "July "; break;
            case 8: s_month = "August "; break;
            case 9: s_month = "Septemer "; s_days = "30 days."; break;
            case 10: s_month = "October "; break;
            case 11: s_month = "November "; s_days = "30 days."; break;
            case 12: s_month = "December "; break;
            default: checker = false; break;
        }

        if(checker) {
            System.out.println(s_month + year + " had " + s_days);
        } else {
            System.out.println("Invalid entry!");
        }

    }
    
}
