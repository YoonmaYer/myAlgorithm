import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        
        for(int i=0; i < N; i++) {
            String word = sc.next();
            if(isGroupWord(word)) {
                count++;
            }
        }
        
        System.out.println(count);
        sc.close();
    }
    
    
    public static boolean isGroupWord(String word) {
        Set<Character> set = new HashSet<>();
        char previous = ' ';
        
        for(int i = 0; i < word.length(); i++) {
            char current = word.charAt(i);
            
               if(current != previous) {
                if(set.contains(current)) {
                    return false;
                }
                set.add(current);
            }
            previous = current;
        }
        
        return true;
        
    }
}