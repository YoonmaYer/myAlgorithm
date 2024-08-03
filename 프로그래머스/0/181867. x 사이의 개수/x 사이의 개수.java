class Solution {
    public int[] solution(String myString) {
        // "x"를 기준으로 문자열을 나누기
        String[] splitStrings = myString.split("x", -1);

        // 나눠진 문자열 각각의 길이를 저장할 배열 생성
        int[] lengths = new int[splitStrings.length];

        // 각 나눠진 문자열의 길이를 배열에 추가
        for (int i = 0; i < splitStrings.length; i++) {
            lengths[i] = splitStrings[i].length();
        }
        
        return lengths;
    }
}