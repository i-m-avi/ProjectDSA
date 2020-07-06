class Solution {
    public int reverse(int x) {
    
        if(x > Integer.MAX_VALUE || x < Integer.MIN_VALUE)
        {
            return 0;
        }
        int ans=0;
        while(x != 0)
        {
            int digit = x%10;
            x /= 10;
            if(ans > Integer.MAX_VALUE/10 || ans == Integer.MAX_VALUE/10 && digit > Integer.MAX_VALUE%10) 
                return 0;
            if(ans < Integer.MIN_VALUE/10 || ans == Integer.MIN_VALUE/10 && digit < Integer.MIN_VALUE%10) 
                return 0;
            ans=ans*10 + digit;
        }
        return ans;
    }
}