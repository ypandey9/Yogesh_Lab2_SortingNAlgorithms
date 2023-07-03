package com.solution.statement1.lab2;

import java.util.Scanner;

public class AchivementChecker {

	public static void main(String[] args) {

		int transArr[];
		Scanner scn = new Scanner(System.in);
		System.out.println("enter the size of transaction array");
		transArr = new int[scn.nextInt()];
		System.out.println("enter the values of array");
		for (int i = 0; i < transArr.length; i++) {
			transArr[i] = scn.nextInt();
		}

		System.out.println("enter the total no of targets that needs to be achieved");

		int totalTargets = scn.nextInt();
		int count = 0;
		while (totalTargets != 0) {
			boolean isAchived = false;
			++count;
			long target = 0;
			System.out.println("enter the value of target " + count );
			target = scn.nextInt();
			long sum = 0;
			for (int i = 0; i < transArr.length; i++) {
				sum += transArr[i];

				if (sum >= target) {
					System.out.println("Target achieved after " + (i + 1) + " transactions");
					isAchived = true;
					break;
				}
			}
				if(!isAchived) {
					System.out.println("target is not achived");
				}
				--totalTargets;
			}
		scn.close();
		}
		
	}


