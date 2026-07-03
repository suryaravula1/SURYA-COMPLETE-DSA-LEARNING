class Solution {
    public int totalFruit(int[] fruits) {
        

        HashMap<Integer, Integer> freqOfFruits = new HashMap<>();

        int left =0;
        int right =0;

        int noOfFruits =0;

        while(right < fruits.length){
            freqOfFruits.put(fruits[right], freqOfFruits.getOrDefault(fruits[right],0)+1);

            if(freqOfFruits.size()>2){
                freqOfFruits.put(fruits[left], freqOfFruits.get(fruits[left])-1);

                if(freqOfFruits.get(fruits[left])==0){
                    freqOfFruits.remove(fruits[left]);
                }

                left++;
            }

            noOfFruits = Math.max(noOfFruits, right-left+1);

            right++;

        }


        return noOfFruits;



    }
}