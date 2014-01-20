package iterator;

import java.util.ArrayList;

/**
 * 煎饼屋菜单
 * 
 * @author pengcx
 * 
 */
public class PancakeHouseMenu {
	// 使用ArrayList存储他的菜单项
	private ArrayList<MenuItem> menuItems;

	public PancakeHouseMenu() {
		menuItems = new ArrayList<MenuItem>();
		addItem("K&B's Pancake Breakfast",
				"Pancake with scrambled eggs and toast", true, 2.99);
		addItem("Regular Pancake Breakfast",
				"Pancakes with fried eggs,sausage", false, 2.99);
		addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries",
				true, 3.49);
		addItem("Waffles",
				"Waffles, with your choice of blueberries or starwberries",
				true, 3.59);
	}

	public void addItem(String name, String description, boolean vegetarian,
			double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
	}

	public Iterator createIterator() {
		return new PancakeHouseMenuIterator(menuItems);
	}
}
