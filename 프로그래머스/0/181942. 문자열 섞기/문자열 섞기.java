class Solution {
    public String solution(String str1, String str2) {
        StringBuilder sb = new StringBuilder();
        
        String[] str1arr = str1.split("");
        String[] str2arr = str2.split("");
        
        for(int i=0; i < str1.length(); i++) {
            sb.append(str1arr[i]).append(str2arr[i]);
        }
        
        return sb.toString();
    }
}