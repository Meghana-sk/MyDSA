import java.util.HashSet;
import java.util.Set;
public class LongestConsecutiveSequence {
    public static void main(String[] args){
        int nums[] = {100,4,200,1,3,2};
        Set<Integer> set = new HashSet<>();
        int maxlen = 0;
        for(int x: nums)
            set.add(x);
        for(int startingElement: set){
            if(!set.contains(startingElement - 1)){
                int len = 1;
                while(set.contains(startingElement + len))
                    len++;
                maxlen = Math.max(maxlen, len);
            }
        }
        System.out.println(maxlen);
    }
}