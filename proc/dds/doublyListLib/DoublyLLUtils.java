package proc.dds.doublyListLib;

import proc.dds.DoublyNode;

public class DoublyLLUtils {
	

	public static DoublyNode addLast(DoublyNode tail, int elem) {
		if (tail == null) {
			return new DoublyNode(elem, null, null);
		}

		DoublyNode originTail = tail;
		int k = 0;

		// calculate node's qty
		while (tail != null) {

			tail = tail.next;
			k++;
		}
		// go to last node
		DoublyNode tmp = originTail;
		for (int i = 0; i < k - 1; i++) {
			tmp = tmp.next;
			System.out.println(i);
			System.out.println(tmp.value);

		}

		DoublyNode newNode = new DoublyNode(elem, tmp.next, null);
		tmp.next = newNode;
		newNode.prev = tmp;

		return originTail;

	}

	public static DoublyNode insertInPosition(DoublyNode tail, int index, int elem) {

		DoublyNode originTail = tail;

		// iterator of node in list
		int k = 0;

		if (index == 0) {
			DoublyNode tmp = tail;
			tail = new DoublyNode(elem, null, tmp);
			tail.next = tmp;
			tail.prev = null;
			tail.next.prev = tail;
			return tail;
		}

		while (tail != null) {

			if (k == index - 1) {
				tail.next = new DoublyNode(elem, tail, tail.next);
				tail.next.next.prev = tail.next;
				break;
			}

			tail = tail.next;
			k++;

		}

		return originTail;

	}

	public static DoublyNode removeLast(DoublyNode tail) {

		DoublyNode originTail = tail;
		int k = 0;

		// calculate node's qty
		while (tail != null) {
			tail = tail.next;
			k++;
		}

		if (k == 1) {
			return null;
		}

		// go to last remaining node
		DoublyNode tmp = originTail;
		for (int i = 0; i < k - 2; i++) {
			tmp = tmp.next;
		}

		// add null instead delete node
		tmp.next = null;

		return originTail;
	}

	public static DoublyNode removeInPosition(DoublyNode tail, int index) {

        DoublyNode originalTail = tail; // 

        int k = 0;

        if (index == 0) {
            if (tail.next == null) {
                return null;
            }
            originalTail = tail.next;
            originalTail.prev = null;
        }

        while (tail != null) {

            if (k == index - 1 ) {

                if (tail.next.next == null) {
                    // for the last element
                   // tail.next.prev = null;
                    tail.next = null;
                } else {
                    // other case
                    tail.next.next.prev = tail;
                    tail.next = tail.next.next;
                }

            }

            tail = tail.next;
            k++;

        }

        return originalTail;
    }
	
	
	//
	// public static DoublyNode add(DoublyNode tail, int elem) {
	//
	// }
	//
	// public static DoublyNode remove(DoublyNode tail) {
	//
	// }
	//
	// public static DoublyNode add(DoublyNode tail, int index, int elem) {
	//
	// }
	//
	// public static DoublyNode remove(DoublyNode tail, int index) {
	//
	// }

}
