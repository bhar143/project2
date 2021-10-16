package glassignment2;


public class PriceComparsion {
	public void displayPricesAscendingOrder(double[] array) {
		System.out.println("Stock prices in ascending order are:");
		for(int i = 0; i < array.length; i++)
			System.out.println(array[i] + " ");
		System.out.println();
	}
	public void displayPricesDescendingOrder(double[] array) {
		for(int i = array.length - 1; i >= 0; i--)
			System.out.println(array[i] + " ");
		System.out.println();	
	}
}
    



