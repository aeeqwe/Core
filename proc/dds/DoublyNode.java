package proc.dds;

public class DoublyNode {
	public int value;
	public DoublyNode prev;
	public DoublyNode next;

	public DoublyNode(int value, DoublyNode prev, DoublyNode next) {
		this.value = value;
		this.prev = prev;
		this.next = next;

	}
}
