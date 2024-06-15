public class Segregate0s1s{
    public static void main(String[] args){
        int n = 5;
        int arr[] = {0, 0, 1, 1, 0};
        int left = 0, right = n - 1;
        while(left < right){
            while(arr[left] == 0 && left < right){
                left++;
            }
            while(arr[right] == 1 && left < right){
                right--;
            }
            if(left < right){
                int temp = arr[right];
                arr[right--] = arr[left];
                arr[left++] = temp;
            }
        }
        for(int x: arr){
            System.out.print(x);
        }
    }
}