package proc.dds.doublyListLib;

import proc.dds.DoublyNode;

public class DoublyLLUtils_Test {

	 public static void main(String[] args) {

	        /*
	                    +-----------+    +-----------+    +-----------+
	              null  |           |    |           |    |           |
	               ^    v           |    v           |    v           |
	          +----|------+    +----|------+    +----|------+    +----|------+
	  ref --->|0|prev|next---->|1|prev|next---->|2|prev|next---->|3|prev|next---->null
	          +-----------+    +-----------+    +-----------+    +-----------+
	        */

	        /*DoubleNode node3 = new DoubleNode(3, null, null);
	        DoubleNode node2 = new DoubleNode(2, null, node3);
	        DoubleNode node1 = new DoubleNode(1, null, node2);
	        DoubleNode node0 = new DoubleNode(0, null, node1);
	        node3.prev = node2;
	        node2.prev = node1;
	        node1.prev = node0;
	        DoubleNode ref = node0;*/

	        DoublyNode ref = generateDLl(0, 1, 2);
	        System.out.println(toString(ref));
	      //  System.out.println(toString(DoublyLLUtils.insertInPosition(ref, 0, 1000)));
	       // System.out.println(toString(DoublyLLUtils.addLast(ref, 5)));
	        System.out.println(toString(DoublyLLUtils.removeInPosition(ref, 2)));

	    }

	    public static DoublyNode generateDLl(int... values) {
	        int index = 0;
	        DoublyNode tail = new DoublyNode(values[index++], null, null);
	        DoublyNode head = tail;
	        while (index < values.length) {
	            head.next = new DoublyNode(values[index++], head, null);
	            head = head.next;
	        }
	        return tail;
	    }

	    public static String toString(DoublyNode tail) {
	        if (tail == null) {
	            return "null";
	        } else {
	            String result = "null";
	            while (tail != null) {
	                result += "<-" + (tail.prev == null ? "" : tail.prev.value + "-");
	                result += "(" + tail.value + ")";
	                result += (tail.next == null ? "" : "-" + tail.next.value) + "->";
	                tail = tail.next;
	            }
	            result += "null";
	            return result;
	        }
	    }

	    public static void test() {
	        // PREPARE
	        DoublyNode expected = generateDLl(1, 0);
	        String expectedAsStr = toString(expected);
	        // CALL
	        DoublyNode actual = DoublyLLUtils.addLast(generateDLl(1), 0);
	        // CHECK
	        String actualAsStr = toString(actual);
	        if (!actualAsStr.equals(expectedAsStr)) {
	            throw new AssertionError("actual = '" + actualAsStr + "' but expected = '" + expectedAsStr + "'");
	        }

	        System.out.print("OK");
	    }
	
	
	
	
	
	
}
