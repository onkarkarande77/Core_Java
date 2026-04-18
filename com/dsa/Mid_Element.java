package com.dsa;

public class Mid_Element {
  
	public static int findMidElement(int arr[]) {
		   
		int midIndex=arr.length/2;
		int midElement=0;
		
		for(int i=0;i<=arr.length;i++) {
			
			if(i==midIndex) {
				midElement=arr[i];
			}
			
		}
		
		
		return midElement;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		int arr[]= {10,4,3,6,7};
		System.out.println(findMidElement(arr));
	}

}
