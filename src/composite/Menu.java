package composite;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent {
	private ArrayList<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
	private String name;
	private String description;
	
	public Menu(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}
	
	public void add(MenuComponent menuComponent){
		menuComponents.add(menuComponent);
	}
	
	public void remove(MenuComponent menuComponent){
		menuComponents.remove(menuComponent);
	}
	
	public MenuComponent getChild(int i){
		return menuComponents.get(i);
	}
	
	public String getName(){
		return name;
	}
	
	public String getDescription(){
		return description;
	}
	
	public void print(){
		System.out.print("\n" + getName());
		System.out.print("," + getDescription());
		System.out.print("--------------------");
		
		Iterator<MenuComponent> iterator = menuComponents.iterator();
		while (iterator.hasNext()) {
			MenuComponent menuComponent = (MenuComponent)iterator.next();
			try {
				menuComponent.print();
			} catch (UnsupportedOperationException e) {
				e.printStackTrace();
			}	
		}
	}
}
