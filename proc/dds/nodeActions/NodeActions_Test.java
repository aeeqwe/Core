package proc.dds.nodeActions;

import java.util.Arrays;
import proc.dds.Node;

public class NodeActions_Test {

	public static void main(String[] args) {
		Node tailA = genIter(10, 20, 30, 40);
		Node tailB = genRec(25, 25, 30, 45);

		System.out.println(toStringIter(tailA));
		System.out.println(toStringRec(tailB));
	}

	public static Node genIter(int... values) {
		Node tail = null;
		for (int k = values.length - 1; k >= 0; k--) {
			tail = new Node(values[k], tail);
		}
		return tail;
	}

	public static Node genRec(int... v) {
		return v.length == 0 ? null : new Node(v[0], genRec(Arrays.copyOfRange(v, 1, v.length)));
	}

	public static String toStringIter(Node tail) {
		String result = "";
		while (tail != null) {
			result += tail.value + "->";
			tail = tail.next;
		}
		return result + "*";
	}

	public static String toStringRec(Node tail) {

		return (tail == null) ? "*" : tail.value + "->" + toStringRec(tail.next);
	}

}
