// (6) write a program to find the factorial of a number
import java.io. *;

public class factorial {

    public static void main(String args[]) throws IOException{

       BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("number: " );
        int number = Integer.parseInt(bf.readLine());
        int fac = 1;
        for ( int i = 1; i < number; i++ ) {
                fac *=i;
        }

        System.out.println("factorial = " + fac);

    }
}