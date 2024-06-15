import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class ThreeSum {

    public static void twoSum(int nums[], int ind, int target, List<List<Integer>> ans) {
        int i = ind;
        int j = nums.length - 1;

        while(i < j)
        {
            int b = nums[i];
            int c = nums[j];
            if(b + c == target)
            {
                List<Integer> lst = new ArrayList<>(); 
                lst.add(-target);
                lst.add(b);
                lst.add(c);
                ans.add(lst);
                i ++;
                while(i < j && nums[i] == nums[i - 1])
                    i ++;
                j --;
                while(i < j && nums[j] == nums[j + 1])
                    j --;
            }
            else if(b + c < target)
                i ++;
            else
                j --;
        }
    }
    public  static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();

        for(int i = 0 ; i < nums.length - 2; i ++)
        {
            if(i == 0 || nums[i] != nums[i - 1])
            {
                int a = nums[i];
                twoSum(nums, i + 1, -a, ans);
            }
        }

        return ans;
    }
    public static void main(String[] args){
        int []nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> ans = threeSum(nums);
        for (List<Integer> list : ans) {
            System.out.print("[");
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i));
                if (i < list.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }
}