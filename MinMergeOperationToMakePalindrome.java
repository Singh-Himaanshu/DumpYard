public class MinMergeOperationToMakePalindrome {
    public static int mergeOperation(int[] arr){
        int ans = 0, left = 0, right = arr.length-1;
        while(left < right){
            if(arr[left] == arr[right]) {
                left++;
                right--;
            }
            else if(arr[left] > arr[right]){
                right--;
                arr[right] += arr[right+1];
                ans++;
            }
            else{
                left++;
                arr[left] += arr[left-1];
                ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {11, 14, 15, 99};
        System.out.println(mergeOperation(arr));
    }
}
