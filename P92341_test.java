import java.util.Arrays;
import java.util.HashMap;

public class P92341_test {
	public static void main(String[] args) {
	    	int[] fees= {180, 5000, 10, 600};
	    	
	    	String[] records = {"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"};
	    	
	    	carstay carstay = new carstay(fees);
	    	for(int i=0; i<records.length; i++) {
	    		String[] record_arr = records[i].split(" ");
	    		if(record_arr[2].equals("IN")) {
	    			String[] time = record_arr[0].split(":");
	    			int car_number = Integer.parseInt(record_arr[1]);
	    			int input_h = Integer.parseInt(time[0]);
	    			int input_m = Integer.parseInt(time[1]);
	    			car car = new car(car_number, input_h, input_m);
	    			carstay.input_car(car);    			
	    		} else {
	    			String[] time = record_arr[0].split(":");
	    			int car_number = Integer.parseInt(record_arr[1]);
	    			int output_h = Integer.parseInt(time[0]);
	    			int output_m = Integer.parseInt(time[1]);
	    			carstay.output_car(car_number, output_h, output_m);
	    		}	
	    	}
	    	carstay.finish();
	    	
	    	HashMap<Integer, Integer> time_list = carstay.time_list;
	    	Object[] mapkey = time_list.keySet().toArray();
	    	Arrays.sort(mapkey);
	    	int[] answer = new int[mapkey.length];
	    	for(int i=0; i<mapkey.length; i++) {
	    	 int time = time_list.get(mapkey[i]);
	    	 int cost = carstay.count_cost(time);
	    	 answer[i] = cost;
	    	}
	    }
	}


