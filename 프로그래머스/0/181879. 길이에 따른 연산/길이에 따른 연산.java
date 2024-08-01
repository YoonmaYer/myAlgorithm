class Solution {
    public int solution(int[] num_list) {
        if (num_list.length >= 11) {
            // 배열의 길이가 11 이상인 경우 합계 계산
            int sum = 0;
            for (int num : num_list) {
                sum += num;
            }
            return sum;
        } else {
            // 배열의 길이가 10 미만인 경우 곱셈 계산
            int product = 1;
            for (int num : num_list) {
                product *= num;
            }
            return product;
        }
    }
}