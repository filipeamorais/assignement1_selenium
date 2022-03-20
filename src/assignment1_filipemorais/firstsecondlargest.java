package assignment1_filipemorais;

import java.util.Arrays;
import java.util.Scanner;

public class firstsecondlargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers in the array:");
		int arraySize = sc.nextInt();
		int []array=new int[arraySize];
		System.out.println("Please enter your numbers:");
		for (int i=0;i<arraySize;i++) {
			array[i] = sc.nextInt();
		}
		print2largest(array, arraySize);
	}
	
	public static void print2largest(int arr[],
            int arr_size)
	{
	int i, first, second;
	
	// There should be
	// at least two elements
	if (arr_size < 2)
	{
	System.out.printf(" Invalid Input ");
	return;
	}
	
	// Sort the array
	Arrays.sort(arr);
	
	// Start from second last element
	// as the largest element is at last
	for (i = arr_size - 2; i >= 0; i--)
	{
	// If the element is not
	// equal to largest element
	if (arr[i] != arr[arr_size - 1])
	{
	System.out.printf("The second largest " +
	          "element is %d\n", arr[i]);
	return;
	}
		}
		
		System.out.printf("There is no second " +
		      "largest element\n");
		}

}
