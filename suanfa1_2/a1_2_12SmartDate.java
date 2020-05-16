package suanfa1_2;

import edu.princeton.cs.algs4.StdOut;

public class a1_2_12SmartDate extends a1_2_11smartDate{
    private final String[] weeks={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
    a1_2_12SmartDate(int month, int day, int year) {
        super(month, day, year);
    }
    String dayOfTheWeek (){
        int week;
        //  W = [Y-1] + [(Y-1)/4] - [(Y-1)/100] + [(Y-1)/400] + D;
        week = super.year()-1+(super.year()-1)/4 - (super.year()-1)/100 + (super.year()-1)/400 +super.yearOfDay();
        week %= 7;
        return weeks[week-1];
    }

    public static void main(String[] args) {
        a1_2_12SmartDate date=new a1_2_12SmartDate(5,16,2020);
        StdOut.println(date.dayOfTheWeek());
    }
}
