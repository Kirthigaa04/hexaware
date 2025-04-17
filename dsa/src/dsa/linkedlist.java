package dsa;

import java.util.LinkedList;

public class linkedlist {
	public static void main (String[] args) {
		LinkedList l1=new LinkedList();
		l1.add(500);
		l1.add(300);
		l1.add(100);
		l1.add(200);
		System.out.println(l1);
		
		for(Object i:l1) {
			if(l1.contains(i));
			{
				l1.remove(i);
			}
			
		}
		System.out.println(l1);
		
		
		
	}

}
