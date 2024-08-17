import java.util.ArrayList;
import java.util.List;


	
	class Container<T>
	{
		T value;
		
		public T getValue() {
			return value;
		}

		public void setValue(T value) {
			this.value = value;
		}

		public void show() {
			System.out.println(value.getClass().getName());
		}
		public void demo(ArrayList<? extends T> obj)
		{
			
		}
	}
	public class GenericsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Container<Integer> obj = new Container<Integer>();
		obj.value=9;
		obj.show();
		
		
		
//		List values = new ArrayList();
//		
//		values.add(7);
//		values.add("Navin Telusko");
//		
//		int i =Integer.parseInt(values.get(1).toString());
//		System.out.println(i);

	}

}
