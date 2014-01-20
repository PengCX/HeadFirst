package iterator;

/**
 * Mel餐厅菜单类
 * 
 * @author pengcx
 * 
 */
public class DinerMenu {
	// 控制菜单长度
	private static final int MAX_ITEMS = 6;
	private int numberOfItems = 0;
	// Mel餐厅采用数组存储菜单
	private MenuItem[] menuItems;

	public DinerMenu() {
		menuItems = new MenuItem[MAX_ITEMS];
		addItem("Vegetarian BLT",
				"(Fakin')Bacon with lettuce & tomato on whole wheat", true,
				2.99);
		addItem("BLT", "Bacon with lettuce & tomato on whole wheat", false,
				2.99);
		addItem("Soup of the day",
				"Soup of the day,with a side of potato salad", false, 3.29);
		addItem("Hotdog",
				"A hot dog,with saurkraut,relish,onions,topped with cheese",
				false, 3.05);
	}

	public void addItem(String name, String description, boolean vegetarian,
			double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		// 检查数组是否已经超过它的长度限制
		if (numberOfItems >= MAX_ITEMS) {
			System.out.println("Sorry,menu is full! Can't add item to menu");
		} else {
			menuItems[numberOfItems] = menuItem;
			numberOfItems = numberOfItems + 1;
		}
	}

	public Iterator createIterator() {
		return new DinnerMenuIterator(menuItems);
	}
}
