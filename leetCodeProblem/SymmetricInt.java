
class SymmetricInt{
    public static void main(String args[]){
        int low = 1;
        int high = 100;
        int count = CountSymmetricInteger(low, high);
        System.out.println(count);
    }
    private static int CountSymmetricInteger(int low, int high){
        int count = 0;
        for(int num = low; num <= high; num++){
            String str = String.valueOf(num);
            int len = str.length();
            if(len % 2 == 1){
                continue;
            }

            int half = len / 2;
            int s1 = 0;
            int s2 = 0;
            for(int i=0;i<half;i++){
                s1 += str.charAt(i)-'0';
            }
            for(int i=half;i<len;i++){
                s2 += str.charAt(i)-'0';
            }
            if(s1 == s2){
                count++;
            }
        }
        return count;
    }
}