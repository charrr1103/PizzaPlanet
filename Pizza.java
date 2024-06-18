
public class Pizza extends Item{
	private String size;
	private String crust;
	private String sauce;
	//private String toppings;
	//private String imageFile;
	
	//parametized constructor
	public Pizza(String itemID, String itemName, double itemPrice, double itemTotalPrice,
			String itemDesc, int itemStock, int itemQuantity, String itemImagePath,
            String crust, String size, String sauce) {
		
		super(itemID, itemName, itemPrice, itemTotalPrice, 
				itemDesc, itemStock, itemQuantity, itemImagePath);
		this.crust = crust;
		this.size = size;
		this.sauce = sauce;
		//this.toppings = toppings;
	}
	
	//getters and setters
	
	public String getCrust() {
		return crust;
	}
	public void setCrust(String crust) {
		this.crust = crust;
	}
	
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	
	public String getSauce() {
		return sauce;
	}
	public void setSauce(String sauce) {
		this.sauce = sauce;
	}
	
//	public String getToppings() {
//		return toppings;
//	}
//	public void setToppings(String toppings) {
//		this.toppings = toppings;
//	}
	

	public double calPizzaStock(int itemStock) {
		return getItemPrice()*itemStock;
	}

	public double calPizzaQuantity(int itemQuantity) {
		return getItemPrice()*itemQuantity;
	}
}
