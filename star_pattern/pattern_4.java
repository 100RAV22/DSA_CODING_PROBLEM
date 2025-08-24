package star_pattern;
import java.util.*;
public class pattern_4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n= sc.nextInt();
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("_");
            }
            for(int j=0;j<(2*i+1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-2;i>=0;i--){
            for(int j=0;j<n-i;j++){
                System.out.print("_");
            }
            for(int j=0;j<(2*i+1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
