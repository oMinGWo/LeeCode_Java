package question;

public class No695 {

    public int maxAreaOfIsland(int[][] grid) {
        int result=0;
        for (int i=0;i<grid.length;++i){
            for (int j=0;j<grid[0].length;++j){
                if (grid[i][j]==0 || grid[i][j]==-1){
                    continue;
                }else{
                    int temp = count(i,j,grid);
                    result = Math.max(result,temp);
                }
            }
        }
        return result;
    }
    private int count(int row,int col,int[][] grid){
        if (row < 0 || col < 0 || row >= grid.length || col >= grid[0].length){
            return 0;
        }
        if (grid[row][col] ==0 || grid[row][col]==-1){
            return 0;
        }
        grid[row][col]=-1;
        return 1+count(row+1,col,grid)
                +count(row-1,col,grid)
                +count(row,col+1,grid)
                +count(row,col-1,grid);
    }
}
