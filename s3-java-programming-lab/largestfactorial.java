// (3)  write a program to find the larger of two numbers and find the  factorial of the largest.
import java.io. *;

public class largestfactorial {
    public static void main(String args[]) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int firstNumber = Integer.parseInt(bf.readLine());
        int secondNumber = Integer.parseInt(bf.readLine());
        int number;
        int fac = 1;

        if ( firstNumber > secondNumber) {
            number = firstNumber;
        }
        else {
            number = secondNumber;
        }
        
        for (int i = 1; i <= number; i++ ) {
            fac = fac *i;
        }

        System.out.println("factorial = " +fac);
    }
}