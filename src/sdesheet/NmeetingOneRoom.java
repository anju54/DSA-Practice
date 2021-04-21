package sdesheet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

class Meeting {

    int startTime;
    int finishTime;
    int index;

    public Meeting(int startTime, int finishTime, int index) {
        this.startTime = startTime;
        this.finishTime = finishTime;
        this.index = index;
    }

    public Meeting() {
    }
}

class MeetingComparator implements Comparator<Meeting>{

    @Override
    public int compare(Meeting t1, Meeting t2) {
        if (t1.finishTime > t2.finishTime)
            return 1;
        else if (t1.finishTime < t2.finishTime)
            return -1;
        else
            return 0;
    }
}

public class NmeetingOneRoom {

    static void maxMeetings(int []s, int []f, int n){

        ArrayList<Meeting> meetingArrayList = new ArrayList<>();
        for (int i=0;i<n;i++)
            meetingArrayList.add(new Meeting(s[i],f[i],i+1));

        MeetingComparator mc = new MeetingComparator();
        Collections.sort(meetingArrayList,mc);

        int lastMeetingTime = 0;

        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(meetingArrayList.get(0).index);
        lastMeetingTime = meetingArrayList.get(0).finishTime;

        for (int i=1;i<n;i++){
            if(meetingArrayList.get(i).startTime > lastMeetingTime){
                ans.add(meetingArrayList.get(i).index);
                lastMeetingTime = meetingArrayList.get(i).finishTime;
            }
        }
        System.out.println(ans.toString());
    }

    public static void main(String[] args) {

        maxMeetings(new int[]{0,5,15}, new int[]{30,10,20},3);
    }


}
