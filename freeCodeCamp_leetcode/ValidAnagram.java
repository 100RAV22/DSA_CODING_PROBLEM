//Leetcode problem : 242

package DSA_CODING_PROBLEM.freeCodeCamp_leetcode;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t){

        int n = s.length();
        int m = t.length();
        if(n != m){
            return false;
        }

        int[] freq = new int[26];
        for(int i=0;i<n;i++){
            freq[s.charAt(i)-'a']++;
            freq[t.charAt(i)-'a']--;
        }
        for(int count : freq){
            if(count != 0){
                return false;
            }
        }
        return true;
        
    }
    public static void main(String args[]){
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));
    }
}
