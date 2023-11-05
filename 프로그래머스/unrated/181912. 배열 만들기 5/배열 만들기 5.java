import java.util.ArrayList;

class Solution {
public ArrayList<Integer> solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for (int i = 0; i < intStrs.length; i++) {
			String sub = intStrs[i].substring(s,s+l);
			int num = Integer.parseInt(sub);
			
			if (num > k) {
				list.add(num);
			}
			
        }
        return list;
    }
}