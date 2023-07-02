import java.util.Arrays;

public class PairWithGivenSum {
    public static boolean pairInRotatedSortedArray(int[] nums, int x){
        int left = 0, right = nums.length-1;
        Arrays.sort(nums);
        while (left <= right) {
            if(nums[left] + nums[right] == x) return true;
            if (nums[left] + nums[right] > x) {
                right--;
            }else{
                left++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
       int arr[] = {11, 15, 26, 38, 9, 10};
       int x = 45;
       System.out.println(pairInRotatedSortedArray(arr, x));
    }
}
