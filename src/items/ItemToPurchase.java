package items;

public class ItemToPurchase {
	// private fields
	private String itemName;
	private int itemPrice;
	private int itemQuantity;

	// Default constructor
	public ItemToPurchase() {
		// initialize itemName to 'none'
		this.itemName = "none";
		// initialize itemPrice to 0
		this.itemPrice = 0;
		// initialize itemQuantity to 0
		this.itemQuantity = 0;
	}

	// accessor method to ItemName
	public String getName() {
		return itemName;
	}

	// accessor method to ItemName
	public void setName(String itemName) {
		this.itemName = itemName;
	}

	// accessor method to ItemPrice
	public int getPrice() {
		return itemPrice;
	}

	// mutator method to ItemPrice
	public void setPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}

	// accessor method to ItemQuantity
	public int getQuantity() {
		return itemQuantity;
	}

	// mutator method to ItemQuantity
	public void setQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}
}
