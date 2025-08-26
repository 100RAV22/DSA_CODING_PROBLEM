

public class DiagonalSum {
    public static int diagonalSum(int[][] Matrix){
        int sum = 0;
        int n =Matrix.length;
        for(int i=0;i<n;i++){
            sum += Matrix[i][i];

            if(i != n-1-i){
                sum += Matrix[i][n-1-i];
            }
        }
        return sum;
    }
    public static void main(String args[]){
        int[][] Matrix = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        int sum = diagonalSum(Matrix);
        System.out.println("sum of diagonal element : "+ sum);
    }
}
