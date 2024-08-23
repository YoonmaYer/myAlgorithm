class Solution {
    public int solution(int chicken) {
        int serviceChicken = 0; // 받을 수 있는 서비스 치킨의 수
        int coupons = chicken;  // 처음에는 주문한 치킨 수 만큼 쿠폰을 받음

        // 쿠폰이 10장 이상일 때까지 반복
        while (coupons >= 10) {
            int newService = coupons / 10;  // 이번에 받을 수 있는 서비스 치킨 수
            serviceChicken += newService;   // 서비스 치킨 추가
            coupons = (coupons % 10) + newService;  // 남은 쿠폰 + 서비스 치킨으로 얻은 쿠폰
        }

        return serviceChicken;  // 최종 서비스 치킨 수 반환
    }
}
