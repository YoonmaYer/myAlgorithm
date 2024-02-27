import java.util.*;

class Solution {
    public String[] solution(String[] quiz) {
        List<String> resultList = new ArrayList<>();
        
        for (String equation : quiz) {
            String[] parts = equation.split(" ");
            int x = Integer.parseInt(parts[0]);
            int y = Integer.parseInt(parts[2]);
            int z = Integer.parseInt(parts[4]);
            char operator = parts[1].charAt(0);
            
            int result = 0;
            if (operator == '+') {
                result = x + y;
            } else if (operator == '-') {
                result = x - y;
            }
            
            if (result == z) {
                resultList.add("O");
            } else {
                resultList.add("X");
            }
        }
        
        return resultList.toArray(new String[0]);
    }
}
