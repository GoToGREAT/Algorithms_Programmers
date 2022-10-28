/*
채점 결과
정확성: 64.7
합계: 64.7 / 100.0

시간은 모두 통과되었으나 replaceAll을 하며 출고 순서가 달라져 결과 값이 달라지는 오류 발생
 */

public class P133502_6 {
	class Solution {
	    public int solution(int[] ingredient) {
	        int answer = 0;
	        
	        StringBuilder ingreBulid = new StringBuilder();
	        for(int i=0; i<ingredient.length; i++) {
	        	ingreBulid.append(ingredient[i]);
	        }
	        
	        String ingre = ingreBulid.toString();
	        
	        while(true) {
	        	if(ingre.length() == ingre.replaceAll("1231", "").length()) break;
	        	else {
	        		answer += (ingre.length() - ingre.replaceAll("1231", "").length())/4;   		
	        		ingre = ingre.replaceAll("1231", "");
	        	}
	        }
	        
	        return answer;
	    }
	}
}