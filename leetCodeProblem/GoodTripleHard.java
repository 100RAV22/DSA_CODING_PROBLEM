
class GoodTripleHard{

    static  class BIT{
        int[] tree;
        int n;
        public BIT(int n){
            this.n = n;
            tree = new int[n+2];
        }
        public void update(int i, int delta){
            i++;
            while(i<=n+1){
                tree[i] += delta;
                i += (i & -i);
            }
        }
        public int query(int i){
            i++;
            int sum = 0;
            while(i>0){
                sum += tree[i];
                i -= (i & -i);
            }
            return sum;
        }
        public int queryRange(int l, int r){
            return query(r) - query(l-1);
        }
    }


    public static long goodTriplets(int[] nums1, int[] nums2){
        int n = nums1.length;
        int[] pos2 = new int[n];
        for(int i=0;i<n;i++){
            pos2[nums2[i]] = i;
        }
        int[] mapped = new int[n];
        for(int i=0;i<n;i++){
            mapped[i] = pos2[nums1[i]];
        }

        BIT leftBIT =  new BIT(n);
        BIT rightBIT = new BIT(n);
        int[] rightCount = new int[n];
        for(int i=0; i<n; i++){
            rightBIT.update(mapped[i], 1);
        }
        long total = 0;
        for(int i=0; i<n; i++){
            rightBIT.update(mapped[i], -1);
            int leftLess = leftBIT.query(mapped[i]-1);
            int rightGreater = rightBIT.queryRange(mapped[i]+1,n);
            total += leftLess * rightGreater;
            leftBIT.update(mapped[i], 1);
        }
        return total;
    } 
    public static void main(String args[]){
        int[] nums1 = {2,0,1,3}, nums2 = {0,1,2,3};
        long res = goodTriplets(nums1, nums2);
        System.out.println(res);
    }
    
}