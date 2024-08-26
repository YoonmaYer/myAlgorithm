import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        // HashMap을 사용하여 각 참가자의 이름과 등장 횟수를 기록
        HashMap<String, Integer> map = new HashMap<>();
        
        // 참가자 목록을 순회하며 이름을 해시맵에 기록
        for (String person : participant) {
            map.put(person, map.getOrDefault(person, 0) + 1);
        }
        
        // 완주자 목록을 순회하며 등장 횟수를 감소
        for (String person : completion) {
            map.put(person, map.get(person) - 1);
        }
        
        // 해시맵에서 값이 0이 아닌 이름이 완주하지 못한 선수
        for (String person : map.keySet()) {
            if (map.get(person) != 0) {
                return person;
            }
        }
        
        return "";  // 모든 선수가 완주한 경우는 없다고 가정 (항상 한 명이 완주하지 못하므로)
    }
}