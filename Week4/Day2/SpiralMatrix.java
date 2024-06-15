import java.util.ArrayList;
public class SpiralMatrix{
    public static void main(String []args){
        int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int elementsCount = 0;
        int rows = matrix.length, cols = matrix[0].length;
        int left = 0, right = cols - 1, up = 0, down = rows - 1;
        ArrayList<Integer> result = new ArrayList<>();
        while(elementsCount < rows * cols){
            // Traverse Left to Right
            for(int col = left; col <= right; col++){
                result.add(matrix[up][col]);
                elementsCount++;
            }
            //Traverse top to down
            for(int row = up + 1; row <= down; row++){
                result.add(matrix[row][right]);
                elementsCount++;
            }
           
            //Traverse right to left
            if(up != down){
                for(int col = right - 1; col >= left; col--){
                    result.add(matrix[down][col]);
                    elementsCount++;
                }
            }
            //Traverse down to up
            if(left != right){
                for(int row = down - 1; row > up; row--){
                    result.add(matrix[row][left]);
                    elementsCount++;
                }
            }
            left++;
            right--;
            up++;
            down--;
        }
        for(int x: result)
            System.out.print(x);
    }
}