class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        
        int maxH = dots[0][0];
        int minH = dots[0][0];
        int maxW = dots[0][1];
        int minW = dots[0][1];
        for(int i=1; i<dots.length; i++) {
        	maxH = Math.max(maxH, dots[i][0]);
        	minH = Math.min(minH, dots[i][0]);
        	maxW = Math.max(maxW, dots[i][1]);
        	minW = Math.min(minW, dots[i][1]);
        }
        answer = (maxH-minH)*(maxW-minW); 
        
        return answer;
    }
}