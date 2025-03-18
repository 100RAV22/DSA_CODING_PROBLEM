import java.util.*;
class MinOpr{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the p, q, r");
        int p = sc.nextInt();
        int q = sc.nextInt();
        int r = sc.nextInt();
        
        int res = Opr(p, q, r);
        System.out.println(res);
    }
    public static int Opr(int p, int q, int r){
        ArrayList<Integer> a = new ArrayList<>();
        a.add(p);
        a.add(q);
        a.add(r);
        Collections.sort(a);

        if(a.get(0).equals(a.get(1)) && a.get(1).equals(a.get(2))){
            return 0;
        }
        int opr=0;
        while(true){
            a.set(0, a.get(0)+1);
            a.set(1, a.get(1)+1);
            a.set(2, a.get(2)-1);
            opr++;
            Collections.sort(a);

            if(a.get(0).equals(a.get(1)) && a.get(1).equals(a.get(2))){
                return opr;
            }
            if((a.get(0).equals(a.get(1)) && a.get(1)+1 == a.get(2)) || (a.get(1).equals(a.get(2)) && a.get(0)+1==a.get(1))){
                return -1;
            }
        }
    }
}