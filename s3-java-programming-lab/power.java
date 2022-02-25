// (7) write a program to find the n,th power of a number(using for loop).
import java.io. *;

public class power {

    public static void main (String args[])throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("number: ");
        int num = Integer.parseInt(br.readLine());
        System.out.println("power: ");
        int pow = Integer.parseInt(br.readLine());

        int ans = 1;

        for (int i =1; i <= pow; i++ ){
            ans = ans* num;
        }

        System.out.println("power = "+ ans);

    }
    
}