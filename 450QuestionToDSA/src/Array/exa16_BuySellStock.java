package Array;

public class exa16_BuySellStock {
	public static int maxProfit(int []price){
		int maxCost=0,minPrice=price[0],cost=0;
		for(int i=0;i<price.length;i++) {
			
			minPrice=Math.min( minPrice, price[i] );
			
			cost=price[i]-minPrice;
			
			 maxCost = Math.max(maxCost, cost);
		}
		return maxCost;
	}

public static void main( String[] args )
	{
    
    int prices[] = {310,315,275,295,260,270,290,230,255,250};
    System.out.print( maxProfit(prices) );
		}
	}

