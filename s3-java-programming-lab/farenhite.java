// (2) write a program to find simple interest
import java.io. *;

public class farenhite {
   
    public static void main(String args[]) throws IOException {
            
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        float value = Float.parseFloat(reader.readLine()); 
        
        float celcius = ( (value -32) * 5)/9;

        System.out.println("celcius = "+ celcius);
    }
}
