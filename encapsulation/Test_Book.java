package com.coreJava.oops.encapsulation;

public class Test_Book {
	
		public static void main(String [] args) {
			Book b = new Book();
			
			b.setAuthors("NikunjSir");
			b.setName("xyz");
			b.setPages((short) 360);
			b.setPublisher("ABC");
			b.setYear(22);
			//
			b.print();
			//
			System.out.println(b.getAuthors());
			System.out.println(b.getName());
			
			
			
		}
		
	}





