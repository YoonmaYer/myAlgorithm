class Solution {
    public String solution(String my_string) {
        StringBuilder result = new StringBuilder();
        for (char c : my_string.toCharArray()) {
            if (result.indexOf(String.valueOf(c)) == -1) {
                result.append(c);
            }
        }
        return result.toString();
    }
}
