import java.util.Scanner;

class Basic

{

    public static void main(String args[]) {

        int a, b;

        Scanner in = new Scanner(System.in);

        System.out.println("ENTER A VALUE OF a: ");
        a = in.nextInt();

        System.out.println("ENTER A VALUE OF b:  ");
        b = in.nextInt();
        int sub = a - b;
        System.out.println("sub of a,b: " + sub);
        in.close();
    }

}
