class Solution {
    public int reverse(int x) {
        int rev=0;
        int n=Integer.MAX_VALUE;
        int m= Integer.MIN_VALUE;
        int lastDigit=0;
        while (x!=0){
            lastDigit= x%10;
            if (rev>n/10 || (rev== n/10 && lastDigit >7)) return 0;
            if (rev<m/10 || (rev== m/10 && lastDigit <-8)) return 0;
            rev=(rev*10)+lastDigit;
            x= x/10;
        }
        return rev;
    }
}