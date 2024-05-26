public class MatrixDiagonalSum{
    public static void main(String[] args){
        int[][] matrix = {{1,2,3}, {4,5,6},{7,8,9}};
        int diagonalSum = 0;
        int rows = matrix.length;
        int cols = matrix[0].length;
        for(int i = 0; i < rows; i++){
            int primaryDiagonal = matrix[i][i];
            int secondaryIndex = cols - i - 1; 
            int secondaryDiagonal = matrix[i][secondaryIndex];
            if(i != secondaryIndex){
                diagonalSum += secondaryDiagonal;
            }
            diagonalSum += primaryDiagonal;
        }
        System.out.println(diagonalSum);
    }
}