class Solution {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        else if ( n > 0) {
            return (double) helper(x,n);
        }
        else {
            return (double) 1.0 / helper(x, n);
        }
    }
    static double helper (double x, int n) {
        if (n == 0) {
            return 1;
        }
        else {
            double y = helper(x, n/2);
            return n % 2 == 0  ? y * y : y * y * x;
        }
    }
}