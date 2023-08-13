class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String n = a+""+b;
        String n1 = b+""+a;
        
        if(Integer.parseInt(n) > Integer.parseInt(n1)){
            answer = Integer.parseInt(n);
        } else {
            answer = Integer.parseInt(n1);
        }
        
        return answer;
    }
}