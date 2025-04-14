import java.util.*;
class IntersectionArray{
    public static void main(String arg[]){
        int[] nums1 = {1,2,2,1}, nums2 = {2,2};
        int [] result = Intersection(nums1, nums2);
        for(int a : result){
            System.out.print(a +" ");
        }
    }
    private static int[] Intersection(int[] nums1, int[] nums2){
        HashSet<Integer> set = new HashSet<>();
        for(int a : nums1){
            set.add(a);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<nums2.length;i++){
            if(set.contains(nums2[i])){
                list.add(nums2[i]);
                set.remove(nums2[i]);
            }
        }
        int res[] = new int[list.size()];
        for(int i=0;i<list.size();i++){
            res[i] = list.get(i);
        }
        return res;
    }
}