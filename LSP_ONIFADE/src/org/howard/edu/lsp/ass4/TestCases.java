package org.howard.edu.lsp.ass4;

public class TestCases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntegerSet list1 = new IntegerSet();
		IntegerSet list2 = new IntegerSet();
		IntegerSet list3 = new IntegerSet();
		
		list1.add(1);
		list1.add(3);
		list1.add(7);
		list1.add(4);
		
		list2.add(2);
		list2.add(4);
		list2.add(6);
		list2.add(8);
		list2.add(10);
		
		list3.add(1);
		list3.add(3);
		list3.add(5);
		list3.add(7);
		
		System.out.println("length: " + list1.length());
		System.out.println("contains: " + list1.contains(7));
		
		list1.add(8);
		System.out.println("List 1 after I added 8: " + list1);
		
		list1.remove(4);
		System.out.println("List 1 after I removed 4: " + list1);
		
		System.out.println("List 1 is empty: " + list1.isEmpty());
		
		System.out.println("List 1 String Representation: " + list1.toString());
		
		try {
			list1.largest();
			System.out.println("List 1 largest value: " + list1.largest());
		}
		catch(IntegerSetException Message) {
			System.out.println(Message);
		}
		
		
		try {
			list1.smallest();
			System.out.println("List 1 smallest value: " + list1.smallest());
		}
		catch(IntegerSetException Message) {
			System.out.println(Message);
		}
		
		
		

	}

}
