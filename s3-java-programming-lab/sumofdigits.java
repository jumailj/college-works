// (8) Write a program to find the sum of the digits of a number.
import java.io. *;
public class sumofdigits {
    public static void main(String args[] ) throws IOException{

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("number: ");
        int number = Integer.parseInt(bf.readLine());

        int sum = 0;
        int remainder = 0;

        while (number !=0) {
                remainder = number%10;
                number = number/10;
                sum += remainder;
        }
        System.out.println("sum = " + sum);
    }

}