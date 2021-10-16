package glassignment2;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		int noOfCompanies;
		int option;
		System.out.println("Enter the no of companies ");
        Scanner sc = new Scanner(System.in);
		SortingPrices sp = new SortingPrices();
		SearchSpecificPrice ss = new SearchSpecificPrice();
		LinearSearch ls = new LinearSearch();
		PriceComparsion pc = new PriceComparsion();
		
		noOfCompanies = sc.nextInt();
		double priceArray[]  = new double[noOfCompanies];
		boolean profitArray[] = new boolean[noOfCompanies];
		  
		  //input from user and storing
		  for(int i = 0; i < noOfCompanies; i++) {
			  System.out.println("Enter current Stock price of company" + (i + 1));
			  priceArray[i] = sc.nextDouble();
			  System.out.println("Whether Company stock price rose today compare to yesterday");
			  profitArray[i] = sc.nextBoolean();
		  
		  do {
			  System.out.println();
			  System.out.println("----------------------------------");
			  System.out.println("Enter the operation that you want to perform-:");
			  System.out.println("press 1 to display  stock price in ascending order");
			  System.out.println("press 2 to display  stock price in descending order");
			  System.out.println("press 3 to display total no of companies for which stock price rose today");
			  System.out.println("press 4 to display total no of companies for which stock price declined today");
			  System.out.println("press 5 to search a specific Stock price");
			  System.out.println("press 0 to exit");
			  System.out.println("------------------------------------");
			 
			  
			  option = sc.nextInt();
			  switch(option) {
			  case 0:
				  option = 0;
				  break;
			  case 1:{
				  pc.displayPricesAscendingOrder(priceArray);
				  }
			  break;
			  
			   case 2:{
				  pc.displayPricesDescendingOrder(priceArray);
				 }
			   break;
			   
			  case 3:{
				  System.out.println("Total no of compines whose stock price rose today:" + ls.countCompanieslnProfit(profitArray));
			  }
			  break;
			  
			  case 4:{
				  System.out.println("Total no of companies whose stock price declined today:" + (noOfCompanies - ls.countCompanieslnProfit(profitArray)));
			  }
			  break;
			  case 5:{
				  double key;
				  System.out.println("Enter the key value");
				  key = sc.nextDouble();
		        ss.searchingPrice(priceArray,  key);
			  }
			  break;
			  default:
				  System.out.println("Enter valid option");
			
		  }
		  } while(option!=0);
			  System.out.println("Exited Successfully");
               sc.close();

			}
		
	}
}


