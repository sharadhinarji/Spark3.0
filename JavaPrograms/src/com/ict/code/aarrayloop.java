package com.ict.code;

public class aarrayloop {
	public static void main(String[] args) {
		int arr[]= {10,43,44,75,56,34,57};
		int sum=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]%2!=0)//0dd
				sum=sum+arr[i];
		}
		System.out.println(sum);
		
		
		int ar[][]= {{1,2,3},{4,5,6},{7,8,9}};
		for(int j=0;j<=ar.length-1;j++) {
			for(int k=0;k<=ar.length-1;k++) {
			   System.out.println(ar[j][k]);	
		}
		}
		 

	}
}
