class Solution {
    public String solution(String[] id_pw, String[][] db) {
        // 입력된 id_pw의 첫 번째 원소는 아이디, 두 번째 원소는 비밀번호
        String inputId = id_pw[0];
        String inputPw = id_pw[1];
        
        // db를 순회하면서 아이디와 비밀번호를 확인
        for (String[] account : db) {
            String dbId = account[0];
            String dbPw = account[1];
            
            // 아이디가 같은 경우
            if (inputId.equals(dbId)) {
                // 비밀번호도 일치하면 "login" 반환
                if (inputPw.equals(dbPw)) {
                    return "login";
                } else {
                    // 비밀번호가 일치하지 않으면 "wrong pw" 반환
                    return "wrong pw";
                }
            }
        }
        
        // 아이디가 일치하는 계정이 없으면 "fail" 반환
        return "fail";
    }
}
