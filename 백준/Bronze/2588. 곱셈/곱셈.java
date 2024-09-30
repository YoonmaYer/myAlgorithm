import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt();
        int num2 = input.nextInt();
        
        System.out.println(num1 * (num2 % 10));    // 일의자리
        System.out.println(num1 * ((num2 / 10) % 10));    // 십의자리
        System.out.println(num1 * (num2 / 100));    // 백의자리
        System.out.println(num1 * num2);            // 전체 곱셈 결과
    }
}