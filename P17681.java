package programmers;

// 런타임 오류
public class P17681 {
	class Solution {
		public String[] solution(int n, int[] arr1, int[] arr2) {
			String[] answer = new String[n];
			for(int i=0; i<n; i++) {
				answer[i]="";
				String a1 = Integer.toBinaryString(arr1[i]);
				String b1 = Integer.toBinaryString(arr2[i]);
				
				if(a1.length()<n) {
					for(int k=0; k<n-a1.length(); k++) {
						a1 = "0"+a1;	    			
					}	    			
				}
				if(b1.length()<n) {	 
					int y = n-b1.length();
					for(int t=0; t<y; t++) {
						b1 = "0"+b1;
					}
				}		
				
				String[] a2 = a1.split("");
				String[] b2 = b1.split("");
				
				for(int k=0; k<n; k++) {
					if(a2[k].equals("1")||b2[k].equals("1")) {
						answer[i] += "#";
					} else answer[i] +=" ";	    					
				}	    		
			}	   
			return answer;
		}
	}
}
