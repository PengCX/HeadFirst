package iterator.test;

/**
 * KFC�˵��࣬ʹ������洢�˵�ѡ��
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
		addMenuItem("���ȱ�", 10.23, false, "����ͼ�����");
		addMenuItem("ţ�Ɽ", 9.31, false, "�����ţ����");
		addMenuItem("�߲˱�", 3.23, true, "������߲����");
	}

	private void addMenuItem(String name, double prize, boolean isVegetarian,
			String description) {
		if (positon == MAX_MENUITEM_NUM) {
			System.out.println("�˵��������޷���ӣ���");
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
