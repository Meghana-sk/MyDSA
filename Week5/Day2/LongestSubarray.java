
import java.util.HashMap;
import java.util.Map;
public class LongestSubarray{
    public static void main(String []args){
        int A[] = {10, 5, 2, 7, 1, 9};
        int K = 15;
        int prefixsum = 0;
        int maxlength = 0;
        int N = A.length;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        for(int i = 0; i < N; i++){
            prefixsum += A[i] ;
            int value = prefixsum - K;
            if(map.containsKey(value)){
                maxlength = Math.max(maxlength, i - map.get(value));
            }
            if(!map.containsKey(prefixsum)){
                map.put(prefixsum, i);
            }
        }
        System.out.println(maxlength);
    }
}