package com.solution.statement2.lab2;
import java.util.Scanner;
public class Transaction {

	public static void main(String[] args) {
		int size;
		int notes[];
		DenominationCount dc=new DenominationCount();
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the size of currency denomination");
		size=scn.nextInt();
		notes=new int[size];
		System.out.println("Enter the currecy denomination values");
		for(int i=0;i<size;i++)
			notes[i]=scn.nextInt();
		System.out.println("Enter the amount you want to pay");
		int payableAmount=scn.nextInt();
		MergeSort sortObj =new MergeSort();
		sortObj.mrgSrt(notes, 0, notes.length-1);
		System.out.println("Your payment approach in order to give min no of notes will be");
		dc.notesCountImplementation(notes, payableAmount);
		scn.close();
		

	}

}
