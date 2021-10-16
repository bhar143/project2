package glassignment2;

public class SearchSpecificPrice {
	  
	public void searchingPrice(double priceArray[],double key) {
		int left = 0;
		int right = priceArray.length - 1;
		int mid = (left + right)/2;
		
		while(left <= right) {
			if(key < priceArray[mid])
				right = mid - 1;
			else if(key > priceArray[mid]) {
				left = mid + 1;
				
			}else {
				System.out.println("Stock of value" + key +"is present");
				break;
			}
				
			mid = (left + right)/2;
			
		}
		if(left > right) {
			System.out.println("value is not present");
		}
		
	}

	
}
	 
			      





