package programmers;

public class P12901 {
	/*
	 * public static void main(String[] args) { int a = 4; int b = 13;
	 * 
	 * Solution s = new Solution(); String you = s.solution(a, b);
	 * System.out.println(you);
	 * 
	 * }
	 */
}
class Solution {
	public String solution(int a, int b) {
		String[] answer = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
		int[] kkk = {31,60,91,121,152,182,213,244,274,305,335};
		if(a==1) {
			return answer[b%7];
		}		
		int sum = kkk[a-2]+b;
		return answer[sum%7];
	}
}