public class SearchInRotatedArray {
    public static int search(int[] nums, int target) {
        int s=0, e = nums.length -1, mid;
        while (s<=e) {
            mid = s + (e-s)/2;
            if(nums[mid] == target){
                return mid;
            }

            if(nums[s] <= nums[mid]){
                if(nums[s] <= target && nums[mid] >= target){
                    e = mid -1;
                }else{
                    s = mid +1;
                }
            }else{
                if(nums[e] >= target && nums[mid] <= target){
                    s = mid +1;
                }else{
                    e = mid -1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2}; 
        int target = 3;
        System.out.println(search(arr, target));
    }
}
