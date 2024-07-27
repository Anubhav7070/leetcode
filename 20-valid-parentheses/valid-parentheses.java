import java.util.*;

public class Solution {
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        for (char it : s.toCharArray()) {
            if (it == '(' || it == '[' || it == '{')
                st.push(it);
            else {
                if(st.isEmpty()) return false;
                char ch = st.pop();
                if((it == ')' && ch == '(') ||  (it == ']' && ch == '[') || (it == '}' && ch == '{')) continue;
                else return false;
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        // Test cases
        String[] testCases = {"", "()", "()[]{}", "(]", "([)]", "{[]}"};
        
        for (String s : testCases) {
            if(isValid(s))
                System.out.println("'" + s + "' is valid");
            else
                System.out.println("'" + s + "' is not valid");
        }
    }
}