/*
채점 결과
정확성: 52.9
합계: 52.9 / 100.0
 */

public class P133502_2 {
	class Solution {
	    public int solution(int[] ingredient) {
	        int answer = 0;
	        
	        String ingre = "";
	        for(int i=0; i<ingredient.length; i++) {
	        	ingre += Integer.toString(ingredient[i]);
	        }
	        
	        while(true) {
	        	if(ingre.length() == ingre.replaceAll("1231", "").length()) break;
	        	else {
	        		answer += (ingre.length()-ingre.replaceAll("1231", "").length())/4;	        		
	        		ingre = ingre.replaceAll("1231", "");
	        	}
	        }
	        
	        return answer;
	    }
	}
}