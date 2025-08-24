package star_pattern;

import java.util.Scanner;

public class pattern_8 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n= sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                System.out.print("_");
            }
            for(int j=0;j<(2*i+1);j++){
                if(j==0 || j==(2*i) || i==n-1){
                    System.out.print("*");
                }else{
                    System.out.print("_");
                }
            }
            System.out.println();
        }
    }
}
