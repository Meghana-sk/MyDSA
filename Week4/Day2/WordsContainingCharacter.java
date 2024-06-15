import java.util.ArrayList;
import java.util.List;
public class WordsContainingCharacter{
    public static void main(String[] args){
        String []words = {"leet","code"};
        char ch = 'e';
        List<Integer> ans = new ArrayList<>();
        int n = words.length;
        for(int i = 0; i < n; i++){
            for(char letter: words[i].toCharArray()){
                if(letter == ch){
                    ans.add(i);
                    break;
                }
            }
        }
        for(int x: ans)
            System.out.print(x);
    }
}