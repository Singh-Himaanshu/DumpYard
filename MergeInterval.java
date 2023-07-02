import java.util.ArrayList;
import java.util.Arrays;

public class MergeInterval {
    public int[][] overlappedInterval(int[][] Intervals)
    {
        ArrayList<int[]> ans = new ArrayList<>();
        Arrays.sort(Intervals, (a,b) -> a[0]-b[0]);
        int start = Intervals[0][0];
        int end = Intervals[0][1];
        for (int[] i : Intervals) {
            if(i[0] <= end){
                end = Math.max(i[1], end);
            }else{
                ans.add(new int[]{start,end});
                start = i[0];
                end = i[1];
            }
        }
        ans.add(new int[]{start,end});
        return ans.toArray(new int[0][]);
    }
}
