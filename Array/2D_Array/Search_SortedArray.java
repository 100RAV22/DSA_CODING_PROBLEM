

public class Search_SortedArray {
    public static void Search(int[][] sortedArray, int key){
        int row = 0;
        int col = sortedArray[0].length-1;
        while(row < sortedArray.length && col >= 0){
            if(sortedArray[row][col]==key){
                System.out.println("("+ row +", " + col +")");
                break;
            }
            else if(sortedArray[row][col] > key){
                col--;
            }else{
                row++;
            }
        }
    }
  public static void main(String args[]){
    int sortedArray[][] = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
    Search(sortedArray, 33);
  }  
}
