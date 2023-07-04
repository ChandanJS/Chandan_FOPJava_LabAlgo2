package com.greatlearning.servicestraveller;

public class CountMoneyNotes {
	public void MoneyCount(int notes[], int amount) {
		int[] noteCount=new int[notes.length];
		try {
			for (int i = 0; i < notes.length; i++) {
				if (amount >= notes[i]) {
					noteCount[i] = amount / notes[i];
					amount = amount - noteCount[i] * notes[i];
				} 
			}
			if (amount >0) {
				System.out.println("Highest denomination currency is not available !");
			} else {
				System.out.println("Minimum Nos. of notes required:::");
				for (int i = 0; i < notes.length; i++) {
					if (noteCount[i] != 0) {
						System.out.println(notes[i] + ":" + noteCount[i]);
					}
				}
			}
		} catch (ArithmeticException e) {
			System.out.println(e+ " 0 Denomination note is not available");
		}
	}
}
