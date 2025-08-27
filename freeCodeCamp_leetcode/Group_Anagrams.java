// Leetcode problem: 49

package DSA_CODING_PROBLEM.freeCodeCamp_leetcode;
import java.util.*;
public class Group_Anagrams {

    
    public static ArrayList<ArrayList<String>> groupAnagram(String[] strs){
        
        if(strs.length == 0){
            return new ArrayList<>();
        }

        HashMap<String, ArrayList<String>> map = new HashMap<>();
        int[] freq = new int[26];

        for(String str: strs){
            Arrays.fill(freq, 0);
            for(char ch: str.toCharArray()){
                freq[ch-'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<26;i++){
                sb.append('#');
                sb.append(freq[i]);
            }
            String key = sb.toString();
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(str);
        }

        return new ArrayList<>(map.values());

    }
    public static void main(String args[]){
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        ArrayList<ArrayList<String>> groups = groupAnagram(strs);
        for(ArrayList<String> group : groups){
            System.out.println(group);
        }
    }
}
