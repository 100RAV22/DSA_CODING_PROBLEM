package star_pattern;

import java.util.Scanner;

public class pattern_7 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n= sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=i;j<(2*i+1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-2;i>=0;i--){
            for(int j=i;j<(2*i+1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
