//leetcode problem : 3169
import java.util.*;
class countDays {
    public static void main(String args[]){
        int days=10;
        int meetings[][] = {{5,7},{1,3},{9,10}};
        int daysWithoutMeeting = count(days, meetings);
        System.out.println("Number of days Without meeting: "+daysWithoutMeeting);
    }
    public static int count(int days, int meetings[][]){
        Arrays.sort(meetings, Comparator.comparingInt(a->a[0]));
        int prevStart = -1;
        int prevEnd = -1;
        int meetingDays = 0;
        for(int meeting[] : meetings){
            int start = meeting[0];
            int end = meeting[1];
            if(start > prevEnd){
                if(prevStart != -1){
                    meetingDays += (prevEnd - prevStart + 1);
                }
                prevStart = start;
                prevEnd = end;
            }else {
                prevEnd = Math.max(prevEnd, end);
            }
        }
        if(prevStart != -1){
            meetingDays += (prevEnd - prevStart + 1);
        }

        return days-meetingDays;
    }
}