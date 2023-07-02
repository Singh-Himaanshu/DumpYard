class MaxMinElement{
public static void main(String[] args) {
    int[] arr = {1,8,9,2,4,0};
    int min = arr[0];
    int max = arr[0];
    for (int i = 0; i < arr.length; i++) {
        min = Math.min(min, arr[i]);
        max = Math.max(max, arr[i]);
    }

    System.out.println(min);
    System.out.println(max);
}
}

// git commit -m "initial commit"
// git push origin main