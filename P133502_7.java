/*
채점 결과
정확성: 64.7
합계: 64.7 / 100.0

replaceAll과 동일한 점수 출력
 */

public class P133502_7 {
	class Solution {
	    public int solution(int[] ingredient) {
	        int answer = 0;
	        
	        StringBuilder ingreBulid = new StringBuilder();
	        
	        for(int i=0; i<ingredient.length; i++) {
	        	if(i<ingredient.length-3 && ingredient[i]==1
	        			&& ingredient[i+1]==2 && ingredient[i+2]==3 && ingredient[i+3]==1) {
	        		answer++;
	        		i = i+3;
	        	} else {
	        		ingreBulid.append(ingredient[i]);        		
	        	}	        	
	        }
	        
	        String ingre = ingreBulid.toString();
	        
	        while(true) {
	        	if(ingre.length() == ingre.replaceFirst("1231", "").length()) break;
	        	else {
	        		answer ++;	        		
	        		ingre = ingre.replaceFirst("1231", "");
	        	}
	        }
	        
	        return answer;
	    }
	}
}