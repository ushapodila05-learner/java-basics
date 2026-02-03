import java.util.Scanner;

public class Largeno {

    public static void main(String args[]) {
        int a, b, c;
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        System.out.println("ENTER A VALUE OF a: " + a);
        b = in.nextInt();
        System.out.println("ENTER A VALUE OF b: " + b);
        c = in.nextInt();
        System.out.println("ENTER A VALUE OF c: " + c);

        if (a >= b && a >= c) {

            System.out.println("a IS LARGER NUMBER THAN b AND c");

        } else if (b >= a && b >= c) {

            System.out.println("b IS LARGER NUMBER THAN a AND c");

        } else {

            System.out.println("c IS LARGER NUMBER THAN a AND b");

        }
        in.close();
    }

}
