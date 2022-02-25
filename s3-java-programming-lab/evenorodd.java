// (5) Write a program to assign a number to variable and check whether it is even or not.
// if it is even display all its divisors.
// if it is odd display its cube.

import java.io. *;

public class evenorodd {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("number= ");
        int number = Integer.parseInt(br.readLine());

        if ( number %2 == 0) {
                System.out.println("number is even\n");
            
                System.out.println("divisors:\n");
                for (int i =1; i < number; i++ ) {
                    if ( number % i== 0) {
                        System.out.println(i + " is divisible\n");
                    }
                }
        } else {
                System.out.println("number is odd");
                int cube = number*number*number;
                System.out.println("cube = " + cube);
        }
    }
}