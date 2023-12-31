public class ProductOfArrayExceptItself {
    public int[] productExceptSelf(int[] nums) {
        int ans[] = new int[nums.length];
        ans[0] = 1;

        //Prefix ready
        for (int i = 1; i < ans.length; i++) {
            ans[i] = ans[i-1] * nums[i-1];
        }

        int right = 1;
        for (int i = ans.length-1; i >= 0; i--) {
            ans[i] *= right;
            right *= nums[i];
        }

        return ans;
    }
}
