class Solution {
    public long solution(int price, int money, int count) {
        long totalCost = 0;  // 총 필요한 금액을 저장하는 변수
        
        // 놀이기구를 1번부터 count번까지 타는 데 필요한 총 금액을 계산
        for (int i = 1; i <= count; i++) {
            totalCost += price * i;
        }
        
        // 부족한 금액을 계산. 만약 모자라지 않으면 0을 반환
        long difference = totalCost - money;
        return difference > 0 ? difference : 0;
    }
}