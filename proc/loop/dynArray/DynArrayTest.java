package proc.loop.dynArray;
import java.util.Arrays;

public class DynArrayTest {

	public static void main(String[] args) {
		DynArray ar = new DynArray();
		System.out.println(Arrays.toString(ar.data));	
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(40);
		ar.add(50);
		System.out.println(Arrays.toString(ar.data));
		
		ar.remove();
		System.out.println(Arrays.toString(ar.data));
		
		ar.remove(2);
		System.out.println(Arrays.toString(ar.data));

		ar.add(1, 0);
		System.out.println(Arrays.toString(ar.data));
	}

}
