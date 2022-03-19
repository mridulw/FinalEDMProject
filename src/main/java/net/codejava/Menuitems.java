package net.codejava;


public class Menuitems {
    private String itemName;
    private int itemPrice;
    private String itemDescription;
    private String restaurantID;

    public Menuitems()
    {
    }
    public Menuitems(String itemName,int itemPrice, String itemDescription, String restaurantID){
        this.itemName=itemName;
        this.itemPrice=itemPrice;
        this.itemDescription=itemDescription;
        this.restaurantID=restaurantID;
    }

	public String getItemName() {
		return this.itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getItemPrice() {
		return this.itemPrice;
	}

	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}

	public String getItemDescription() {
		return this.itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public String getRestaurantID() {
		return this.restaurantID;
	}

	public void setRestaurantID(String restaurantID) {
		this.restaurantID = restaurantID;
	}
 
}
