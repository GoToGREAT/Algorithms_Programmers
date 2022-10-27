/*
채점 결과
정확성: 47.1
합계: 47.1 / 100.0
 */

public class P133502_1 {
	class Solution {
	    public int solution(int[] ingredient) {
	        int answer = 0;
	        
	        String ingre = "";
	        for(int i=0; i<ingredient.length; i++) {
	        	ingre += Integer.toString(ingredient[i]);
	        }
	        
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