
public class P12935 {
	class Solution {
		// 계속 answer[0]에만 값이 들어가는 오류 발생
	    public int[] solution(int[] arr) {
	        if(arr.length==1){
	            int[] a = {-1};
	            return a;
	        }
	        int min = arr[0];
	        for(int i=1; i<arr.length; i++){
	            if(arr[i]<min) min = arr[i];
	        }
	        
	        int[] answer = new int[arr.length-1];
	        
	        for(int i=0; i<arr.length; i++){
	            int a=0;            
	            if(arr[i]==min){
	                continue;
	            }
	            answer[a++]=arr[i];
	        }
	        
	        return answer;
	    }
	}
}
