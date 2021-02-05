package dsa450;

public class MoveNegativeNumbersMyMethod {		
		public static void main(String[] args) {
			int arr[] = {2,1,-1,-2,6,8,9,-15,4,-3,8};
			arrayshift(arr,arr.length);
			for(int i = 0; i < arr.length; i++)
			System.out.print(arr[i]+" ");
		}
		
		static void arrayshift(int arr[],int n)
		{
			//To iterate all array elements
			for(int i = 0; i < n; i++)
			{
				//To find a positive number
				if(arr[i]>0)
				{
					//To iterate over all array elements
					for(int j = i+1; j<n; j++)
					{
						//To find a negative number
						if(arr[j]<0)
						{
							//To replace the positive number with the negative number and shift all elements in between
							int temp = arr[j];
							while(j>i)
							{
								arr[j] = arr[j-1];
								j--;								
							}
							arr[j] = temp;
							break;
						}
					}
				}
				
			}
		}
	}

		
