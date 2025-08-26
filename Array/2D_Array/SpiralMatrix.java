class Spiralmatrix {
    public static void printSpiralMatrix(int[][] Matrix){
        int n=Matrix.length;
        int m=Matrix[0].length;
        int rowStart = 0;
        int rowEnd = n-1;
        int colStart = 0;
        int colEnd = m-1;

        while(rowStart < n && rowEnd >= 0 && colStart < m && colEnd >= 0){
            //top 
            for(int j=colStart; j<=colEnd; j++){
                System.out.print(Matrix[rowStart][j]+" ");
            }

            //right
            for(int i=rowStart+1;i<=rowEnd;i++){
                System.out.print(Matrix[i][colEnd]+" ");
            }

            //bottom
            for(int j=colEnd-1; j>=colStart;j --){
                if(rowStart == rowEnd) {
                    break;
                }
                System.out.print(Matrix[rowEnd][j]+" ");
            }

            //left
            for(int i=rowEnd-1;i>=rowStart+1;i--){
                if(colStart == colEnd){
                    break;
                }
                System.out.print(Matrix[i][colStart]+" ");
            }

            rowStart++;
            rowEnd--;
            colStart++;
            colEnd--;
        }
    }
    public static void main(String args[]){
        int[][] Matrix = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        printSpiralMatrix(Matrix);
    }
}