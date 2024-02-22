class Solution {
    public String solution(String my_string, int num1, int num2) {
        char[] charArray = my_string.toCharArray(); // 문자열을 문자 배열로 변환

        // 문자열의 num1과 num2 위치의 문자 교환
        char temp = charArray[num1];
        charArray[num1] = charArray[num2];
        charArray[num2] = temp;

        // 문자 배열을 다시 문자열로 변환하여 반환
        return new String(charArray);
    }
}
