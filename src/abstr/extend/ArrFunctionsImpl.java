package abstr.extend;

import abstr.interfeises.ArrayFunctions;

public class ArrFunctionsImpl implements ArrayFunctions {

	@Override
	public int getMax(int[] arr) {
		int posMax=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]>arr[posMax]) {
				posMax=i;
			}
		}
		return arr[posMax];
	}

	@Override
	public int getMin(int[] arr) {
		int posMin=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]<arr[posMin]) {
				posMin=i;
			}
		}
		return arr[posMin];
	}

	@Override
	public int getSumm(int[] arr) {
		int summ=0;
		for (int i = 0; i < arr.length; i++) {
			summ+=arr[i];
		}
		return summ;
	}

	@Override
	public int getAverage(int[] arr) {
		int average=0;
		int summ=0;
		for (int i = 0; i < arr.length; i++) {
			summ+=arr[i];
			average=summ/arr.length;
		}
		return average;
	}

	@Override
	public int sourtUp(int[] arr) {
		int temp;
		for (int border = 0; border < arr.length-1; border++) {
			for (int i = 0; i < arr.length-border-1; i++) {
				if (arr[i]>arr[i+1]) {
					temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
		}
		return 0;
	}

	@Override
	public int sourtUDown(int[] arr) {
		int temp;
		for (int border = 0; border < arr.length-1; border++) {
			for (int i = 0; i < arr.length-border-1; i++) {
				if (arr[i]<arr[i+1]) {
					temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
		}
		return 0;
	}

	

}
