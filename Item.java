
public class Item {
	private String itemID;
	private String itemName;
	private double itemPrice;
	private double itemTotalPrice;
	private String itemDesc;
	private int itemStock;
	private int itemQuantity;
	private String itemImagePath;
	private boolean itemStatus = true;
	private double pay;
	
	public Item(String itemID, String itemName, double itemPrice, double itemTotalPrice,
			String itemDesc, int itemStock, int itemQuantity, String itemImagePath) {
		
		this.itemID = itemID;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.itemTotalPrice = itemTotalPrice;
		this.itemDesc = itemDesc;
		this.itemStock = itemStock;
		this.itemQuantity = itemQuantity;
		this.itemImagePath = itemImagePath;
	}
	
	//secondary constructor
	public Item(String itemName) {
		this.itemName = itemName;
		this.itemQuantity = itemQuantity;
	}

	public String getItemID() {
		return itemID;
	}
	public void setItemID(String itemID) {
		this.itemID = itemID;
	}
	
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	public double getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	
	public double getItemTotalPrice() {
		return itemTotalPrice;
	}
	public void setItemTotalPrice(double itemTotalPrice) {
		this.itemTotalPrice = itemTotalPrice;
	}
	
	public String getItemDesc() {
		return itemDesc;
	}
	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}
	
	public int getItemStock() {
		return itemStock;
	}
	public void setItemStock(int itemStock) {
		this.itemStock = itemStock;
	}
	
	public int getItemQuantity() {
		return itemQuantity;
	}
	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}
	public void incrementQuantity() {
		this.itemQuantity++;
	}
	public void decrementQuantity() {
		if(this.itemQuantity > 0) {
			this.itemQuantity--;
		}
	}
	
	public String getItemImagePath() {
		return itemImagePath;
	}
	public void setItemImagePath(String itemImagePath) {
		this.itemImagePath = itemImagePath;
	}
	
	public boolean isStatus() {
		return itemStatus;
	}
	public void setStatus(boolean itemStatus) {
		this.itemStatus = itemStatus;
	}
	
	public double calPizzaQuantity(int itemQuantity) {
		return getItemPrice()*itemQuantity;
	}
	
//	public double incrementPrice(double itemPrice) {
//		return itemPrice+=itemPrice;
//	}
	
	public double getPay() {
		return pay;
	}
	public void setPay(double pay) {
		this.pay = pay;
	}
	
	public double calLargePrice(double itemPrice) {
		return getItemPrice()*1.5;
	}
	public double calSmallPrice(double itemPrice) {
		return getItemPrice()*0.5;
	}
}
