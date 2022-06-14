import java.util.ArrayList;
import java.util.Arrays;

public class P42576 {
	// 효율성 테스트 탈락
	class Solution {
	    public String solution(String[] participant, String[] completion) {
	        String answer = "";
	        ArrayList<String> completionl = new ArrayList<String>(Arrays.asList(completion));
	        for(int a=0; a<participant.length; a++){
	             int b = completionl.indexOf(participant[a]);
	             if(b != -1){completionl.remove(b);}
	             else {answer=participant[a];}
	        }
	        return answer;
	    }
	}
}
