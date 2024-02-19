import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] solution(int n) {
        List<Integer> primeFactors = new ArrayList<>();
        
        // 소수 2부터 n의 제곱근까지 반복하여 소인수를 찾음
        for (int i = 2; i * i <= n; i++) {
            // i가 n의 약수이면서 소수인 경우 반복
            while (n % i == 0 && isPrime(i)) {
                primeFactors.add(i);
                n /= i;
            }
        }
        
        // 마지막으로 남은 수도 소인수에 추가
        if (n > 1) {
            primeFactors.add(n);
        }
        
        // 중복 제거
        primeFactors = removeDuplicates(primeFactors);
        
        // List를 배열로 변환하여 반환
        int[] result = new int[primeFactors.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = primeFactors.get(i);
        }
        
        return result;
    }

    // 중복 제거 메소드
    public List<Integer> removeDuplicates(List<Integer> list) {
        List<Integer> newList = new ArrayList<>();
        for (Integer element : list) {
            if (!newList.contains(element)) {
                newList.add(element);
            }
        }
        return newList;
    }

    // 소수인지 확인하는 메소드
    public boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
