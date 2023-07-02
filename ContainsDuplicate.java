import java.util.HashMap;
import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,4};
        // HashSet<Integer> hs = new HashSet<>();
        // for (int i = 0; i < arr.length; i++) {
        //     if(hs.contains(arr[i])) System.out.println(arr[i]);
        //     hs.add(arr[i]);
        // }
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i : arr) {
            if(hm.containsKey(i)) System.out.println(i);
            hm.put(i, 1);
        }
    }
}
