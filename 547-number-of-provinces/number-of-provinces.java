class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length; //matrix ki length
        boolean[] visited=new boolean[n];
        int province=0;

        for(int i=0;i<n;i++){

            if(!visited[i]){
                province++;

                Queue<Integer> q=new LinkedList<>();
                q.add(i);
                visited[i]=true;

                while(!q.isEmpty()){
                    int curr=q.poll();

                    for(int neighbour=0; neighbour<n;neighbour++){
                        if(isConnected[curr][neighbour]==1 && !visited[neighbour]){
                            visited[neighbour]=true;
                            q.add(neighbour);
                        }
                    }
                }
            }
        }
        return province;
    }
}