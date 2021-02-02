package dsa450;

public class MaxMinOfAnArrayUsingTournamentMethod {
	static class pair{
		int min;
		int max;
	}
	public static void main(String args[])
	{
		int arr[] = {1000,11,445,1,330,3000};
		int size = 6;
		pair minmax = getMinMax(arr,0,size-1);
		System.out.printf("\n Minimum element is %d", minmax.min);
		System.out.printf("\n Maximum element is %d", minmax.max);
	}
	static pair getMinMax(int arr[], int low , int high)
	{
		pair minmax = new pair();
		pair mml = new pair();
		pair mmr = new pair();
		int mid;
		
		if(low == high)
		{
			minmax.max = arr[low];
			minmax.min = arr[low];
			return minmax;
		}
		
		if(high==low+1) {
			if(arr[low]>arr[high]) {
				minmax.max = arr[low];
				minmax.min = arr[high];
			}
			else {
				minmax.max = arr[high];
				minmax.min = arr[low];
			}
			return minmax;
		}
		
		mid = (low+high)/2;
		mml = getMinMax(arr,low,mid);
		mmr = getMinMax(arr,mid+1,high);
		
		if(mml.min < mmr.min)
			minmax.min = mml.min;
		else
			minmax.min = mmr.min;
		
		if(mml.max > mmr.min)
			minmax.max = mml.max;
		else 
			minmax.max = mmr.max;
		
		return minmax;
		
	}
	
}

/*Time Complexity = o(n)
Algorithmic Paradigm : Divide and Conquer
T(n) = T(floor(n/2) + T(ceil(n/2)) + 2
T(n) = 2T(n/2) + 2 (If n = power of 2)
T(n) = 3n/2 - 2 

If n is not equal to power of 2, it does more than 3n/2 - 2 comparisons*/


