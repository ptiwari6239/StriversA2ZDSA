// leetcode :- 48
public class RotateImage {
    public static void main(String[] args){

    }
    static void rotate(int[][] matrix){
        for(int row = 0; row < matrix.length ; row++){
            for(int col = row+1; col < matrix[0].length; col++){
                if(row < col){
                    int temp = matrix[row][col];
                    matrix[row][col] = matrix[col][row];
                    matrix[col][row] = temp; 
                }
            }
        }
        for(int row = 0 ;  row < matrix.length; row++){
            int left = 0 , right = matrix[0].length-1;
            while(left < right){
                int temp = matrix[row][left];
                matrix[row][left] = matrix[row][right];
                matrix[row][right] = temp;
                left++;
                right--;

            }
        }
    }
}
