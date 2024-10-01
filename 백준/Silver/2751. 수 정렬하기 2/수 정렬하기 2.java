import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(rd.readLine());
        
        int[]numbers = new int[n];
        
        for (int i=0; i < n; i++) {
            numbers[i] = Integer.parseInt(rd.readLine());
        }
        
        Arrays.sort(numbers);
        
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}