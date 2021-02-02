package dsa450;

public class MaxMinUsingCompairInPairs {
	static class pair{
		int min;
		int max;
	}
	static pair getMinMax(int arr[], int n) {
		pair minmax = new pair();
		int i;
		
		if(n%2 == 0)
		{
			if(arr[0] > arr[1])
			{
				minmax.max = arr[0];
				minmax.min = arr[1];
			}
			else
			{
				minmax.min = arr[0];
				minmax.max = arr[1];
			}
			i = 2;
		}
		else
		{
			minmax.min = arr[0];
			minmax.max = arr[0];
			i = 1;
		}
		
		while(i<n-1)
		{
			if(arr[i]>arr[i+1])
			{
				if(arr[i]>minmax.max) {
					minmax.max = arr[i];
				}
				if(arr[i+1]< minmax.min) {
					minmax.min = arr[i+1];
				}
			}
			else
			{
				if(arr[i+1]>minmax.max)
				{
					minmax.max = arr[i+1];
				}
				if(arr[i]<minmax.min) {
					minmax.min = arr[i];
				}
			}
			i += 2;
			
		}
		return minmax;
	}
	
	public static void main(String args[])
	{
		int arr[] = {1000,11,445,1,330,3000};
		int size = 6;
		
		pair minmax = getMinMax(arr,size);
		
		System.out.printf("\n Minimum element is %d", minmax.min);
		System.out.printf("\n Maximum element is %d", minmax.max);
		
	}
}



//Time Complexity :- O(n)

//If n is odd :- 3*(n-1)/2

//if is even :- 1 initial comparison for initializing max and 3(n-22)/2 comparisons for rest of elements = 1 + 3(n-2)/2 = 3n/2 - 2
