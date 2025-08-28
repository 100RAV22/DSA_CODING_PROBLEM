//leetcode problem : 271

package DSA_CODING_PROBLEM.freeCodeCamp_leetcode;
import java.util.*;

public class EncodeDecode {
    public static String Encode(ArrayList<String> strs){
        if(strs.size() == 0){
            return Character.toString((char)258);
        }

        StringBuilder sb = new StringBuilder();
        String seperator = Character.toString((char) 257); 
        for(String str : strs){
            sb.append(str);
            sb.append(seperator);
        }
        sb.deleteCharAt(sb.length()-1);
        
        return sb.toString();
    }

    public static List<String> Decode(String str){
        if(str.equals(Character.toString((char) 258))){
            return new ArrayList<>();
        }

        String seperator = Character.toString((char) 257);
        return Arrays.asList(str.split(seperator, -1));
    }
    public static void main(String args[]){
        ArrayList<String> input = new ArrayList<>(Arrays.asList("hello", "world"));
        String encode_String = Encode(input);
        List<String> decode = Decode(encode_String);
        System.out.print(decode);


    }
}
