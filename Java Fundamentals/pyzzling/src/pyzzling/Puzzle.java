package pyzzling;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
public class Puzzle {
	
	
	

	public ArrayList<Integer> array(int []arr){
		ArrayList<Integer> cars = new ArrayList<Integer>();
		int sum=0;
		for (int i=0;i<arr.length;i++){
			sum+=arr[i];
			if(arr[i]>10){
				cars.add(arr[i]);
			}
		}
			
		
			System.out.print(sum);
			return cars;
			
		
	}
	
	

}
