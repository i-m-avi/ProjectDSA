import java.util.Hashtable;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        Hashtable<Character,Character> check = new Hashtable<>();
        check.put('(',')');
        check.put('[',']');
        check.put('{','}');
        for(int i=0; i<s.length(); i++)
        {
            char c = s.charAt(i);
            if(c == '(' || c == '[' || c == '{')
            {
                st.push(c);
            }
            else if(st.size() != 0)
            {
                char topElement = st.pop();
                if( check.get(topElement) != c)
                {
                    return false;
                }
            }
            else
            {
                return false;
            }
        }
        return st.isEmpty();
    }
}