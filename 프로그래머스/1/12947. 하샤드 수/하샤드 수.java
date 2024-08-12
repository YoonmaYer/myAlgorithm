class Solution {
    public boolean solution(int x) {
        int sum = 0;
        int original = x;
        
        // 자릿수의 합을 계산
        while (x != 0) {
            sum += x % 10;
            x /= 10;
        }
        
        // 자릿수의 합으로 나누어 떨어지는지 확인
        return original % sum == 0;
    }
}
