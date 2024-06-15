public class LongestPalindromicSubstring{
    public boolean isPalindrome(String s){
        int left = 0, right = s.length() - 1;
        while(left < right){
            if(s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args){
        String s = "cbbd";
         // String longestSubstring = "";
        // int n = s.length();
        // for(int i = 0; i < n; i++){
        //     String sub = "";
        //     for(int j = i; j < n; j++){
        //         sub += (s.charAt(j) + "");
        //         if(isPalindrome(sub) && sub.length() > longestSubstring.length()){
        //             longestSubstring = sub;
        //         }
        //     }
        // }
        // return longestSubstring;

        //Generate odd length and even length palindromic substring by diverging from mid of string
        String longestSubstring = "";
        int n = s.length();
        int maxLength = 0;
        //ODD LENGTH PALLINDROME GENERATION
        for(int mid = 0; mid < n; mid++){
            int i = mid - 1;
            int j = mid + 1;
            int currLength = 1;
            while(i >= 0 && j < n&& s.charAt(i) == s.charAt(j)){
                i--;
                j++;
                currLength += 2;
            }
            if(currLength > maxLength){
                longestSubstring = s.substring(i+1,j);
                maxLength = currLength;
            }
        }

        //EVEN LENGTH PALLINDROME GENERATION
        for(int mid = 0; mid < n; mid++){
            int i = mid;
            int j = mid + 1;
            int currLength = 0;
            while(i >= 0 && j < n &&s.charAt(i) == s.charAt(j)){
                i--;
                j++;
                currLength += 2;
            }
            if(currLength > maxLength){
                longestSubstring = s.substring(i+1,j);
                maxLength = currLength;
            }

        }
        System.out.println(longestSubstring);

    }
}