import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
        int numbers[] = new int[n];
        
        for(int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }
        
        Arrays.sort(numbers);
        
        // 정렬된 숫자를 출력하는 부분 추가
        for (int number : numbers) {
            bw.write(number + "\n");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}
