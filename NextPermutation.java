public class NextPermutation {
    public static void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while(nums[i] >= nums[i+1])i--;
        int j = nums.length -1;
        while (j >= 0 && nums[i] >= nums[j]) {
            j--;
        }
        swap(i,j,nums);
        reverse(i+1 , nums.length-1,nums);
    }

    public static void swap(int i, int j, int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void reverse(int i, int j, int[] nums){
        while(i<=j)swap(i++, j--, nums);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        nextPermutation(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
