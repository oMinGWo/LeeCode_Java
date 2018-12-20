package question;

public class No64 {
    public int minPathSum(int[][] grid) {
        //6ms
        //感觉这也是个DP思路的题目，不过很遗憾，我用的是小学奥数的知识
        //可以用来体会一下DP的思路
        if (grid==null || grid.length==0 || grid[0].length==0){
            return 0;
        }
        for (int i=0;i<grid.length;++i){
            for (int j=0;j<grid[0].length;++j){
                if (i-1<0 && j-1<0){
                    grid[i][j] = grid[i][j];
                }else if (i-1<0){
                    grid[i][j] = grid[i][j] + grid[i][j-1];
                }else if(j-1<0){
                    grid[i][j] = grid[i][j] + grid[i-1][j];
                }else{
                    grid[i][j] = Math.min(grid[i][j-1],grid[i-1][j]) + grid[i][j];
                }
            }
        }
        return grid[grid.length-1][grid[0].length-1];
    }
}
