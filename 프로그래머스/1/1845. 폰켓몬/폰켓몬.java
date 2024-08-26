import java.util.*;

class Solution {
    public int solution(int[] nums) {

        // 중복을 제거하여 포켓몬 종류를 저장
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        
        // 선택할 수 있는 최대 포켓몬 수는 전체 포켓몬의 절반
        int maxSelectable = nums.length / 2;
        
        // 중복을 제거한 포켓몬 종류 수와 선택 가능한 포켓몬 수 중 작은 값 반환
        return Math.min(set.size(), maxSelectable);
    }
}
