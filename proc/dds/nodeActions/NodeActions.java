package proc.dds.nodeActions;

import proc.dds.Node;

public class NodeActions {
	public static Node copy(Node tail) {
		return (tail == null) ? null : new Node(tail.value, copy(tail.next));
	}

	public static boolean isEqual(Node tailA, Node tailB) {

		if (tailA != null && tailB != null) {
			return (tailA.value == tailB.value) && isEqual(tailA.next, tailB.next);

		} else {
			return tailA == tailB;
		}
	}

	public static Node merge(Node tailA, Node tailB) {
		if (tailA != null && tailB != null) {
			if (tailA.value < tailB.value) {
				return new Node(tailA.value, merge(tailA.next, tailB));
			} else {
				return new Node(tailB.value, merge(tailA, tailB.next));

			}
		} else {
			return (tailA == null) ? tailB : tailA;
		}
	}

}
