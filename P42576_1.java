import java.util.Arrays;

public class P42576_1 {
	class Solution {
		    public String solution(String[] participant, String[] completion) {
		        String answer = "";
	            Arrays.sort(participant);
		        Arrays.sort(completion);
		        for(int a=0; a<participant.length; a++) {
		        	if(a==participant.length-1){
	                    return participant[a];
	                } else if (participant[a].equals(completion[a])==false){
	                    return participant[a];
	                }
		        }
		        return answer;
		    }
		}
}
