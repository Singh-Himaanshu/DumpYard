public class MaximumProductSubArray {
    public int maxProduct(int[] nums) {
        int maxProduct = Integer.MIN_VALUE;
        int product = 1;
        for (int i = 0; i < nums.length; i++) {
            product *= nums[i];
            maxProduct = Math.max(maxProduct, product);
            if(product == 0) product = 1;
        }

        product = 1;
        for (int i = nums.length -1; i >= 0; i--) {
            product *= nums[i];
            maxProduct = Math.max(maxProduct, product);
            if(product == 0) product = 1; 
        }
        return maxProduct;
    }
}
