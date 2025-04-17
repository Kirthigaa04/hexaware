package dsa;
import java.util.LinkedList;
import java.util.Scanner;



public class loop {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedList l1=new LinkedList();
		for(int i=0;i<5;i++) {
		 System.out.println("Enter the value");
		 l1.add(sc.nextInt());
		}
		System.out.println(l1);
		System.out.println("enter the specific value");
		int user=sc.nextInt();
		if(l1.contains(user)) {
			System.out.println("present"+l1.indexOf(user));
			
		}
		else {
			System.out.println("not present");
			
		}
		
		
		
		
	}
	

}
  