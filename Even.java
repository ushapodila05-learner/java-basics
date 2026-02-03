import java.util.Scanner;

public class Even {
    public static void main(String args[]) {

        int a;

        Scanner in = new Scanner(System.in);
        a = in.nextInt();
        System.out.println("enter a value: " + a);

        if (a % 2 == 0)

        {
            System.out.println("It is a even");
        } else {
            System.out.println("It is not even");
        }
        in.close();
    }
}
