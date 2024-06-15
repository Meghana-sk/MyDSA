import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
public class GroupAnagrams{
    public static void main(String[] args){
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> ans = new ArrayList<>();
        Map<String, List<String>> anagramMap = new HashMap<>();

        for (String s : strs) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);
            if (!anagramMap.containsKey(sortedStr)) {
                anagramMap.put(sortedStr, new ArrayList<>());
            }
            anagramMap.get(sortedStr).add(s);
        }
        ans.addAll(anagramMap.values());
        for (List<String> group : ans) {
            System.out.println(group);
        }
    }
}