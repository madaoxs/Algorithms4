package suanfa1_2;

import edu.princeton.cs.algs4.StdOut;

public class a1_2_16Rational {
    private final int numerator;
    private final int denominator;

    private static int gcd(int a, int b) {
        if (a >= b) ;
        else {
            a += b;
            b = a - b;
            a = a - b;
        }
        StdOut.println(" a=" + a + " b=" + b);
        if (a % b == 0) return b;
        a = a % b;
        return gcd(b, a);
    }

    public a1_2_16Rational(int numerator, int denominator) {
        if (denominator==0)throw new IllegalArgumentException("/0 Exception");
        assert check(numerator,denominator);
        this.numerator = numerator;
        this.denominator = denominator;

    }

    public a1_2_16Rational plus(a1_2_16Rational b) {
        if (this.numerator==0)return b;
        if (b.numerator==0)return this;
        return new a1_2_16Rational(this.numerator * b.denominator + b.numerator * this.denominator,
                this.denominator * b.denominator);
    }

    public a1_2_16Rational minus(a1_2_16Rational b) {
        if (this.numerator==0)return b;
        if (b.numerator==0)return this;
        return new a1_2_16Rational(this.numerator * b.denominator - b.numerator * this.denominator,
                this.denominator * b.denominator);
    }

    public a1_2_16Rational times(a1_2_16Rational b) {
        if (this.numerator==0||b.numerator==0)return b;
        a1_2_16Rational temp = new a1_2_16Rational(this.numerator * b.numerator, this.denominator * b.denominator);
        int t = temp.gcd(this.numerator,this.denominator);
        return new a1_2_16Rational(temp.numerator / t, temp.denominator / t);
    }

    public a1_2_16Rational divides(a1_2_16Rational b) {
        a1_2_16Rational temp = new a1_2_16Rational(this.numerator * b.denominator, this.denominator * b.numerator);
        int t = temp.gcd(this.numerator,this.denominator);
        return new a1_2_16Rational(temp.numerator / t, temp.denominator / t);
    }

    public boolean equals(a1_2_16Rational that) {

        if ( this.numerator==that.numerator&&this.denominator==that.denominator )return true;
        return false;
    }

    public String toString() {
        return (this.numerator+" / "+this.denominator);
    }
    private boolean check(int numerator,int denominator){
        if (numerator<Integer.MIN_VALUE||numerator>Integer.MAX_VALUE)return false;
        if (denominator<Integer.MIN_VALUE||denominator>Integer.MAX_VALUE)return false;
        else return true;
    }
    public static void main(String[] args) {
        a1_2_16Rational test=new a1_2_16Rational(2,3);
        a1_2_16Rational test2=new a1_2_16Rational(2,5);
        a1_2_16Rational test3= new a1_2_16Rational(0,10);
        a1_2_16Rational test4= new a1_2_16Rational(3,2);

        StdOut.println(test.plus(test2));
        StdOut.println(test.times(test4));
        StdOut.println(test.divides(test4));
        StdOut.println(test.minus(test2));
        StdOut.println(test.minus(test));

        a1_2_16Rational test5= new a1_2_16Rational(655356666,666666666);
        StdOut.println(test5.plus(test2));
        //StdOut.println(test.divides(test3));
    }
}

