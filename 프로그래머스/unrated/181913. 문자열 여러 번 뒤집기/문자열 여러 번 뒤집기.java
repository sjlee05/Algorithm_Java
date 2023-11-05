class Solution {
	public StringBuffer solution(String my_string, int[][] queries) {
        StringBuffer answer = new StringBuffer(my_string);
        
        for(int i=0; i<queries.length; i++) {
        	int start = queries[i][0];
        	int end = queries[i][1]+1;
        	
        	StringBuffer str = new StringBuffer(answer.substring(start, end));
        	str.reverse();
        	answer.replace(start, end, str.toString());
        }
        return answer;
    }
}