package proc.dds.doublyListLib;

import proc.dds.DoublyNode;

public class DoublyLLUtilsRec {

	public static int length(DoublyNode tail)
	{
	    return (tail == null) ? 0 : 1 + length(tail.next);	
	}
	 	
 	
 	public static DoublyNode addToTail(DoublyNode tail, int elem)
 	{
 		if (tail == null) return new DoublyNode(elem, null, null);
 		else 
 		{
 			DoublyNode tmp = new DoublyNode(elem, null, tail);
 			
 			DoublyNode result = new DoublyNode(elem, null, tail);
 			result.next.prev = tmp;
 			return result;
 		}
 	}

 	
 	public static DoublyNode removeFromTail(DoublyNode tail)
 	{
 		if (tail == null) return null;
 	
 		tail = tail.next;
 		tail.prev = null;
 		return tail;
 	}
 	
 	
 	public static DoublyNode addToHead(DoublyNode tail, int elem)
 	{
 		if (tail == null) return new DoublyNode(elem, null, null);
 		
 		DoublyNode result = tail;
 		while(true)
 		{
 			if(tail.next == null)
 			{
 				tail.next = new DoublyNode(elem, tail, null);
 				break;
 			}
 			tail = tail.next;
 		}
 		return result;
 	}
 	
 	
 	public static DoublyNode removeFromHead(DoublyNode tail)
 	{
 		if (tail == null || tail.next == null) return null;
 		
 		DoublyNode result = tail;
 		while(true)
 		{
 			if(tail.next.next == null)
 			{
 				tail.next = null;
 				break;
 			}
 			tail = tail.next;
 		}
 		return result;
 	}
 	
 	
 	public static DoublyNode addAtIndex(DoublyNode tail, int index, int elem)
 	{
 		if(index < 0) index = 0;
 		if(index >= DoublyLLUtilsRec.length(tail)) return addToHead(tail, elem);
 		
 		if (index > 1) addAtIndex(tail.next, index - 1, elem);
 		if (index == 0) return addToTail(tail, elem);
 		if (index == 1) 
 		{	 				 				 	 		
 		tail.next = new DoublyNode(elem, tail, tail.next);
 		tail.next.next.prev = tail.next;
 		}
 		return tail;
 	}
 	
 	public static DoublyNode RemoveAtIndex(DoublyNode tail, int index)
 	{
 		if(tail == null) return null;
    	if(DoublyLLUtilsRec.length(tail) == 1) return null;
    	
 		if (index < 0) index = 0;
 		if (index >= DoublyLLUtilsRec.length(tail)) return removeFromHead(tail);
 		
 		if (index > 1) RemoveAtIndex(tail.next, index - 1);
 		if (index == 0) return removeFromTail(tail);
 		if (index == 1)
 		{
 			tail.next = tail.next.next;
 			tail.next.prev = tail;	
 		}	 			 		 		
 		return tail;	
 	}
	
	
	
	
}
