package glassignment2;

public class LinearSearch {
	public int countCompanieslnProfit(boolean array[]) {
		int count = 0;
		for(int i = 0; i < array.length; i++) {
			if(array[i] == true)
				count++;
		}
		return count;
	}

}
