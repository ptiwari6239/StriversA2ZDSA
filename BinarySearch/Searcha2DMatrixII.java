package BinarySearch;
// leetcode question:- 240
// approch :- 1) start with top right corner(it is greatest elementn in its row and lowest in its coloumn)
// 2) if it is the target element return true;
// 3) if it is less then target element than all element in its row are surely less than target (i.e row++)
// 4) else if it is greater than target element than move one coloumn less because every element on the
// same coloumn will the greater then that element
public class Searcha2DMatrixII {
    public static boolean  searchMatrix(int[][] matrix,int target ){
        int row = 0 ;
        int col = matrix[0].length -1;
        while(col >= 0 && row < matrix.length ){
            if(matrix[row][col] == target)
                    return true;
            if(target > matrix[row][col])
                row++;
            else
                col--;
        }
        return false;
    }

}
