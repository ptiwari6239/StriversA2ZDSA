package BinarySearch;
// leetcode question:- 74
public class Search2DMatrix {
    public static void main(String[] args){
        int[][] matrix = {{1,3,5}};
        System.out.println(search(matrix,1));
    }
    public static boolean search(int[][] matrix, int target){
      int low = 0 ;
      int high = matrix.length -1;
      while(low <= high){
          int mid = low + (high - low)/2;
          int row = matrix[mid].length -1;
          if(matrix[mid][0] <= target && target <= matrix[mid][row])
              return binarySearch(matrix,target,mid);
          if(target > matrix[mid][0])
              low = mid +1;
          else
              high = mid -1;
      }
      return false;
    }
    public static boolean binarySearch(int[][] matrix, int target,int mid){
        int low = 0;
        int high = matrix[mid].length -1;
        while(low <= high){
            int midele = low + (high-low)/2;
            if(matrix[mid][midele] == target)
                return true;
            if(matrix[mid][midele] > target)
                high = midele -1;
            else
                low = midele +1;
        }
    return false;
    }
}
