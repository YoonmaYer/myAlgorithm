class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0}; //캐릭터의 좌표는 항상 [0, 0]으로 시작함
        
        for(int i = 0; i < keyinput.length; i++) {
            //입력된 방향키에 따라 좌표를 이동시키는 switch문
            switch(keyinput[i]) {
                case "up": answer[1]++;
                    break;
                case "down": answer[1]--;
                    break;
                case "left": answer[0]--;
                    break;
                case "right": answer[0]++;
                    break;
            }
            //맵의 크기를 벗어난 방향키는 무시해줌 (x/y좌표, 음수/양수 경우에 따라 각각 처리해줌)
            if(Math.abs(answer[0]) > board[0] / 2) {
                answer[0] += (answer[0] > 0) ? -1 : 1;
            }
            if(Math.abs(answer[1]) > board[1] / 2) {
                answer[1] += (answer[1] > 0) ? -1 : 1;
            }
        }
        return answer; //캐릭터의 좌표 return
    }
}