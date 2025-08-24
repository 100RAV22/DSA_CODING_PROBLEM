package star_pattern;
import java.util.Scanner;

public class pattern_5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n= sc.nextInt();
        for(int i=n-1;i>=0;i--){
            for(int j=i;j<n;j++){
                System.out.print("_");
            }
            for(int j=0;j<(2*i+1);j++){
                System.out.print("*")
            }
            System.out.println();
        }
    }
}
