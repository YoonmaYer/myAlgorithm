class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = a;
        
        for(int i = 0; i < included.length; i ++) {
            if(included[i]) {
                answer += a + (d * i);
        } 
        }
        
        return answer - a;
    }
}