// (11) Write a program to check the number is palindrome or not.
import java.io. *;

public class palindrome {
    public static void main(String args[]) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("number: ");
        int number = Integer.parseInt(br.readLine());
        int numTemp = number;

        int remainder = 0;
        int reverse = 0;

        while (number != 0) {
            remainder = number %10;
            number  = number/10;
            reverse = (reverse * 10 )+remainder;
        }

        if (numTemp == reverse) {
            System.out.println(numTemp+ " is a palindrome");
        } else {
            System.out.println(numTemp + " is not a palindorm");
        }
    }
}
