class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
        answer = my_string.substring(0,s)+overwrite_string;
        
        if(my_string.length() > answer.length()){
            String str = my_string.substring(s+overwrite_string.length());
            answer += str;
        }
        
        return answer;
    }
}