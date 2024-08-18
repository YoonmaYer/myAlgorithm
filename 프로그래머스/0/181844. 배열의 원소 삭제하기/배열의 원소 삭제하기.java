import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        // delete_list를 배열에서 검색하기 쉽게 List로 변환
        ArrayList<Integer> deleteList = new ArrayList<>();
        for (int num : delete_list) {
            deleteList.add(num);
        }
        
        // arr 배열을 순회하면서 delete_list에 없는 원소들만 answer에 추가
        for (int num : arr) {
            if (!deleteList.contains(num)) { // delete_list에 없으면 추가
                answer.add(num);
            }
        }
        
        // ArrayList를 다시 int 배열로 변환하여 반환
        return answer.stream().mapToInt(i -> i).toArray();
    }
}
