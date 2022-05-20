package SinglyLinkedList;

import SinglyLinkedList.*;

public class test {

	public static void main(String[] args) {
//		LinkedListClass l1 = new LinkedListClass();
//		LinkedListClass l2 = new LinkedListClass();
//		
//		for(int i=0; i<10; i = i+2) {
//			l1.insert(i+1);
//		}
//		for(int i=1; i<10; i = i+2) {
//			l2.insert(i+1);
//		}
//		System.out.println(l1);
//		System.out.println(l2);
//		LinkedListClass l3 = new LinkedListClass(LinkedListClass.sortedMerge(l1.head, l2.head));
//		LinkedListClass l3 = new LinkedListClass(LinkedListClass.inplaceSortedMerge(l1.head, l2.head))
//		System.out.println(l3);
		
//		LinkedListClass l = new LinkedListClass();
//		l.insert(5);
//		l.insert(3);
//		l.insert(89);
//		l.insert(3);
//		l.insert(51);
//		l.insert(15);
//		System.out.println("Merge Sort Test :");
//		System.out.println(l);
//		l.mergeSort();
//		System.out.println(l);
		
//		LinkedListClass ll = new LinkedListClass();
//		for(int i=0; i<10; i++) {
//			ll.insert(i+1);
//		}
//		System.out.println(ll);
//		ll.head = ll.reverseInGroup(ll.head,2);
//		System.out.println(ll);
		
//		LinkedListClass loopll = new LinkedListClass();
//		
//		for(int i=0; i<10; i++) {
//			loopll.insert(i*7);
//		}
//		System.out.println(loopll);
//		LinkedListClass.Node node = loopll.head;
//		LinkedListClass.Node loop = null;
//		for(int i=0; i<10; i++) {
//			if(i==5) {
//				loop = node; 
//			}
//			if(i==9) {
//				node.next = loop;
//			}
//			node = node.next;
//		}
//		loopll.detectRemoveLoopFloyd(loopll.head);
//		System.out.println(loopll);
//		System.out.println("success");
		
		
//		LinkedListClass l1 = new LinkedListClass();
//		LinkedListClass l2 = new LinkedListClass();
//		
//		for(int i=0; i<10; i = i+2) {
//			l1.insert(i);
//		}
//		for(int i=1; i<10; i = i+2) {
//			l2.insert(i);
//		}
//		System.out.println(l1);
//		System.out.println(l2);
//		LinkedListClass l3 = new LinkedListClass(LinkedListClass.addTwoNumbers(l1.head,l2.head));
//		System.out.println(l3);
		
		LinkedListClass ll = new LinkedListClass();
		for(int i=0; i<10; i++) {
			ll.insert(i+1);
		}
		System.out.println(ll);
		ll.rotate(2);
		System.out.println(ll);
	}


}
