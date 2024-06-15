import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
public class TwoSum{
    public static void main(String[] args){
        int []nums = {2,7,11,15};
        int target = 9;
        int n = nums.length;
        List<Integer> result = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            int n1 = nums[i];
            int n2 = target - n1;
            if(map.containsKey(n2)){
                result.add(i);
                result.add(map.get(n2));
                break;
            }
            map.put(n1,i);
        }
        for(int x: result)
            System.out.println(x);
    }
}