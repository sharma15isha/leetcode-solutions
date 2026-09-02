class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
     List<List<Integer>> list= new ArrayList<>();

     for(int i=0;i<n;i++){
        list.add(new ArrayList<>());
     }

     for(int[] pair: edges){
        int u=pair[0];
        int v=pair[1];

        list.get(u).add(v);
        list.get(v).add(u);  
     }

     boolean[] visited=new boolean[n];
     Queue<Integer> q= new LinkedList<>();

     q.add(source);
     visited[source]=true;

     while(!q.isEmpty()){
        int curr=q.poll();

        if(curr == destination){
            return true;
        }

        for(int neighbour : list.get(curr)){
            if( !visited[neighbour]){
                visited[neighbour]=true;
                q.add(neighbour);
            }
        }
     }
     return false;
    }
}