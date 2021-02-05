package dsa450;

public class MoveNegativeNumbersToTheBeginingUsingPartitionProcessOfQuicksort {
	static void rearrange(int arr[], int n)
    {
        int j = 0, temp;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                if (i != j) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
    }
 
    // A utility function to print an array
    static void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
 
    // Driver code
    public static void main(String args[])
    {
        int arr[] = {2,1,-1,-2,6,8,9,-15,4,-3,8};
        int n = arr.length;
 
        rearrange(arr, n);
        printArray(arr, n);
    }
}

//Time Complexity = O(n^2)
//Space Complexity = O(1)
