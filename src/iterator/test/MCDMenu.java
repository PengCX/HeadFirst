package iterator.test;

import java.util.ArrayList;

/**
 * 麦当劳菜单类
 * 
 * @author pengcx
 * 
 */
public class MCDMenu {
	private ArrayList<MenuItem> menuItems;

	public MCDMenu() {
		menuItems = new ArrayList<MenuItem>();
		addMenuItem("牛肉包", 4.23, false, "牛肉和包子");
		addMenuItem("猪肉包", 6.34, false, "猪肉和包子");
		addMenuItem("蔬菜包", 1.34, true, "蔬菜和包子");
	}

	private void addMenuItem(String name, double prize, boolean isVegetarian,
			String description) {
		MenuItem menuItem = new MenuItem(name, prize, isVegetarian, description);
		menuItems.add(menuItem);
	}
	
	public Iterator createIterator(){
		return new MCDIterator(menuItems);
	}
}
