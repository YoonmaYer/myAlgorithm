class Solution {
    boolean solution(String s) {
        int countP = 0;
        int countY = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (currentChar == 'p' || currentChar == 'P') {
                countP++;
            } else if (currentChar == 'y' || currentChar == 'Y') {
                countY++;
            }
        }
        
        return countP == countY;
    }
}