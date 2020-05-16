package suanfa1_2;

import edu.princeton.cs.algs4.Date;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Transaction;

public class a1_2_13Transaction implements Comparable<Transaction>{
    private String who;
    private Date when;
    private double amount;
    public a1_2_13Transaction(String who,Date when,double amount){
        this.who=who;
        this.when=when;
        this.amount=amount;
    }
    public a1_2_13Transaction(String transaction){
        String[] data=transaction.split("\\s");
        this.who=data[0];
        this.when=new Date(data[1]);
        this.amount=Double.parseDouble(data[2]);
    }
    public String who(){
        return this.who;
    }
    public Date when(){
        return this.when;
    }
    public double amount(){
        return this.amount;
    }
    public String toString(){
        return ("Client: "+who+" Date:"+when+" Amount:"+amount);
    }
    public boolean equals(Object that){
        if (that == this) return true;
        if (that == null) return false;
        if (a1_2_13Transaction.class!=that.getClass())return false;
        a1_2_13Transaction temp=(a1_2_13Transaction)that;
        if ( (this.amount==temp.amount()) && (this.when.equals(temp.when())) && (this.who.equals(temp.who())) )return true;
        return false;
    }
    @Override
    public int compareTo(Transaction o) {
        if (this.amount<o.amount())return -1;
        if (this.amount>o.amount())return 1;
        return 0;
    }

    public static void main(String[] args) {
        a1_2_13Transaction test=new a1_2_13Transaction("a",new Date(2,16,2002),10);
        a1_2_13Transaction test2=new a1_2_13Transaction("a",new Date(2,16,2002),10);
        a1_2_13Transaction test3=new a1_2_13Transaction("b",new Date(2,16,2002),10);
        a1_2_13Transaction test4= new a1_2_13Transaction("abc 02/16/2002 10");
        StdOut.println(test4);
        String a="ad";
        StdOut.print(test.equals(test2));
    }
}
