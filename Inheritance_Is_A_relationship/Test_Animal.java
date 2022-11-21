package com.coreJava.oops.Inheritance_Is_A_relationship;

public class Test_Animal {
	
	public static void main(String[] args) {
		
		Animal a=new Animal();
		a.setcolor("black");
		a.setname("Tommy");
		a.settail((byte)1);
		//
		a.print();
		//
		System.out.println(a.getcolor());
		System.out.println(a.getname());
		
	}

}
