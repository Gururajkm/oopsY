package com.coreJava.oops.Inheritance_Has_A_relationship;

import com.coreJava.oops.Inheritance_Has_A_relationship.Bike;
import  com.coreJava.oops.Inheritance_Has_A_relationship.Engine;
public class Test_Bike {
	
	public static void main(String[] args) {
		

		Bike b=new Bike();
		b.setbrandname("R15");
		b.setmodelname("Xyz");
		
		
		Engine e=new Engine();
	    e.setbrandname("220P");
	    e.setcapacity(200);
	    
	   
	    e.print();	}
	

}
