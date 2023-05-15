import java.util.Scanner;
public class DayOfAMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int days = 0;
        int year = 0;
        while (true) {
            System.out.print("Enter the month: ");
            String month = input.nextLine();
            System.out.print("Enter the year: ");
            year = input.nextInt();
            while (year < 0) {
                System.out.println("Invalid year. Please enter again.");
                System.out.print("Enter the year: ");
                year = input.nextInt();
            }
            switch (month) {
                case "January":
                case "Jan.":
                case "Jan":   
                case "1":
                    days = 31;
                    break;
                case "February":
                case "Feb.":
                case "Feb":
                case "2":
                    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                        days = 29;
                    } else {
                        days = 28;
                    }
                    break;
                case "March":
                case "Mar.":
                case "Mar":
                case "3":
                    days = 31;
                    break;
                case "April":
                case "Apr.":
                case "Apr":
                case "4":
                    days = 30;
                    break;
                case "May.":
                case "May":
                case "5":
                    days = 31;
                    break;
                case "June":
                case "Jun.":
                case "Jun":
                case "6":
                    days = 30;
                    break;
                case "July":
                case "Jul.":
                case "Jul":
                case "7":
                    days = 31;
                    break;
                case "August":
                case "Aug.":
                case "Aug":
                case "8":
                    days = 31;
                    break;
                case "September":
                case "Sep.":
                case "Sep":
                case "9":
                    days = 30;
                    break;
                case "October":
                case "Oct.":
                case "Oct":
                case "10":
                    days = 31;
                    break;
                case "November":
                case "Nov.":
                case "Nov":
                case "11":
                    days = 30;
                    break;
                case "December":
                case "Dec.":
                case "Dec":
                case "12":
                    days = 31;
                    break;
                default:
                    System.out.println("Invalid month. Please enter again.");
                    continue;
            }
            break;
        }
        System.out.println(days + " days");
    }
}
