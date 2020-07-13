import java.util.*;
class Solution {
    public int numIdenticalPairs(int[] nums) {
        Hashtable<Integer,Integer> ans = new Hashtable<>();
        for(int i=0;i<nums.length;i++)
        {
            Integer num = ans.containsKey(nums[i]) ? ans.get(nums[i])+1 : 1;
            ans.put(nums[i], num);
        }
        int total = 0;
        Set<Integer> set = ans.keySet();
        Iterator<Integer> itr = set.iterator();
        while(itr.hasNext())
        {
            int n = ans.get(itr.next());
            if(n > 1)
            {
                total += (n*(n-1))/2;
            }
        }
        return total;
    }
}