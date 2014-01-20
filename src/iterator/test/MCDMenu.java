package iterator.test;

import java.util.ArrayList;

/**
 * ���Ͳ˵���
 * 
 * @author pengcx
 * 
 */
public class MCDMenu {
	private ArrayList<MenuItem> menuItems;

	public MCDMenu() {
		menuItems = new ArrayList<MenuItem>();
		addMenuItem("ţ���", 4.23, false, "ţ��Ͱ���");
		addMenuItem("�����", 6.34, false, "����Ͱ���");
		addMenuItem("�߲˰�", 1.34, true, "�߲˺Ͱ���");
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
