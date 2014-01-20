package iterator.test;

/**
 * KFC菜单类，使用数组存储菜单选项
 * 
 * @author pengcx
 * 
 */
public class KFCMenu {
	private static final int MAX_MENUITEM_NUM = 6;
	private MenuItem[] menuItems;
	private int positon;

	public KFCMenu() {
		menuItems = new MenuItem[MAX_MENUITEM_NUM];
		addMenuItem("鸡腿堡", 10.23, false, "面包和鸡腿肉");
		addMenuItem("牛肉堡", 9.31, false, "面包和牛排肉");
		addMenuItem("蔬菜堡", 3.23, true, "面包和蔬菜组合");
	}

	private void addMenuItem(String name, double prize, boolean isVegetarian,
			String description) {
		if (positon == MAX_MENUITEM_NUM) {
			System.out.println("菜单已满，无法添加！！");
		} else {
			menuItems[positon] = new MenuItem(name, prize, isVegetarian,
					description);
			positon = positon + 1;
		}
	}
	
	public Iterator createIterator(){
		return new KFCIterator(menuItems);
	}
}
