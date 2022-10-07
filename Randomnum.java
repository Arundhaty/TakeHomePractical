package Homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Randomnum {

	public static void main(String[] args) {
		Random rn = new Random();
		int[] listofRandomNum = new int[500];

		for (int i = 0; i < 500; i++) {
			listofRandomNum[i] = rn.nextInt(500);
			System.out.print(listofRandomNum[i] + " ");
		}
		
		Arrays.sort(listofRandomNum);
		
		System.out.println();
		
		for (int i = 0; i < 500; i++) {
			System.out.print(listofRandomNum[i] + " ");
		}
		System.out.println();
		
		Scanner sn = new Scanner(System.in);
		System.out.println("Please provide nth smallest number");
		
		int n = sn.nextInt();
		System.out.println("The nth smallest number from the list of random numbers" + listofRandomNum[n-1]);

	}

}
