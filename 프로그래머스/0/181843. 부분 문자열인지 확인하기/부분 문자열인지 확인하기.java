class Solution {
    public int solution(String my_string, String target) {
        int answer = 0;
        int index = my_string.indexOf(target);
        
        if(index >= 0) {
            answer = 1;
        } else if(index < 0) {
            answer = 0;
        }
        
        
        return answer;
    }
}