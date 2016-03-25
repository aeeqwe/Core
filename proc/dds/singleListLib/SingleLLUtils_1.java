package proc.dds.singleListLib;

import proc.dds.Node;

public class SingleLLUtils_1 {

	public static int length(Node tail) {

		if (tail == null)
			return 0;
		else
			return 1 + length(tail.next);

	}

	public static int max(Node tail) {
		if (tail == null)
			return 0;
		else
			return Math.max(tail.value, max(tail.next));
	}

	public static int sum(Node tail) {
		if (tail == null)
			return 0;
		else
			return tail.value + sum(tail.next);
	}

}
