import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargestElement {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            pq.add(nums[i]);
        }
        for (int i = k; i < nums.length; i++) {
            if(pq.peek() < nums[i]){
                pq.poll();
                pq.add(nums[i]);
            }
        }
        return pq.peek();




        // PriorityQueue<Integer> pqReverse = new PriorityQueue<>(Collections.reverseOrder()); 
        // for (int i = 0; i < k; i++) {
        //     pqReverse.add(nums[i]);
        // }
        // for (int i = k; i < nums.length; i++) {
        //     if(pqReverse.peek() > nums[i]){
        //         pqReverse.poll();
        //         pqReverse.add(nums[i]);
        //     }
        // }
        // return pqReverse.peek();
    }
}
