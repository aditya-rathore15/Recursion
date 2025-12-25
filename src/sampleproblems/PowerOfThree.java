package sampleproblems;

public class PowerOfThree {
    public static boolean isPowerOfThree(int n) {
        if(n==1) return true;
        if(n<=0 || n%3!=0) return false;
        return isPowerOfThree(n/3);
    }

    public static void main(String[] args) {
        boolean res = isPowerOfThree(4);
        System.out.println(res);
    }
}
