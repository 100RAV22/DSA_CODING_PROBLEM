public class Longest_Repeating_Char_replacement {
    public static int characterReplacement(String s, int k){
        int occurence[] = new int[26];
        int maxRepeatChar = 0;
        int maxLen = 0;
        int left = 0;
        for(int right = 0; right<s.length();right++){
            char ch = s.charAt(right);
            maxRepeatChar = Math.max(maxRepeatChar, ++occurence[ch-'A']);
            int len = right - left +1;
            if(len - maxRepeatChar > k){
                occurence[s.charAt(left)-'A']--;
                left++;
            }
            maxLen = Math.max(maxLen, right-left+1);
        }
        return maxLen;
    }
    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 1;
        System.out.println(characterReplacement(s, k));
    }
}
