package com.Encapstultion.test;

class EncapstulationExample1 {
	
	private String name;
	private int rollno;
	
	public void setName(String name) {
		this.name=name;
		
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public static void main(String args[]) {
		EncapstulationExample1 en = new EncapstulationExample1();
		en.setName("Viany Danger");
		en.setRollno(41);
		System.out.println("The Hero Name Is = "+en.getName());
		System.out.println("The Hero Roll No Is = "+en.getRollno());
		
	}
	

}
