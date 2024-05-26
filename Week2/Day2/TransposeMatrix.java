public class TransposeMatrix{
    public static void main(String[] args){
       int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
       int rows = matrix.length;
       int cols = matrix[0].length;
       int[][] result = new int[cols][rows];
       for(int i = 0; i < rows; i++){
        for(int j = 0; j < cols; j++){
            result[j][i] = matrix[i][j];
        }
       }
       for(int i = 0; i < cols; i++){
        for(int j = 0; j < rows; j++){
            System.out.println(result[i][j]);
        }
        System.out.println();
       }
    }
}