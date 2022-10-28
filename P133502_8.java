/*
채점 결과
정확성: 58.8
합계: 58.8 / 100.0

입력 for문 줄이기로는 수습할 수 없음
 */

public class P133502_8 {
	class Solution {
	    public int solution(int[] ingredient) {
	        int answer = 0;
	        
	        StringBuilder ingreBulid1 = new StringBuilder();
	        StringBuilder ingreBulid2 = new StringBuilder();
	        StringBuilder ingreBulid3 = new StringBuilder();
	        StringBuilder ingreBulid4 = new StringBuilder();
	        
	        for(int i=0; i<250000; i++) {
	        	if(i>= ingredient.length) break;	        	
	        	ingreBulid1.append(ingredient[i]);
	        	if(250000+i< ingredient.length) ingreBulid2.append(ingredient[250000+i]);
	        	if(500000+i< ingredient.length) ingreBulid3.append(ingredient[500000+i]);
	        	if(750000+i< ingredient.length) ingreBulid4.append(ingredient[750000+i]);
	        }
	        
	        String ingre = ingreBulid1.toString()+ingreBulid2.toString()+ingreBulid3.toString()+ingreBulid4.toString();
	        
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