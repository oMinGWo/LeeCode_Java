package question;

/**
 * Created by HenryLee on 2017/5/3.
 */
public class No566 {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int row=nums.length;
        int col=nums[0].length;
        if(row*col!=r*c) return nums;
        int[][] re=new int[r][c];
        int[] n=new int[r*c];
        for(int i=0;i<col;++i){
            for(int j=0;j<row;++j){
                n[j*col+i]=nums[j][i];
            }
        }
        for(int i=0;i<c;++i){
            for(int j=0;j<r;++j){
                re[j][i]=n[j*c+i];
            }
        }
        return re;
    }
}
