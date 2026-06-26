class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        int n = nums.length;
        int[] result = new int[n-k+1];
        Deque<Integer> deque = new ArrayDeque<>();
        int index =0;

        for(int right =0; right<n; right++){

            if(!deque.isEmpty() && (right -deque.peekFirst()) +1 > k){
                deque.pollFirst();
            }
            while(!deque.isEmpty() && nums[deque.peekLast()]< nums[right]){
                deque.pollLast();
            }
            deque.offerLast(right);

            if(right>=k-1){
                result[index++] = nums[deque.peekFirst()];
            }
        }
   
        return result ;

    }
}