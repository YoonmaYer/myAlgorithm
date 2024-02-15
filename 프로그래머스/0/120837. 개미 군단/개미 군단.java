public class Solution {
    public int solution(int hp) {
        // 장군개미, 병정개미, 일개미의 공격력
        int generalAntAttack = 5;
        int soldierAntAttack = 3;
        int workerAntAttack = 1;
        
        int generalsNeeded = hp / generalAntAttack; // 장군개미의 필요 수
        int remainingHp = hp % generalAntAttack; // 남은 체력
        
        // 장군개미를 사용한 후에도 남은 체력이 있으면 병정개미를 추가로 사용
        int soldiersNeeded = remainingHp / soldierAntAttack;
        remainingHp %= soldierAntAttack;
        
        // 남은 체력이 있으면 일개미를 추가로 사용
        int workersNeeded = remainingHp / workerAntAttack;
        
        // 총 필요한 개미 수를 계산하여 반환
        return generalsNeeded + soldiersNeeded + workersNeeded;
    }
}
