// leetcode problem : 36

package DSA_CODING_PROBLEM.freeCodeCamp_leetcode;
import java.util.*;
public class ValidSuduko {
    public static boolean isValid(char[][] board){
        int n = board.length;
        HashSet<Character>[] row = new HashSet[n];
        HashSet<Character>[] col = new HashSet[n];
        HashSet<Character>[] box = new HashSet[n];

        for(int i=0;i<n;i++){
            row[i] = new HashSet<>();
            col[i] = new HashSet<>();
            box[i] = new HashSet<>();
        }

        for(int r=0;r<n;r++){
            for(int c=0;c<n;c++){
                char val = board[r][c];
                //row check
                if(row[r].contains(val)){
                    return false;
                }
                row[r].add(val);
                
                //col check
                if(col[c].contains(val)){
                    return false;
                }
                col[c].add(val);

                // box check
                int box_no = (r/3)*3+(c/3);
                if(box[box_no].contains(val)){
                    return false;
                }
                box[box_no].add(val);
            }
        }
        return true;

    }

    public static void main(String args[]){
        char board[][] = {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };
        System.out.println("Is Valid suduko : " + isValid(board));
    }
    
}
