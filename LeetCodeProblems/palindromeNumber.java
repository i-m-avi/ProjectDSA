class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0 || (x % 10 == 0 && x!=0))
        {
            return false;
        }
        int halfrev = 0;
        while(x > halfrev)
        {
            halfrev = halfrev*10 + (x%10);
            x/=10;
        }
        return x == halfrev || x == halfrev/10;
        
    }
}