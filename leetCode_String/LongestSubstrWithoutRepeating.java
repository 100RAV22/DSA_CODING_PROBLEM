import java.util.*;
class LongestSubstrWithoutRepeating{
    public static void main(String args[]){
        String str = "abcabcbb";
        System.out.println("Length of longest substring without repeating Character : " + longestSubstring(str));
    }
    public static int longestSubstring(String str){
        Set<Character> set = new HashSet<>();
        int maxlen = 0;
        int left = 0;
        for(int i=0;i<str.length();i++){
            char curr = str.charAt(i);
            if(!set.contains(curr)){
                set.add(curr);
                maxlen = Math.max(maxlen, i-left+1);
            }else{
                while(str.charAt(left) != str.charAt(i)){
                    set.remove(str.charAt(left));
                    left++;
                }
                set.remove(str.charAt(left));
                left++;
                set.add(str.charAt(i));
            }
        }
        return maxlen;
    }
}