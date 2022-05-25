package orderlist;

public class Order {
	private String order_code;
	private int order_priority;

	public Order(String orderCode, int orderPriority) {
		this.order_code = orderCode;
		this.order_priority = orderPriority;
	}

	//method to set the Order priority(In this task helped in setToThree() method)
	public void setOrder_priority(int order_priority) {
		this.order_priority = order_priority;
	}

	public int getOrderPriority() {
		return order_priority;
	}

	public String getOrderCode() {
		return order_code;
	}

	public String toString() {
		return "Order_Priority: " + this.order_priority + " Order_code: " + this.order_code;
	}
}