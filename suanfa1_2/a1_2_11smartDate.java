package suanfa1_2;

import edu.princeton.cs.algs4.Date;
import edu.princeton.cs.algs4.StdOut;

public class a1_2_11smartDate  {
    private int[] days={31,28,31,30,31,30,31,31,30,31,30,31};
    private int day;
    private int month;
    private int year;

    a1_2_11smartDate(int month, int day, int year)  {
        if(!checkDate(month,day,year))throw new IllegalArgumentException("Input Date is Wrong");
        else{
            this.month=month;
            this.day=day;
            this.year=year;
        }
    }
    private boolean checkDate(int month, int day, int year){
        if (month>12||month<1)return false;
        if (year<0)return false;
        if (year%4==0&&year%100!=0)days[1]=29;
        if (day>days[month-1]||day<0)return false;
        return true;
    }
    int yearOfDay(){
        int today=day;
        for (int i = 0; i < month-1; i++) {
            today+=days[i];
        }
        return today;
    }
    int day(){
        return day;
    }
    int month(){
        return month;
    }
    int year(){
        return year;
    }
    public String toString (){
        return (month+"-"+day+"-"+year);
    }

    public static void main(String[] args) {
        a1_2_11smartDate date=new a1_2_11smartDate(2,29,2004);
        StdOut.println(date);
    }
}
