class Solution {
    public int trap(int[] height) {
        
        int n = height.length;
        int[] leftMaxArray = new int[n];
        int[] rightMaxArray = new int[n];

        int leftMax =0;
        int index=0;
        for(int h : height){
            leftMax = Math.max(leftMax,h);
            leftMaxArray[index++] = leftMax;
        }

        int rightMax=0;
        for(int i=n-1; i>=0; i--){
            rightMax= Math.max(height[i],rightMax);
            rightMaxArray[i]=rightMax;
        }

        int result=0;

        for(int i =0; i<n; i++){
            result += Math.min(leftMaxArray[i], rightMaxArray[i]) - height[i];
        }

        return result;

    }
}