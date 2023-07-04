public class RemoveConsecutiveChar {
    public String removeConsecutiveCharacter(String s){
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < s.length()-1; i++) {
            if(sb.charAt(i) == sb.charAt(i+1)){
                sb.delete(i,i+1);
                i--;
            }
        }
        return sb.toString();
    }
}
