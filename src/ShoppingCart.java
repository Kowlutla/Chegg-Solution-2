
public class ShoppingCart {
	
	//static variable
	static double discountAmount;
	
	//Method 1 to return discountAmount with 10 percentage discount
	public static double applyDiscount(double price)
	{
		double discount=price*0.1;//calculating amount for discount with 10 percentage
		return price-discount;//Subtract discount from price to get discountAmount
	}
	
	//Method 2 to return discountAmount with given percentage discount
	public static double applyDiscount(double price,double percentage)
	{
		double discount=price*percentage;//calculating amount for discount with given percentage
		return price-discount;//Subtract discount from price to get discountAmount
	}
	
	public static void main(String args[])
	{
		//finding discountAmount for default discount percentage to 10%
		discountAmount=ShoppingCart.applyDiscount(200);
		System.out.println("$100 is discounted to $"+discountAmount);
		
		//finding discountAmount for default discount percentage to given percentage
		discountAmount=ShoppingCart.applyDiscount(200,0.3);
		System.out.println("$100 is discounted to $"+discountAmount);
	}

}
