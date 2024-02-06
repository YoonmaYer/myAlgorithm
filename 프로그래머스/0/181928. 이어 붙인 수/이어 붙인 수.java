class Solution {
    public int solution(int[] num_list) {
        StringBuilder oddNumber = new StringBuilder(); // 홀수만 순서대로 이어붙일 StringBuilder
        StringBuilder evenNumber = new StringBuilder(); // 짝수만 순서대로 이어붙일 StringBuilder

        // 주어진 리스트에서 홀수와 짝수를 분리하여 StringBuilder에 추가
        for (int num : num_list) {
            if (num % 2 == 0) {
                evenNumber.append(num);
            } else {
                oddNumber.append(num);
            }
        }

        // StringBuilder에 저장된 문자열을 정수로 변환 후 합을 구함
        int oddSum = Integer.parseInt(oddNumber.toString());
        int evenSum = Integer.parseInt(evenNumber.toString());

        // 두 수의 합을 반환
        return oddSum + evenSum;
    }
}
