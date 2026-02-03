
import java.util.Scanner;

public class Char {
    public static void main(String args[]) {
        char ch;
        Scanner in = new Scanner(System.in);

        ch = in.next().charAt(0);
        System.out.println("ENTER A SINGLE CHARACTER: " + ch);

        if (ch == 'A' || ch == 'E' || ch == 'U' || ch == 'O' || ch == 'I')

        {
            System.out.println("the letter be big letter vowel");

        }

        else if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')

        {
            System.out.println("the letter be small letter vowel");

        } else {

            System.out.println("the letter be consonat");

        }
        in.close();

    }

}
