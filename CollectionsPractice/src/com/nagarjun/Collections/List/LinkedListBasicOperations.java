package com.nagarjun.Collections.List;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListBasicOperations {

	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("organe");
		linkedList.add("apple");
		linkedList.add("banana");
		linkedList.add("grapes");
		System.out.println(linkedList);
		System.out.println("size of linked list "+linkedList.size());
		System.out.println("is linked list empty ? "+linkedList.isEmpty());
		System.out.println("does it contains grapes "+linkedList.contains("grapes"));
		
		System.out.println("list iterator contains");
		Iterator<String> itr = linkedList.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		
		LinkedList<String> list  = (LinkedList)linkedList.clone();
		System.out.println("after cloning "+list);
		
		System.out.println("Delete all the elements in the linked list");
		list.clear();
		System.out.println("after clearing "+list);
		
		LinkedList<String> list2 = new  LinkedList<String>();
		list2.add("grapes");
		//list2.add("random");
		System.out.println("Does linked list contains all the elements "+linkedList.containsAll(list2));
		
		List<String> list1 = linkedList.subList(0, 1);
		System.out.println("finding list "+list1);
		
		System.out.println("linked list reverse string ");
		Collections.reverse(linkedList);
		for(String lst: linkedList){
			System.out.println(lst);
		}
		
		System.out.println("linked list shuffle ");
		Collections.shuffle(linkedList);
		for(String lst: linkedList){
			System.out.println(lst);
		}
		
		System.out.println("swap  the values");
		Collections.swap(linkedList, 1, 2);
		System.out.println("after swapping "+linkedList );
		
		System.out.println("first element "+linkedList.element());
		System.out.println("first element "+linkedList.getFirst());
		System.out.println("first element "+linkedList.peek());
		System.out.println("first element "+linkedList.peekFirst());
		
		Iterator<String> itr1 = linkedList.descendingIterator();
		while(itr1.hasNext()){
			System.out.println(itr1.next());
		}
		
		
	}
}
