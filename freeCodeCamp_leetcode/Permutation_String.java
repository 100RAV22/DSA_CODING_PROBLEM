public class Permutation_String {
    public static boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        if(n > m){
            return false;
        }
        int s1Map[] = new int[26];
        int s2Map[] = new int[26];
        for(int i=0;i<n;i++){
            s1Map[s1.charAt(i)-'a']++;
            s2Map[s2.charAt(i)-'a']++;
        }

        for(int i=0;i<m-n;i++){
            if(matches(s1Map, s2Map)){
                return true;
            }
            s2Map[ s2.charAt(i+n) - 'a']++;
            s2Map[ s2.charAt(i)-'a']--;
        }
        return matches(s1Map, s2Map);
    }
    public static boolean matches(int arr1[], int arr2[]){
        for(int i=0;i<26;i++){
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        String s1 = "ab";
        String s2 = "eidbaooo";
        System.out.println(checkInclusion(s1, s2));
    }
}
