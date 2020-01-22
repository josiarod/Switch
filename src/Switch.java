import java.util.Scanner;
public class Switch {
    public static void main(String[] args){
        int numberOfDays;
        System.out.print("Type numbers of days: ");
        Scanner keyboard = new Scanner(System.in);
        numberOfDays = keyboard.nextInt();

        String listOfMonth;
        switch (numberOfDays) {
            case 30: listOfMonth = "September, April, June";
                     break;
            case 31: listOfMonth = "January, March, May, July, August, October, December";
                     break;
            case 29: listOfMonth = "February";
                     break;
            case 28: listOfMonth = "February";
                break;
            default: listOfMonth = "Not months have exactly " + numberOfDays+ " days.";

        }
        System.out.println(listOfMonth);

    }
}
