public class P12926 {
	class Solution {
	    public String solution(String s, int n) {
	        char[] arrs = s.toCharArray();
	        String answer = "";
	        
	        for(int i=0; i<arrs.length; i++){
	            int num = arrs[i];
	            // 아스키코드 번호 확인
	            arrs[i]+=n;
	            if(num>64 && num<91){
	                if(num+n>90){
	                    arrs[i]-=26;
	                }
	            } else if(num>96 && num<123){
	                if(num+n>122){
	                    arrs[i]-=26;
	                }                
	            } else{
	               arrs[i]-=n; 
	            }    
	            answer +=arrs[i];
	        }            
	        return answer;
	    }
	}
}
