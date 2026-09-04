class Solution {
    public int numIslands(char[][] grid) {
   int m=grid.length;
   int n=grid[0].length;

   int island=0;

   for(int i=0;i<m;i++){
    for(int j=0;j<n;j++){
        if(grid[i][j]=='1'){
            island++;

            Queue<int[]>q=new LinkedList<>();
            q.add(new int[]{i,j});
            grid[i][j]='0';

            while(!q.isEmpty()){
                int[] curr=q.poll();
                int row=curr[0];
                int col=curr[1];

                if(row-1 >=0 && grid[row-1][col] == '1'){
                    grid[row-1][col]='0';
                    q.add(new int[]{row-1,col});
                }

                if(row+1 < m && grid[row+1][col]=='1'){
                    grid[row+1][col]='0';
                    q.add(new int[]{row+1,col});
                }

                if(col-1 >=0 && grid[row][col-1]=='1'){
                    grid[row][col-1]='0';
                    q.add(new int[]{row,col-1});
                }

                if(col+1  < n && grid[row][col+1]=='1'){
                    grid[row][col+1]='0';
                    q.add(new int[]{row,col+1});
                }
            }

        
        }

    }
   }
    return island;
    }
}