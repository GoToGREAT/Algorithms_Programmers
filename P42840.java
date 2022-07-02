public class P42840 {
	class Solution {
		// 테스트는 통과 그러나 채점 결과 정확성: 78.6
	    public int[] solution(int[] answers) {
	    	int[] a = {1,2,3,4,5};
	    	int[] b = {2,1,2,3,2,4,2,5};
	    	int[] c = {3,3,1,1,2,2,4,4,5,5};
	    	int[] score = {0,0,0};
	    	for(int i=0; i<answers.length;i++) {
	    		if(answers[i]==a[i%5]) score[0]++;
	    		if(answers[i]==b[i%8]) score[1]++;
	    		if(answers[i]==c[i%10]) score[2]++;
	    	}	    	
	    	
	    	int max=score[0];
	    	if(score[1]>max) max=score[2];
	    	if(score[2]>max) max=score[3];	    	
	    	
	    	int cnt=0;
	    	if(score[0]==max) cnt++;
	    	if(score[1]==max) cnt++;
	    	if(score[2]==max) cnt++;
	    	
	
	    	int[] answer = new int[cnt];
	    	if(score[2]==max) {
	    		answer[--cnt]=3;
	    	}
	    	if(score[1]==max) {
	    		answer[--cnt]=2;
	    	}	 
	    	if(score[0]==max) {
	    		answer[--cnt]=1;
	    	}
	        return answer;
	    }
	}
}
