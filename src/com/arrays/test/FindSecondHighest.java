package com.arrays.test;

public class FindSecondHighest {
	public static void main(String args[]) {
		int arr[] = {12,43,54,34,23,78};
		int temp;
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
			
		}

		System.out.print(arr[arr.length-2]+"");
	
	}

}
