package SinglyLinkedList;

import java.util.HashMap;

public class LinkedListClass {
	Node head;
	Node last;
	static class Node{
		int data;
		Node next;
		
		Node(int data){this.data = data;next = null;}
	}
	LinkedListClass(){
		head = null;
		last = null;
	}
	LinkedListClass(Node h){
		this.head = h;
		last = null;
	}
	void insert(int data) {
		if(head==null) {
			head = new Node(data);
			last = head;
		}else {
			last.next = new Node(data);
			last = last.next;
		}
	}
	void insert(int index,int data) {
		if(index==0) {insertToFront(data);return;}
		int count=0;
		Node node = head;
		Node prev = head;
		while(count!=index) {
			prev = node;
			node = node.next;
			count++;
		}
		prev.next = new Node(data);
		prev.next.next = node;
	}
	void insertToEnd(int data) {
		if(head==null) {
			head = new Node(data);
			last = head;
		}else {
			last.next = new Node(data);
			last = last.next;
		}
	}
	void insertToFront(int data) {
		Node node = new Node(data);
		node.next = head;
		head = node;
	}
	void deleteFirst(int key) {
		Node node = head;
		Node prev = null;
		Node temp = null;
		while(node.data != key){
			prev = node;
			node = node.next;
		}
		if(prev==null) {
			temp = head;
			head = head.next;
		}else {
			temp = prev;
			prev.next = node.next;
		}
	}
	int length() {
		int count=0;
		Node node = head;
		while(node!=null) {
			count++;
			node = node.next;
		}
		return count;		
	}
	//swap two nodes
	void swapNode(int key1,int key2) {
		Node prev1 = null;
		Node prev2 = null;
		Node node1 = head;
		Node node2 = head;
		Node temp = null;
		
		while(node1.data!=key1 && node1!=null) {
			prev1 = node1;
			node1 = node1.next;
		}
		while(node2.data!=key2 && node2!=null) {
			prev2 = node2;
			node2 = node2.next;
		}
		if(prev1!=null && prev2!=null) {
			prev1.next = node2;
			prev2.next = node1;
		}else if(prev1==null) {
			head = node2;
			prev2.next = node1;
		}
		else if(prev2==null) {
			prev1.next = node2;
			head = node1;
		}
		temp = node1.next;
		node1.next = node2.next;
		node2.next = temp;
		
	}
	//reverse a linked list
	void reverse() {
		Node prev = null;
		Node curr = head;
		Node next = head.next;
		
		while(curr!=null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;
	}
	
	//sorted merge
	public LinkedListClass sortedMerge(LinkedListClass l) {return new LinkedListClass(sortedMerge(l.head,this.head));}
	public static Node sortedMerge(Node node1,Node node2){
		Node res = null;
		Node curr = null;
		while(node1!=null&&node2!=null) {
			if(node1.data<node2.data) {
				if(res==null) {
					res = new Node(node1.data);
					curr = res;
				}else{
					curr.next = new Node(node1.data);
					curr = curr.next;
				}
				node1 = node1.next;				
			}else {
				if(res==null) {
					res = new Node(node2.data);
					curr = res;
				}else {
					curr.next = new Node(node2.data);
					curr = curr.next;
				}
				node2 = node2.next;
			}
		}
		while(node1!=null) {
			curr.next = new Node(node1.data);
			curr = curr.next;
			node1 = node1.next;
		}
		while(node2!=null) {
			curr.next = new Node(node2.data);
			curr = curr.next;
			node2 = node2.next;
		}
		return res;
	}
	//inplace sorted merge
	public static Node inplaceSortedMerge(Node l1,Node l2){
		if(l1==null) {return l2;}
		if(l2==null) {return l1;}
		Node res = null;
		Node curr = null;
		while(l1!=null&&l2!=null) {
			if(l1.data<l2.data) {
				if(res==null) {
					res = l1;
					curr = res;
				}else{
					curr.next = l1;
					curr = curr.next;
				}
				l1 = l1.next;				
			}else {
				if(res==null) {
					res = l2;
					curr = res;
				}else {
					curr.next = l2;
					curr = curr.next;
				}
				l2 = l2.next;
			}
		}
		while(l1!=null) {
			curr.next = l1;
			curr = curr.next;
			l1 = l1.next;
		}
		while(l2!=null) {
			curr.next = l2;
			curr = curr.next;
			l2 = l2.next;
		}
		return res;
	}
	//merge Sort
	public Node mergeSort() {return this.head = mergeSort(this.head);}
	public Node mergeSort(Node root) {
		if(root.next==null) {return root;}
		Node prev = null;
		Node slow = root;
		Node fast = root;
		while(fast != null && fast.next!=null) {
			prev = slow;
			slow = slow.next;
			fast = fast.next.next;
		}
		
		prev.next = null;
		Node l1 = mergeSort(root);
		Node l2 = mergeSort(slow);
		return inplaceSortedMerge(l1,l2);
	}
	//reverse in groups
	public Node reverseInGroup(Node node,int k) {
		if(node==null) {return null;}
		Node prev = null;
		Node curr = node;
		Node next = curr.next;
		
		int count = 0;
		while(count<k && curr != null) {
			 next = curr.next;
			 curr.next = prev;
			 prev = curr;
			 curr = next;
			 count++;
		}
		node.next = reverseInGroup(curr,k);
		return prev;
	}
	//Detect and Remove Loop in Linked List
	public void detectRemoveLoop(Node root) {
		HashMap<Node,Integer> map = new HashMap<Node,Integer>();
		
		map.put(root, 1);
		while(root!=null) {
			if(map.get(root.next)!=null){
				root.next = null;
				return;
			}
			map.put(root.next, 1);
			root = root.next;
		}
	}
	//Detect and Remove the loop using floyd's algo
	public void removeLoop(Node loop, Node head) {
		int loopNodes=1;
		Node l1 = loop;
		Node l2 = loop;
		while(l1.next != l2) {
			l1 = l1.next;
			loopNodes++;
		}
		l1 = head;
		l2 = head;
		for(int i=0; i<loopNodes; i++) {
			l2 = l2.next;
		}
		while(l1!=l2) {
			l1 = l1.next;
			l2 = l2.next;
		}
		while(l1.next!=l2) {
			l1 = l2.next;
		}
		l1.next = null;		
	}
	public void detectRemoveLoopFloyd(Node head) {
		Node slow = this.head;
		Node fast = this.head;
		while(slow!=null && fast!=null && fast.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
			
			if(slow==fast) {
				removeLoop(slow,this.head);
				return;
			}
		}
	}
	//Add two numbers represented by the LinkedLists
	public static Node addTwoNumbers(Node node1,Node node2) {
		Node ans = null;
		Node curr = null;
		int carry = 0;
		int res = 0;
		while(node1 != null && node2 != null) {
			res = (node1.data+node2.data+carry)%10;
			carry = (node1.data+node2.data+carry)/10;
			if(ans==null) {
				ans = new Node(res);
				curr = ans;
			}else {
				curr.next = new Node(res);
				curr = curr.next;
			}
			node1 = node1.next;
			node2 = node2.next;
		}
		while(node1!=null) {
			res = (node1.data+carry)/10;
			carry = (node1.data+carry)%10;
			if(ans==null) {
				ans = new Node(res);
				curr = ans;
			}else {
				curr.next = new Node(res);
				curr = curr.next;
			}
			node1 = node1.next;
		}
		while(node2!=null) {
			res = (node2.data+carry)/10;
			carry = (node2.data+carry)%10;
			if(ans==null) {
				ans = new Node(res);
				curr = ans;
			}else {
				curr.next = new Node(res);
				curr = curr.next;
			}
			node2 = node2.next;
		}
		if(carry!=0) {
			curr.next = new Node(carry);
		}
		return ans;
	}
	//Rotate the Linked List
	public void rotate(int k) {
		if(k==0) {return;}
		Node ll = this.head;
		Node curr = this.head;
		Node prev = null;
		int total_nodes = 0;
		while(curr!=null) {
			total_nodes++;
			prev = curr;
			curr=curr.next;
		}
		prev.next = ll;
		k = total_nodes-k;
		while((k--)>0) {
			ll = ll.next;
		}
		curr = ll;
		while((total_nodes--)>0) {
			prev = curr;
			curr=curr.next;
		}
		prev.next = null;
		this.head = ll;
	}
	//
	public static void print(Node node){
		while(node!=null) {
			System.out.print(node.data+" ");
			node = node.next;			
		}System.out.println();
	}
	void print(){
		Node node=head;
		while(node!=null) {
			System.out.print(node.data+" ");
			node = node.next;			
		}System.out.println();
	}
	public String toString(){
		Node node=head;
		StringBuilder ans = new StringBuilder("");
		while(node!=null){
			ans.append(Integer.toString(node.data) + " -> ");
			node = node.next;
		}
		ans.append("null");
		return ans.toString();
	}
}
