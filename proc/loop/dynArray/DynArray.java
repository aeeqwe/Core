package proc.loop.dynArray;
import static java.lang.System.arraycopy;

public class DynArray {
	int[] data = {};


	void add(int elem) {
		add(data.length, elem);

	}

	void remove() {
		remove(data.length - 1);
	}

	void add(int index, int elem) {
		int tmp[] = new int[data.length + 1];
		arraycopy(data, 0, tmp, 0, index);
		arraycopy(data, index, tmp, index + 1, data.length - index);
		tmp[index] = elem;
		this.data = tmp;

	}

	void remove(int index) {
		int [] tmp = new int [data.length - 1];
		arraycopy(data, 0, tmp, 0, index);
		arraycopy(data, index + 1, tmp, index, data.length - index - 1);
		this.data = tmp;

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
