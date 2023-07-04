package com.greatlearning.drivertraveller;

import java.util.Scanner;

import com.greatlearning.servicestraveller.BubbleSort;
import com.greatlearning.servicestraveller.CountMoneyNotes;
//import com.greatlearning.servicestraveller.SelectionSortImpl;

public class Main {
	static int size;
	static int arr[]=new int[size];
	static int pay; 
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter the array size of currency denomination");
		size=sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter currency denomination value");
		for (int i=0; i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the amount you want to pay");
		pay = sc.nextInt();

		BubbleSort bubbleSort=new BubbleSort();
		bubbleSort.bubblesort(arr);
		CountMoneyNotes countMoney = new CountMoneyNotes();
		countMoney.MoneyCount(arr, pay);
		
	}

}
