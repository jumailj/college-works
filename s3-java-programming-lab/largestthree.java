// (4) write a program to find the largest of three numbers
import java.io. *;
public class largestthree{
    public static void main(String args[]) throws IOException{

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("a = ");
        int a = Integer.parseInt(bf.readLine());
        System.out.println("b = ");
        int b = Integer.parseInt(bf.readLine());
        System.out.println("c = ");
        int c = Integer.parseInt(bf.readLine());

        if ( a > b ) {

            if ( a > c) {
                System.out.println("a is larger");
            } else {
                System.out.println("c is larger");
            }
        } else {
            if ( b > c) {
                System.out.println("b is larger");
            } else {
                System.out.println("c is lareger");
            }
        }

    }
}