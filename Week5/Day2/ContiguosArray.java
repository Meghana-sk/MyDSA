import java.util.HashMap;
import java.util.Map;
public class ContiguosArray{
    public static void main(String []args){
        int[] nums = {0,1,0};
        int sum = 0, maxlength = 0;
        Map<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        map.put(0, -1); // initial case - where equal 0s and 1s are present 0 0 0 0 1 1 1 1
        //                                                            sum   1 2 3 4 3 2 1 0 - here sum 0 is not in map, but this is a potential answer
        for(int i = 0; i < n; i++){
            // if(nums[i] == 0) sum++;
            // else sum--;
            sum += nums[i] == 0 ? 1 : -1;
            if(map.containsKey(sum)){
                maxlength = Math.max(maxlength, i - map.get(sum)); // first seen sum (i - map.get(sum))
            } else {
                map.put(sum, i);
            }
        }
        System.out.println(maxlength);
    }
}