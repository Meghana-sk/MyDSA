public class RemoveNonDuplicatesFromSortedArray{
    public static void main(String[] args){
        int []nums = {1,1,2};
        int n = nums.length;
        int i = 0, j = 1;
        while(j < n){
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
            j++;
        }
        System.out.print(i + 1);
    }
}