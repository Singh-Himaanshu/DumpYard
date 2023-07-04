import java.util.*;
public class ValidParenthesis{
    // public boolean isValid(String s) {
    //     Stack<Character> st = new Stack<>();
    //     int check = 0;
    //     for (int i = 0; i < s.length(); i++) {
    //         char ch = s.charAt(i);
    //         if(ch == '[' || ch == '{' || ch == '('){
    //             st.push(ch);
    //             check++;
    //         }else{
    //             if(st.isEmpty()) return false;
    //             char chp = st.pop();
    //             if(chp == '(' && ch == ')' || chp == '[' && ch == ']' || chp == '{' && ch == '}'){
    //                 check--;
    //             }else return false;
    //         }
    //     }
    //     return check == 0;
    // }

    public boolean isValid(String s) {
        if(s == null || s.length() == 0)return true;
        if(s.length() % 2 == 1) return false;
        for (int i = 0; i < s.length() -1 ; i++) {
            char ch1 = s.charAt(i);
            char ch2  = s.charAt(i+1);
            if(ch1 == '(' && ch2 == ')' || ch1 == '[' && ch2 == ']' || ch1 == '{' && ch2 == '}'){
                StringBuilder sb = new StringBuilder(s);
                sb.delete(i, i+2);
                return isValid(sb.toString());
            }
        }
        return false;
    }
}