package question;

public class No074 {
    public boolean searchMatrix(int[][] matrix, int target) {
        return help(matrix, 0, matrix.length-1, target);
    }

    private boolean help(int[][] matrix,int low, int high, int target){
        if(low>high){
            return false;
        }
        if(low==high){
            return findInLine(matrix[low], 0, matrix[low].length-1, target);
        }
        int mid=(low+high)/2;
        if(matrix[mid][0]==target){
            return true;
        }else if(target<matrix[mid][0]){
            high=mid-1;
        }else {
            if (matrix[mid][matrix[mid].length-1] < target) {
                low=mid+1;
            }else {
                return findInLine(matrix[mid], 0, matrix[mid].length-1, target);
            }
        }
        return help(matrix, low, high, target);
    }

    private boolean findInLine(int[] nums,int low, int high, int target){
        if(low>high){
            return false;
        }
        int mid=(low+high)/2;
        if(nums[mid]==target){
            return true;
        }else if(nums[mid]>target){
            high=mid-1;
        }else {
            low=mid+1;
        }
        return findInLine(nums,low,high,target);
    }
}
