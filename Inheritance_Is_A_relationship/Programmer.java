package com.coreJava.oops.Inheritance_Is_A_relationship;

public class Programmer extends Emp {
	
	
		String name;
		String address;
		int salary;
		byte workinghours;
		
		Programmer(String name,String address, int salary,byte workinghours, long phoneno){
			this.name=name;
			this.address=address;
			this.salary=salary;
			this.workinghours=workinghours;
			this.phoneno=phoneno;
			
		}
		
		public static void main(String [] args) {
		     long  b = 800888254;
			Programmer a = new Programmer("Yuvraj" ,"Bangalore",35000,(byte)8,b);
			
			System.out.println(a.name);
			System.out.println(a.address);
			System.out.println(a.salary);
			System.out.println(a.workinghours);
			System.out.println(a.phoneno);
			
		}

	}


