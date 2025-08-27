package com.Object.test;


class Car{
	int numberplate;
	String carname;
Car(int numberplate,String carname){
this.numberplate=numberplate;
this.carname=carname;

}
public String toString() {

    return "Car The car number is " + numberplate + ", The car name is " + carname + "";
}
public class ToStringExample {
	public static void main(String args[]) {
		Car c= new Car(5,"TATA");
		System.out.println(c);
	
	}

}
}