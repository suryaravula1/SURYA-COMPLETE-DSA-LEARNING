class Solution {

    public void combinationHelper( int n, int start, List<List<Integer>> result, List<Integer> currentList , int k){
        if(currentList.size()>=k){
            result.add(new ArrayList(currentList));
            return;
        }

        for(int i =start; i<=n; i++){
            currentList.add(i);
            combinationHelper(n,i+1, result,currentList, k);
            currentList.remove(currentList.size()-1);
        }


    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> combinationsList = new ArrayList<>();


        combinationHelper(n,1,combinationsList, new ArrayList<>(), k );

        return combinationsList;
    }
}