public class P12930 {
	class Solution {
	    public String solution(String s) {
	        String[] splits = s.split("");
	        String answer = "";
	        int cnt = 0;
	        for(int i=0; i<splits.length; i++){
	            if(cnt%2==0){
	                answer += splits[i].toUpperCase();
	            } else answer += splits[i].toLowerCase();
	            if(splits[i].equals(" ")) cnt=0;
	            else cnt++;
	        } 
	        return answer;
	    }
	}
}
