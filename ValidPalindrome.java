public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(Character.isLetterOrDigit(c)) sb.append(c);
        }
        int left = 0, right = sb.length()-1;
        while(left < right){
            if(sb.charAt(left) != sb.charAt(right)) return false;
            else{
                left++;
                right--;
            }
        }
        return true;
    }
}
