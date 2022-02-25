// write a progrma to display the following:
/*
1
1 2
1 2 3
1 2 3 4
*/

import java.io. *;
public class pattern1 {
    
    public static void main( String args[]) throws IOException{
            for (int i = 1; i < 5; i++ ) {
                for (int j = 1; j < i+1; j++ ) {
                        System.out.print(j + " ");
                }
                    System.out.println();  
            }
    }
}
