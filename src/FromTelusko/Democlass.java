package FromTelusko;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Democlass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int values[] = new int[4];
//		
//		Object values1[]= new Object[4];
//		
//		values1[0]=7;
//		values1[1]="navin";
		
//		Collection values = new ArrayList<>();
//		values.add(2);
//		values.add("Navin");
//		values.add(5.8f);
		
//		Iterator i = values.iterator();
//		while(i.hasNext()) {
//			System.out.println(i.next());
//		}
//		
//		for(Object value:values) {
//			System.out.println(value);
//		}
		
		Collection<Integer> values=new ArrayList<>();
		values.add(3);
		values.add(9);
		values.remove(3);
//		for(int i:values) {
//			System.out.println(i);
//		}

		for(Integer i:values) {
			System.out.println(i);
		}
		

	}

}
