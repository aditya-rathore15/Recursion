package sampleproblems;

public class PowerOfFour {
    public static boolean isPowerOfFour(int n) {
        if(n==1) return true;
        if(n<=0 || n%4!=0) return false;
        return isPowerOfFour(n/4);
    }

    public static void main(String[] args) {
        boolean res = isPowerOfFour(4);
        System.out.println(res);
    }
}
