// (10) write a program to check a number is prime or not.
import java.io. *;

public class primenumber {
    
    public static void main(String args[]) throws IOException{
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("number:");
        int number= Integer.parseInt(br.readLine());

        int flag = 1;

        for (int i =2; i < number; i++ ) {
                if ( number %i == 0) {
                        flag = 0;
                }
        }

        if ( flag == 1){
            System.out.println(number + " is prime");
        } else {
            System.out.println(number +  " is not prime");
        }

    }
}
