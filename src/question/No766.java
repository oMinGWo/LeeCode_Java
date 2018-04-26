package question;

public class No766 {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        for(int i=0;i<col;++i){
            int xx = 0;
            int rawNum = matrix[xx][i];
            int index = 0;
            while(true){
                if(xx+index>=row || i+index >= col){
                    break;
                }
                if(matrix[xx+index][i+index] != rawNum){
                    return false;
                }
                index++;
            }
        }
        for(int i=0;i<row;++i){
            int xx = 0;
            int rawNum = matrix[i][xx];
            int index = 0;
            while(true){
                if(xx+index>=col || i+index >= row){
                    break;
                }
                if(matrix[i+index][xx+index] != rawNum){
                    return false;
                }
                index++;
            }
        }
        return true;
    }
}
