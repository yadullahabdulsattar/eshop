package View;

import java.util.ArrayList;
import java.util.List;

import Model.Inventory;
import Model.Kunde;
import Model.Order;

public class view {

	//show all the customer
	public String showCustomer(List<Kunde> newList) {
		StringBuilder sb = new StringBuilder();
		String tableFormat = "%-15s %-18s %-20s\n";
		sb.append(String.format(tableFormat, "ID", "Name", "Address"));
		for (Kunde customer : newList) {
		    //sb.append(String.format(tableFormat, "-----", "--------", "--------------------"));
		    sb.append(customer.toString()).append("\n");
		}
		return sb.toString();
	}
	
	//show the Inventory 
	public String showInventory(List<Inventory> newList) {
	    StringBuilder sb = new StringBuilder();
	    String tableFormat = "%-10s %-30s %-10s\n";
	    sb.append(String.format(tableFormat, "ID", "Product", "Quantity"));

	    for (Inventory inventory : newList) {
	        sb.append(inventory.toString()).append("\n");
	    }

	    return sb.toString();
	}

	//show the orders in the queue
	public String showOrder(List<Order> newList) {
		String tableFormat = "%-9s %-75s %-13s %-10s\n";
		StringBuilder sb = new StringBuilder();
		sb.append(String.format(tableFormat, "kunde", "Adresse", "gekauft","Anzahl"));
		//sb.append(String.format(tableFormat, "----------", "------------------------------", "----------","----------"));
		for(Order orders : newList) {
			//sb.append(String.format(tableFormat, "----------", "------------------------------", "----------","----------"));
			sb.append(orders.toString()).append("\n");
		}
		return sb.toString();
	}

	// show the costumer return stuff
	public void showRueckgabe(String Prod) {
		System.out.println("return Item:" + Prod);
	}



}


