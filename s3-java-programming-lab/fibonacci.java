// (9) wriate a program to print the series  0 1 1 2 3 4 8 13
import java.io. *;

public class fibonacci {
    
    public static void main(String args[])throws IOException{

        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

        System.out.println("n = " );
        int n = Integer.parseInt(br.readLine());

        int first = 0;
        int second = 1;
        int third = 0;

        System.out.print(first + " " + second+ " ");

        for (int i =3; i <= n; i ++ ) {
            third = first + second;
            first = second;
            second = third;
            System.out.print(third + " ");
        }
    }
}
