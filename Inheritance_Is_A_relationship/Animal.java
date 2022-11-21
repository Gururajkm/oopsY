package com.coreJava.oops.Inheritance_Is_A_relationship;

public class Animal {

	   private  String name;
	   private String color;
	   private byte noOflegs;
	   private  byte tail;
	   
	   public Animal() {
		   System.out.println("Invoking Animal Constructor");
	   }
	   
	   public String getname() {
		   return name;
	   }
	   
	   public void setname(String name) {
		   this.name=name;
	   }
	   
	   public  String getcolor() {
		   return color;
	   }
	   
	   public void setcolor(String color) {
		   this.color=color;
	   }
	   
	   public byte getnoOflegs() {
		   return noOflegs;
	   }
	   
	   public void setnoOflegs(byte noOflegs) {
		   this.noOflegs=noOflegs;
	   }
	   
	   public byte gettail() {
		   return tail;
	   }
	   
	   public void settail(byte tail) {
		   this.tail=tail;
	   }

	public void print() {
		// TODO Auto-generated method stub
		
	}
	  
	 }


