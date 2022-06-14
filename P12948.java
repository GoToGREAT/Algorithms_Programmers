
public class P12948 {
	class Solution {
	    public String solution(String phone_number) {
	        String answer = "";
	        String[] a = phone_number.split("");
	        int lena = a.length;
	        for(int i=0; i<lena-4;i++){
	            answer+="*";
	        }
	        answer+=a[lena-4];
	        answer+=a[lena-3];
	        answer+=a[lena-2];
	        answer+=a[lena-1];
	        return answer;
	    }
	}
}
