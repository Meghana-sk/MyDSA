import java.util.Scanner;

public class SquaresOfSortedArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // int[] input = {-4,-1,0,3,10};
        // int n = input.length;
        System.out.println("Enter n");
        int n =  scanner.nextInt();
        int[] input = new int[n];
        System.out.println("Enter array elements");
        for(int i = 0; i < n; i++){
            input[i] = scanner.nextInt();
        }
        int left = 0;
        int right = n - 1;

        int result[] = new int[n];
        int resultIndex = n - 1;
        while(left <= right){
            if(input[right] * input[right] < input[left] * input[left]){
                result[resultIndex] = input[left] * input[left];
                left++;
            } else {
                result[resultIndex] = input[right] * input[right];
                right--;
            }
            resultIndex--;
        }
        for(int i = 0; i < n; i++){
            System.out.println(result[i]);
        }
    }
}
