class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
   List<List<Integer>> graph=new ArrayList<>();

   for(int i=0;i<n;i++){
    graph.add(new ArrayList<>());
   }

   for(int[] pair : edges ){
    int u=pair[0];
    int v=pair[1];

    graph.get(u).add(v);
    graph.get(v).add(u);

   }

   boolean[] visited= new boolean[n];
   Queue<Integer> q=new LinkedList<>();

   q.add(source);
   visited[source]=true;

   while(!q.isEmpty()){
    int curr=q.poll();
    if(curr == destination){
        return true;
    }

    for(int neighbour : graph.get(curr)){
        if(!visited[neighbour]){
            visited[neighbour]=true;
            q.add(neighbour);
        }
    }
   }
    return false;
    }
}