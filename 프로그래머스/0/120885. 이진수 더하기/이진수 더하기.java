class Solution {
    public String solution(String bin1, String bin2) {  
        // 2진수 문자열을 정수로 변환
        int binary1 = Integer.parseInt(bin1, 2);  // bin1을 2진수로 변환
        int binary2 = Integer.parseInt(bin2, 2);  // bin2를 2진수로 변환
        
        // 두 정수를 더한 후 다시 이진수 문자열로 변환
        int sum = binary1 + binary2;
        
        // 결과를 이진수 문자열로 변환
        String answer = Integer.toBinaryString(sum);
        
        return answer;
    }
}