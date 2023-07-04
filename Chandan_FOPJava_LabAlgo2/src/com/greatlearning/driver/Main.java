package com.greatlearning.driver;
import java.util.Scanner;

import com.greatlearining.services.TranscationSearchImpl;


public class Main {
	static long targetNo;
	static int size=0;
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		TranscationSearchImpl tranSearchImpl = new TranscationSearchImpl();
		System.out.println("Array of Size");
		size=sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter Elements of the array");
		for (int i=0; i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the value of target to be achieve");
		 targetNo = sc.nextInt();	
		while (targetNo--!=0) {
			long target;
			target=targetNo; //here targeted value is reassign to target
			tranSearchImpl.search(arr, target);
			targetNo--;
			break; //use to break the continous iteration 
		}
	}

}
