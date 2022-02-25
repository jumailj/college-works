// (1) write a program to find simple interest;
import java.io. *;
public class interest {
    public static void main(String args[]) throws IOException  {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("principal amount: ");
        int amount = Integer.parseInt(br.readLine());

        System.out.println("annumal intrest rate:");
        int intrest = Integer.parseInt(br.readLine());

        System.out.println("year : ");
        int year = Integer.parseInt(br.readLine());

        int finalAmount =  (amount*intrest* year)/100;

        System.out.println("final amount = " + finalAmount);
    }
}