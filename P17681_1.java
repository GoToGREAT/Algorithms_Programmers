package programmers;

// ÇØ°á
public class P17681_1 {
	public static void main(String[] args) {
		int n = 6;
		int[] arr1 = {46, 33, 33 ,22, 31, 50};
		int[] arr2 = {27 ,56, 19, 14, 14, 10};
		
		Solutionq s = new Solutionq();
		String[] fi = s.solution(n, arr1, arr2);
		for(int i=0; i<fi.length; i++) {
			System.out.println(fi[i]);
		}
	}	
}

class Solutionq{
	public String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];
		for(int i=0; i<n; i++) {
			answer[i]="";
			int a = arr1[i];
			int b = arr2[i];
			
			int c = a|b;
			String fi = Integer.toBinaryString(c);
			System.out.println(fi);
			String[] fiarr = fi.split("");
			for(int q=0; q<fiarr.length; q++) {
				if(fiarr[q].equals("0")) {
					answer[i] += " ";
				} else {
					answer[i] += "#";
				}
			}
			if(fiarr.length!=n) {
				int ee = n-fiarr.length;
				for(int t=0;t<ee;t++) {
					answer[i] = " "+answer[i];
				}
			}
				
			System.out.println(answer[i]);
			
		}	   
		return answer;
	}
}