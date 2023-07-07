import java.util.*;

public class LongestSubStringWithouRepeatation {
    // public int lengthOfLongestSubstring(String s) {
    //     Set<Character> set = new HashSet<>();
    //     int left = 0, maxLength = 0;
    //     for (int right = 0; right < s.length(); right++) {
    //         if(!set.contains(s.charAt(right))){
    //             set.add(s.charAt(right));
    //             maxLength = Math.max(maxLength, right -left +1);
    //         }else{
    //             while (s.charAt(left)!= s.charAt(right)) {
    //                 set.remove(s.charAt(left));
    //                 left++;
    //             }
    //             set.remove(s.charAt(left));
    //             left++;
    //             set.add(s.charAt(right));
    //         }
    //     }
    //     return maxLength;
    // }



    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int maxLength = 0, left = 0, right =0;
        while(right < s.length()){
            if(map.containsKey(s.charAt(right))){
                left = Math.max(map.get(s.charAt(right)) +1, left);
            }
            map.put(s.charAt(right), right);
            maxLength = Math.max(maxLength, right - left +1);
            right++;
        }
        return maxLength;
    }

    
}
