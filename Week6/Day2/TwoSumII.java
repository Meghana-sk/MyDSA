public class TwoSumII{
    public static void main(String[] args){
        int[] numbers = {2,7,11,15};
        int target = 9;
        int i = 0, j = numbers.length - 1;
        int []ans = new int[2];
        while (i < j) {
            int a = numbers[i], b = numbers[j];
            if (a + b == target) {
              ans[0] = i + 1;
              ans[1] = j + 1;
              break;
            } else if (a + b > target) {
                j--;
            } else {
                i++;
            }
        }
        for(int x: ans) System.out.println(x);
    }
} 