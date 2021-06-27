package com.bridgelabz.functionutility;

import java.io.PrintWriter;
import java.util.Scanner;

public class Utility {
	Scanner scanner;

	public Utility() {
		scanner = new Scanner(System.in);
	}

	public Boolean getBoolean() {
		return scanner.nextBoolean();
	}

	public Double getDouble() {
		return scanner.nextDouble();
	}

	public int getIntvalue() {
		return scanner.nextInt();
	}

	// Array 2D

	public <T> void print2DArray(T[][] inputArray, int rows, int columns) {
		PrintWriter printwriter = new PrintWriter(System.out);
		// TODO Auto-generated method stub
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				printwriter.write(inputArray[i][j] + " ");
				printwriter.flush();
				// System.out.print(inputArray[i][j]+" ");
			}
			System.out.println();
		}
	}

	// Sum OF Three Integers Zero

	public void getTripletNumber(int[] integerArray, int numberOfIntegers) {
		int tripletCount = 0;
		for (int i = 0; i < numberOfIntegers - 2; i++) {
			for (int j = (i + 1); j < numberOfIntegers - 1; j++) {
				for (int k = (j + 1); k < numberOfIntegers; k++) {
					if (integerArray[i] + integerArray[j] + integerArray[k] == 0) {
						System.out.println("The following are triplet ::");
						System.out.println(integerArray[i] + " , " + integerArray[j] + " & " + integerArray[k]);
						tripletCount++;
					}
				}
			}

		}
		if (tripletCount == 0)
			System.out.println("No Such Triplets whose sum is 0");
		System.out.println("Number of triplets are ::" + tripletCount);
	}

}
