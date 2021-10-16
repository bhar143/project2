package glassignment2;

public class SortingPrices {
	
	
	 public void merge(double arr[], int left, int mid,int right) {
		  int n1 = mid - left + 1;
		  int n2 = right - mid;
		  
		  double leftArray[] = new double[n1];
		  double rightArray[] = new double[n2];
		  
		  for(int i =0; i < n1; ++i)
			  leftArray[i] = arr[left + i];
	       for(int j = 0;  j < n2; ++j)
	    	   rightArray[j] = arr[right + j];

	//merge the temoprary
		int i = 0;
		int j = 0;
		//index of merged sub-array
		int k = left;
		while(i < n1 && j < n2) {
			if(leftArray[i] <= rightArray[j]) {
				arr[k] = leftArray[i];
				i++;
				}else {
				arr[k] = rightArray[j];
				j++;
			}
			k++;
		}
		//copy remaining elements
		while(i < n1) {
			arr[k] = leftArray[i];
			k++;
			i++;
		}
		while(j < n2) {
			arr[k] = rightArray[j];
			k++;
			j++;
		}
		
		}
	 //Main function sorts array[left...right]using merge()
	 public void sort(double arr[],int left,int right) {
		 
		if(left < right) {
			//find the mid point
			int mid = (left + right)/2;
			
			//sort first and second halves
			sort(arr,left,mid);
			sort(arr,mid + 1,right);
		}
		
	}
	}


