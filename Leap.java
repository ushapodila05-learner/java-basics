import java.util.Scanner;

public class Leap {
    public static void main(String args[]) {
        int year;
        Scanner in = new Scanner(System.in);
        year = in.nextInt();
        System.out.println("enter a year: " + year);
        if (year % 4 == 0) {

            System.out.println("its a leap year");

        } else {

            System.out.println("its not  a leap year");

        }
        in.close();
    }

}
