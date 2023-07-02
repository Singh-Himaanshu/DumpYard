import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RepeatAndMissingNumber {
    public static ArrayList<Integer> repeatedNumber(final List<Integer> A) {
    ArrayList<Integer> ans = new ArrayList<>();
    HashSet<Integer> hs = new HashSet<>();
    int expectedSum = 0, actulalSum = 0, repeatedNumber = 0;
    for (int i = 0; i < A.size(); i++) {
        expectedSum += i;
    }
    for (int i = 0; i < A.size(); i++) {
        actulalSum += A.get(i);
        if(hs.contains(A.get(i))) repeatedNumber = A.get(i);
        else hs.add(A.get(i));
    }

    int resultSum = actulalSum - repeatedNumber;
    int missing = expectedSum - resultSum;
    ans.add(repeatedNumber);
    ans.add(missing);
    return ans;
    }
}
