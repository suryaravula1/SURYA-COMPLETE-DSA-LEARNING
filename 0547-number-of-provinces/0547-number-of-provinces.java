class Solution {

    public void dfs(int[][] isConnected, int node, boolean[] visited){
        visited[node] = true;

        for(int j =0; j< isConnected.length; j++){
            if(isConnected[node][j]==1 && !visited[j]){
                dfs(isConnected,j,visited);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] visited = new boolean[n];

        int result =0;

        for(int i =0; i< n; i++){
            if(!visited[i]){
                dfs(isConnected, i, visited);
                result++;
            }
        }

        return result;
    }
}