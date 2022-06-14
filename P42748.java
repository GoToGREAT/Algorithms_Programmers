import java.util.Arrays;

public class P42748 {
	// 배열 오름차순을 할 줄 알아야 함.
	class Solution {
	    public int[] solution(int[] array, int[][] commands) {
	        int[] answer = new int[commands.length];// 정답 개수
	        for(int i=0; i<answer.length; i++) {
	        	int[] preanswer = new int[commands[i][1]-commands[i][0]+1];
	        	int cnt=0;
	        	for(int a=commands[i][0]-1; a<commands[i][1]; a++) {
	        		preanswer[cnt++] = array[a];	        		
	        	}
	        	Arrays.sort(preanswer);
	        	answer[i]=preanswer[commands[i][2]-1];
	        }        
	        return answer;
	    }
	}
}
