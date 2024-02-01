import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";
        
        for(int i = 0; i < a.length(); i++){
            //한글자씩 char형으로 비교
            char b = a.charAt(i); 
            
            if(Character.isLowerCase(b)){
            //소문자라면 대문자로 변환
                answer += Character.toUpperCase(b);
            } else {
            //대문자라면 소문자로 변환
                answer += Character.toLowerCase(b);
            }
        }
        System.out.println(answer);
    }
}