package Recursion;

public class TowerOfHanoi {

    public static void solve(int s,int d,int h,int plates){

        if (plates==1){
            System.out.println("Move plate "+plates + " from "+s+" to " +d);
            return;
        }

        solve(s,h,d,plates-1);
        System.out.println("Moving plates "+plates+" from "+s+" to " +d);

        solve(h,d,s,plates-1);
    }

    public static void main(String[] args) {
        int plates = 4;
        int s = 1;
        int h = 2;
        int d = 3;
        solve(s,d,h,plates);
    }
}
