import java.util.*;

public class Main {

    public static class Solution {



    }

    class KthLargest {

        Queue<Integer> queue = new PriorityQueue<>();
        int capacity;

        public KthLargest(int k, int[] nums) {
            capacity = k;
            for (int n : nums) {
                queue.offer(n);
            }
        }

        public int add(int val) {
            queue.offer(val);
            while (queue.size() > capacity) {
                queue.poll();
            }
            return queue.peek();
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
    }
}
