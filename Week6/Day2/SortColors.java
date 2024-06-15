//Two pointers
public class SortColors {
    public static void main(String[] args){
        int[] nums = {2,0,2,1,1,0};
        int zeroCount = 0, oneCount = 0, twoCount = nums.length - 1;
        while(oneCount <= twoCount){
            if(nums[oneCount] == 2){
                int temp = nums[twoCount];
                nums[twoCount] = nums[oneCount];
                nums[oneCount] = temp;
                twoCount--;
            }
            else if(nums[oneCount] == 0){
                int temp = nums[oneCount];
                nums[oneCount] = nums[zeroCount];
                nums[zeroCount] = temp;
                oneCount++;
                zeroCount++;
            } else if(nums[oneCount] == 1) oneCount++;
        }
        for(int x: nums) System.out.println(x);
    }
}