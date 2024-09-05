package com.oops_concept;

public class main {

	public static void main(String[] args) {
		
		car audi=new car();
		audi.setcolor("balck");
		audi.setdoors("4");
		audi.setModel("r8");
		audi.setYear("2023");
		
		
		System.out.println("car name is: "+"Audi");
		System.out.println("model name is "+":"+ audi.getModel() );
		System.out.println("colcor is "+":"+audi.getColor() );
		System.out.println("number of doors "+":"+audi.getdoors());
		System.out.println("model year "+":"+audi.getYear());

;
	}

}
