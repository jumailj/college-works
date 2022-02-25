// (13) write a program to display the following:
/*
1
2 2
3 3 3
*/
import java.io. *;
public class pattern2 {
    
    public static void main(String args[]) throws IOException{

        for (int i = 1; i < 4; i++ ) {
            for ( int j = 1; j < i+1; j++ ) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
