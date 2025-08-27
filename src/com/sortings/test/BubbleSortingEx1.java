package com.sortings.test;

public class BubbleSortingEx1 {
	
	public static void main(String args[]) {
		int arr[] = {23,3,2,4,45,22,67};
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
				}
			}
		}
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[j]+" ");
			
		}
		System.out.println("\n"+arr[arr.length-2]);
	}

}
