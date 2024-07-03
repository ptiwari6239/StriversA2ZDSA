public class SetMatrixZeros {
    public static void main(String[] args){

    }
    public void setZeros(int[][] matrix){
        int row = matrix.length;
        int coloum = matrix[0].length ;
        boolean[][] zeroes = new boolean[row][coloum];
        for(int i = 0 ; i < row; i++){
            for(int j = 0 ; j < coloum ; j++){
                if(matrix[i][j]==0)
                    zeroes[i][j] = true;

            }
        }
        for(int i = 0 ; i < row; i++){
            for(int j = 0; j < coloum; j++){
                if(zeroes[i][j]==true){
                    for(int a = 0 ; a < coloum; a++)
                        matrix[i][a] = 0;
                    for(int b = 0 ; b < row; b++)
                        matrix[b][j] = 0;
                }
            }
        }
    }
}
