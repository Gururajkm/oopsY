package com.coreJava.oops.encapsulation;

public class TestLaptop {
		public static void main(String[] args) {
			Laptop lp = new Laptop();
			lp.setbrandname("HP");
			lp.setmodelname("Victus 15");
			lp.setprice(60000);
			lp.setram((byte)8);
			lp.setos("Window 10");
			lp.setprocessor("i5");
			//or
			lp.print();
		//	or
			System.out.println(lp.getbrandname());
			System.out.println(lp.getmodelname());
			System.out.println(lp.getprice());
			System.out.println(lp.getram());
			System.out.println(lp.getos());
			System.out.println(lp.getprocessor());

	    }

	}