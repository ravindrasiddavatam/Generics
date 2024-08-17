package FromTelusko;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Collection<Integer> values = new ArrayList<>();
//		values.add(89);
//		values.add(3);
//		values.add(77);
//		values.add(88);
//		
//		//values.add(1,9);
//		
//		Collections.sort(values);
		
		/////////////////////////////////
		
		List<Integer> values = new ArrayList<>();
		values.add(89);
		values.add(3);
		values.add(77);
		values.add(88);
		
		//values.add(1,9);
		
		Collections.sort(values);
		
		values.forEach(System.out::println); //Stream API, Lambda Expression
		
		
		//System.out.println(values);
		

	}

}
