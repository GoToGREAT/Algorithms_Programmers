public class P120869 {
	class Solution {
	    public int solution(String[] spell, String[] dic) {
	        int answer = 2;
	        
	        int max = spell.length;
	        
	        for(int i=0; i<dic.length; i++) {
	        	String now = dic[i];
	        	
	        	if(now.length() < spell.length) { continue; }
	        	
	        	int count = 0;
	        	
	        	while(true) {
	        		if(count == max) return 1;
	        		if(!now.contains(spell[count++])) break;
	        	}
	        }
	        
	        return answer;
	    }
	}
}