class Solution {
    public int solution(String myString, String pat) {   
        
        // 대소문자를 구분하지 않기 위해 모두 소문자로 변환
        myString = myString.toLowerCase();
        pat = pat.toLowerCase();
        
        if (myString.indexOf(pat) != -1) {
            return 1;
        } else {
            return 0;
        }
    }
}