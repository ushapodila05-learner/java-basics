import java.util.Scanner;

public class Roots {

    public static void main(String args[]) {
        int a, b, c, r1, r2;
        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        System.out.println("ENTER A VALUE OF a: " + a);
        b = in.nextInt();
        System.out.println("ENTER A VALUE OF b: " + b);
        c = in.nextInt();
        System.out.println("ENTER A VALUE OF c: " + c);

        r1 = -b + (b * b - 4 * a * c);

        r2 = -b - (b * b - 4 * a * c);
        System.out.println("ROOTS ARE r1: " + r1);
        System.out.println("ROOTS ARE r2: " + r2);

        in.close();
    }

}
