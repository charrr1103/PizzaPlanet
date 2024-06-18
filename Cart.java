import java.util.ArrayList;
import java.util.List;

public class Cart {

	private List<Item> items;
	private double totalPrice;
	
	public Cart() {
		this.items = new ArrayList<>();
		this.totalPrice = 0;
	}
	
	public void addItem(Item item) {
		this.items.add(item);
		this.totalPrice += item.getItemPrice() * item.getItemQuantity();
	}
	
	public List<Item> getItems(){
		return items;
	}
	
	public void showCart() {
		System.out.println("Shopping cart: ");
		
		for(Item item : items) {
			System.out.println(item);
		}
		System.out.println("Total Price: $" + totalPrice);
	}
		
	public void clear() {
		items.clear();
		totalPrice = 0.0;
	}
	
}
