import java.util.*;
class Heap{
    static ArrayList<Integer> arr = new ArrayList<>();
    public static void main(String args[]){
        Add(2);
        Add(3);
        Add(4);
        Add(5);
        Add(10);
        Add(1);
        print();
        while(!arr.isEmpty()){
            System.out.print(peek()+" ");
            remove();
        }
    }

    public static void print(){
        for(int i = 0; i < arr.size(); i++){
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
    }

    public static void Add(int n ){
        arr.add(n);
        int x = arr.size()-1;
        int par = (x-1)/2;
        while(arr.get(x)<arr.get(par)){
            int temp = arr.get(x);
            arr.set(x, arr.get(par));
            arr.set(par, temp);
            x = par;
            par = (x-1)/2;
        }
    }

    public static int peek(){
        return arr.get(0);
    }

    public static int remove(){
        int data = arr.get(0);
        int temp = arr.get(0);
        arr.set(0,arr.get(arr.size()-1));
        arr.set(arr.size()-1, temp);

        arr.remove(arr.size()-1);
        heapify(0);
        return data;
    }
    public static void heapify(int i){
        int left = 2*i+1;
        int right = 2*i+2;
        int minIdx = i;
        if(left<arr.size() && arr.get(left)<arr.get(minIdx)){
            minIdx=left;
        }
        if(right<arr.size() && arr.get(right)<arr.get(minIdx)){
            minIdx=right;
        }
        if(minIdx!=i){
            int temp = arr.get(i);
            arr.set(i, arr.get(minIdx));
            arr.set(minIdx, temp);
            heapify(minIdx);
        }
    }
}