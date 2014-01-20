package iterator;

/**
 * Mel�����˵���
 * 
 * @author pengcx
 * 
 */
public class DinerMenu {
	// ���Ʋ˵�����
	private static final int MAX_ITEMS = 6;
	private int numberOfItems = 0;
	// Mel������������洢�˵�
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
		// ��������Ƿ��Ѿ��������ĳ�������
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