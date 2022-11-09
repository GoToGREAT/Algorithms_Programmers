
/*채점 결과

*/
public class P120886_Test {
	public static void main(String[] args) {
		String before = "olleh";
		String after = "hello";
	    	for(int i=0; i<before.length(); i++) {	    		
	    		System.out.println(i+" : "+after);
	    		System.out.println(i+" : "+after.replaceFirst(String.valueOf(before.indexOf(i)), ""));
	    		if(after.equals(after.replaceFirst(String.valueOf(before.charAt(i)), ""))) {
	    			 System.out.println("끝났습니다 : 실패");
	    			 break;
	    		} else after = after.replaceFirst(String.valueOf(before.indexOf(i)), "");
	    	}
	        System.out.println("끝났습니다 : 성공");
	 
	}
}