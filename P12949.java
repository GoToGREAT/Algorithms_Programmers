public class P12949 {
	class Solution {
	    public int[][] solution(int[][] arr1, int[][] arr2) {
	    	int a = arr1.length;
	    	int b = arr1[0].length;
	    	
	    	int c = arr2.length;
	    	int d = arr2[0].length;
	    	
	        int[][] answer = new int[a][d];
	        
	        for(int i=0; i<a; i++) {
	        	for(int q=0; q<d; q++) {
	        		int sum = 0;
	        		for(int w=0; w<b; w++) {
	        			sum += arr1[i][w]*arr2[w][q];
	        		}
	        		answer[i][q] = sum;
	        	}
	        }
	        return answer;
	    }
	}
}