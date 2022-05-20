package Collections;

import java.util.*;
class comp implements Comparator<Integer>{
	@Override
	public int compare(Integer o1, Integer o2) {
		if(o1<o2) {
			return 1;
		}else if(o1>o2) {
			return -1;
		}
		return 0;
	}
}

public class ArrayListClass {
	public enum DayOfWeek {
	    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
	}
	public static void main(String[] args) {
//		List<Integer> al = new ArrayList<>();
//		List<Integer> v = new Vector<>();
//		List<Integer> ll = new LinkedList<>();
//		
//		
//		for(int i=0; i<10; i++) {
//			al.add(i+1);
//			v.add(i+1);
//			ll.add(i+1);
//		}
//		System.out.println(al);
//		System.out.println(v);
//		System.out.println(ll);
//		System.out.println("---------------------------------");
//		Stack<Integer> st = new Stack<>();
//		for(int i=0; i<10; i++) {
//			st.push(2*i);
//		}
//		System.out.println(st);
//		st.pop();
//		st.pop();
//		System.out.println(st.peek());
//		System.out.println(st);
//		Iterator<Integer> it = st.iterator();
//		while(it.hasNext()) {
//			System.out.print(it.next()+" ");
//		}System.out.println();
//		System.out.println("---------------------------------");
//		System.out.println("-------------QUEUES--------------");
//		Queue<Integer> pq = new PriorityQueue<Integer>(5,new comp());
//		pq.add(65);
//		pq.add(5);
//		pq.add(885);
//		pq.add(34);
//		pq.add(885);
//		pq.add(34);
//		pq.add(12);
//		pq.add(69);
////		System.out.println("Top Element : "+pq.poll());
//		System.out.println(pq);
//		System.out.println();
//		System.out.println("---------------------------------");
////		
//		ArrayDeque<Integer> dq = new ArrayDeque<Integer>();
//		dq.add(1);
//		dq.add(53);
//		dq.add(75);
//		dq.add(133);
//		dq.add(31);
//		System.out.println(dq);
//		dq.clear();
//		
//		dq.addFirst(100);
//		dq.addFirst(99);
//		dq.addLast(1);
//		dq.addLast(8);
//		
//		System.out.println(dq);	
//		System.out.println();
//		System.out.println("---------------------------------");
//		System.out.println("-------------SETS----------------");
//		HashSet<Integer> hs = new HashSet<Integer>();
//		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
//		TreeSet<Integer> ths = new TreeSet<Integer>();
//		hs.add(1);
//		hs.add(53);
//		hs.add(53);
//		hs.add(133);
//		hs.add(31);
//		hs.add(133);
//		System.out.println(hs);
//
//		lhs.add(1);
//		lhs.add(53);
//		lhs.add(53);
//		lhs.add(133);
//		lhs.add(31);
//		lhs.add(133);
//		System.out.println(lhs);
//
//		ths.add(1);
//		ths.add(53);
//		ths.add(53);
//		ths.add(133);
//		ths.add(31);
//		ths.add(133);
//		System.out.println(ths);
//
//		System.out.println("---------------------------------");
		System.out.println("-------------MAPS----------------");
		
//		Map<Integer,Integer> hm = new HashMap<> ();
		
		Map<DayOfWeek,Integer> em = new EnumMap<> (DayOfWeek.class);
//		Map<Integer,Integer> tm = new TreeMap<> ();
		
//		hm.put(1, 3);
//		hm.put(2, 43);
//		hm.put(3, 3);
//		hm.put(4, 43);
//		hm.put(5, 3);
//		hm.put(6, 43);
//		hm.put(7, 3);
//		hm.put(8, 43);
//		System.out.println(hm);
//		System.out.println();
		
		em.put(DayOfWeek.MONDAY, 3);
		em.put(DayOfWeek.SATURDAY, 43);
		em.put(DayOfWeek.THURSDAY, 3);
		em.put(DayOfWeek.FRIDAY, 43);
		em.put(DayOfWeek.WEDNESDAY, 3);
		em.put(DayOfWeek.WEDNESDAY, 43);
		em.put(DayOfWeek.SUNDAY, 3);
		em.put(DayOfWeek.TUESDAY, 43);
		System.out.println(em);
		System.out.println();
		
//		tm.put(1, 3);
//		tm.put(2, 43);
//		tm.put(3, 3);
//		tm.put(4, 43);
//		tm.put(5, 3);
//		tm.put(6, 43);
//		tm.put(7, 3);
//		tm.put(8, 43);
//		System.out.println(hm);
//		System.out.println();
		
		
	}

}
