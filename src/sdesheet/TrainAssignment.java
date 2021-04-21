package sdesheet;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

/**
 * input : 3 platform , arrival array , departure array
 * output : true/false ,  find whether we can accommodate all the train or not
 */
public class TrainAssignment {

    public static void main(String[] args) throws ParseException {

        String arrival[] = { "10:10", "10:15", "10:10",  "10:35", "11:00"};
        String departure[] = { "10:30", "10:40", "10:50", "11:00", "11:20", "11:30"};

        //String res = timeParser("11:00","10:30");
        System.out.println(solve(arrival,departure));
    }

    public static boolean solve( String arrival[] , String departure[] ) throws ParseException {

        ArrayList<String> platform = new ArrayList<>();
        int dIndex = 0;

        Arrays.sort(departure);
        for (int i =0;i<arrival.length;i++){

            if(platform.size() != 3) {
                System.out.println("Arriving .." + arrival[i]);
                platform.add(arrival[i]);
            }else{
                String res = timeParser(arrival[i],departure[dIndex]);
                if(res.equals(departure[dIndex])){
                    System.out.println("cant accommodate");
                    return false;
                }else{
                    System.out.println("Removing .."+departure[i]);
                    platform.remove(arrival[i]);
                    System.out.println("Arriving .."+arrival[i]);
                    platform.add(arrival[i]);
                }
                dIndex++;
            }
        }
       return true;
    }
                                    // 11 10.30
    public static String  timeParser(String time,String time1) throws ParseException {
        SimpleDateFormat s = new SimpleDateFormat("HH:mm");
        Date d = s.parse(time);
        Date d1 = s.parse(time1);

        long ms = d.getTime();
        long ms1 = d1.getTime();

//        System.out.println(ms + " , "+ ms1);
//
//        System.out.println(Math.max(ms,ms1));

        return Math.max(ms,ms1) == ms ? time : time1;
    }
}
