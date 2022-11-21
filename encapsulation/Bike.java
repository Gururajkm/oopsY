package com.coreJava.oops.encapsulation;

public class Bike {

		private String name;
		private int price;
		private char color;
		private byte noOfseats;
		private byte setnoOfseats;
		
		Bike(){
			System.out.println("About Car");
		}
		
		public String getname() {
			return name;
		}
		
		public void setname(String name) {
			this.name=name;
		}
		
		public int getprice() {
			return price;
		}
		
		public void setprice(int price) {
			this.price=price;
		}
		
		public char getcolor() {
			return color;
		}
		
		public void setcolor(char color) {
			this.color=color;
		}
		
		public byte getnoofseats() {
		     return noOfseats;
		}
		
		public void setnoOfseats(byte noOfseats) {
			this.noOfseats=noOfseats;
		}
		
		public void  print() {
			System.out.println(name +"\t"+price+"\t"+color+"\t"+noOfseats);
		}
		
	   public static void main(String [] args) {
		   Bike a = new Bike();
		   a.setname("R15");
		   a.setprice(1000000);
		   a.setcolor('B');
		//   byte d = 2;
		   a.setnoOfseats((byte)2);
		   a.print();
		 }
	}




