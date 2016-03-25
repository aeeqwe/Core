package proc.dds.singleListLib;

import proc.dds.Node;

public class SingleLLUtils_2 {

	public static Node add(Node tail, int elem) {
		return addRec(tail, SingleLLUtils_1.length(tail), elem);
	}

	public static Node remove(Node tail) {
		return remove(tail, 0);
	}

	public static Node addRec(Node tail, int index, int elem) {
    	if (index > SingleLLUtils_1.length(tail)) throw new IndexOutOfBoundsException("entered index > node.length");;

		if (tail == null)
			return null;
		if (index < 0)
			throw new IndexOutOfBoundsException("index <0");
		if (index == 0)
			return new Node(elem, tail);
		if (index == 1) {
			tail.next = new Node(elem, tail.next);
			}
		if (index > 1) {
			addRec(tail.next, index - 1, elem);
			}
		return tail;
	}

	public static Node removeRec(Node tail, int index) {
    	if (index >= SingleLLUtils_1.length(tail)) throw new IndexOutOfBoundsException("entered index > node.length");;
		if (tail == null) return null;
		if (index < 0) throw new IndexOutOfBoundsException("index <0");
		if (index == 0) tail = tail.next;
		if (index == 1) tail.next = tail.next.next;
    	if (index > 1)  removeRec(tail.next, index - 1);
		return tail;
		
	}

	public static Node add(Node tail, int index, int elem) {
		if (tail != null) {
			if (index < 0) {
				throw new IndexOutOfBoundsException("Index can't be <0");
			}
			if (index == 0) {
				return new Node(elem, tail);
			}
			Node interNode = tail;
			Node existNode = tail;
			while (index > 1) {
				if (existNode.next == null) {
					throw new IndexOutOfBoundsException("index > length of list");
				}
				existNode = existNode.next;
				index--;
			}
			existNode.next = new Node(elem, existNode.next);
			return interNode;

		}
		return new Node(elem, null);

	}

	public static Node remove(Node tail, int index) {
		if (tail != null) {
			if (index < 0) {
				throw new IndexOutOfBoundsException("index  <0");
			}
			if (index == 0) {
				tail = tail.next;
				return tail;
			}
			Node returnTail = tail;
			Node prevNode = null;
			while (index > 0) {
				prevNode = tail;
				if (prevNode == null) {
					throw new IndexOutOfBoundsException("index > lenght");
				}
				tail = tail.next;
				index--;
			}
			prevNode.next = tail.next;
			return returnTail;
		}

		throw new IndexOutOfBoundsException("tail is null");
	}

	
	public static Node addLast(Node tail, int value) {

        // проверяем если список содержит null
        if (tail == null) {
            return new Node(value, null);
        }

        Node head = tail; // сохраним ссылку на "голову" списка
        int k = 0;

        // считаем сколько всего элементов в списке
        while (tail != null) {
            tail = tail.next;
            k++;
        }
        // System.out.println("k = " + k);

        // идем до последнего элемента
        Node tmp = head;
        for (int i = 0; i < k - 1; i++) {
            tmp = tmp.next;
        }
        //System.out.println("tail.value = " + tmp.value);

        // добавляем к нему новый узел
        tmp.next = new Node(value, null);

        // вернем измененный список
        return head;

    }
	
	
	public static Node insertInPosition(Node tail, int index, int value) {

        Node head = tail; // сохраним ссылку на "голову" списка.

        // позиция элемента списка
        int k = 0;

        // если хотим вставить в начало
        if (index == 0) {
            Node tmp = tail;
            tail = new Node(value, null);
            tail.next = tmp;
            return tail;
        }

        while (tail != null) {

            if (k == index - 1 ) {
                Node tmp = tail.next;
                tail.next = new Node(value, null);
                tail.next.next = tmp;
                break;
            }

            tail = tail.next;
            k++;

        }

        return head;

	}
	
	public static Node removeInPosition(Node tail, int index) {

        Node head = tail; // сохраним ссылку на "голову" списка

        // позиция элемента списка
        int k = 0;

        // если хотим удалить из начала
        if (index == 0) {
            if (tail.next == null) {
                return null;
            }
            head = tail.next;
        }

        //SingleLLUtils.removeInPosition(1->2->3, 0) = 2->3
        while (tail != null) {

            if (k == index - 1 ) {
                tail.next = tail.next.next;

            }

            tail = tail.next;
            k++;

        }

        return head;


    }
	public static Node removeLast(Node tail) {

        Node head = tail; // сохраним ссылку на "голову" списка
        int k = 0;

        // считаем сколько всего элементов в списке
        while (tail != null) {
            tail = tail.next;
            k++;
        }
        // System.out.println("k = " + k);

        // если имеет только 1 элемент
        if (k==1) {
            return null;
        }

        // идем до последнего элемента
        Node tmp = head;
        for (int i = 0; i < k - 2; i++) {
            tmp = tmp.next;
        }
        //System.out.println("tail.value = " + tmp.value);

        // добавляем к нему новый узел
        tmp.next = null;

        // вернем измененный список
        return head;

    }
	
	
}