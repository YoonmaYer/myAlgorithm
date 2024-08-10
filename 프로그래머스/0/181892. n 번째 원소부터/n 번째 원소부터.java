import java.util.ArrayList;

class Solution {
    public int[] solution(int[] num_list, int n) {
        // Create a list to store the sublist of integers
        ArrayList<Integer> answer = new ArrayList<>();
        
        // Add elements starting from index n to the end of the list
        for (int i = n-1; i < num_list.length; i++) {
            answer.add(num_list[i]);
        }
        
        // Convert the ArrayList to an array
        int[] result = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }
        
        return result;
    }
}