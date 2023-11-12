class Solution {
    public String solution(String my_string, int s, int e) {
        
    	StringBuffer sb = new StringBuffer(my_string);
        StringBuffer rv = new StringBuffer(my_string.substring(s,e+1));
        
        rv.reverse();
        sb.replace(s, e+1, rv.toString());
        
        return sb.toString();
    }
}