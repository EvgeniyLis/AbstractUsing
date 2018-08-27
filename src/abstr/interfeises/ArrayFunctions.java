package abstr.interfeises;

import java.util.Scanner;

import javax.swing.text.html.CSS;

public interface ArrayFunctions {
	public int getMax(int[] arr);
	public int getMin(int[] arr);
	public int getSumm(int[] arr);
	public int getAverage(int[] arr);
	public int sourtUp(int[] arr);
	public int sourtUDown(int[] arr);
	default int[] createArray(){
		int[] sourceArray;
		int count;
		System.out.println("Enter count of elements of array");
		Scanner input=new Scanner(System.in);
		count=input.nextInt();
		sourceArray=new int[count];
		System.out.println("Enter "+count+" elements of array");
		for (int i = 0; i < sourceArray.length; i++) {
			sourceArray[i]=input.nextInt();
		}
		return sourceArray;
	}
	default void outArray(int[] arr){
		System.out.println("Result array is : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
