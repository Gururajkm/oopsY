package com.coreJava.oops.encapsulation;

public class Book {
	
		private String name;
		private String authors;
		private int year;
		private short pages;
		private String publisher;
		private String type;
		
		Book(){
		System.out.println("Invoking Book constructor");
		}
		
		public String getName() {
		  return name;
		}
		
		public void setName(String name) {
			this.name=name;
		}
		
		public String getAuthors() {
			return authors;
	     }
		
		public void setAuthors(String authors) {
			this.authors=authors;
		}
		 
		public int getYear() {
			return year;
		}
		
		public void setYear(int year) {
			this.year=year;
		}
		
		public short getPages() {
			return pages;
		}
		
		public void setPages(short pages) {
			this.pages=pages;
		}
		
		public String getPublisher() {
			return publisher;
		}
		
		public void setPublisher(String publisher) {
			this.publisher=publisher;
		}
		
		public String getType() {
			return type;
		}
		
		public void setType(String type) {
			this.type=type;
		}
		
		public void print() {
			System.out.println(name+"\t"+authors+"\t"+year+"\t"+pages+"\t"+publisher+"\t"+type);
		}

		
		}

		
	





