package com.greatlearining.services;
//import com.greatlearning.driver.*;
public class TranscationSearchImpl {
	
	public void search(int arr[], long target) {
		long sum=0;
		boolean flag=true;
		for (int i = 0; i < arr.length; i++) { 
			sum += arr[i];
			if (sum >= target) {
				System.out.println("Nos. of  "+(i + 1) + " transactions required");
				flag = false;
				break;
			}

		}
		if (flag) {
			System.out.println(" Given target is not achieved ");
		}
	}
}
