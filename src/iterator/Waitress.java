package iterator;

/**
 * 服务员类
 * 
 * @author pengcx
 * 
 */
public class Waitress {
	private PancakeHouseMenu pancakeHouseMenu;
	private DinerMenu dinerMenu;
	
	public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
		super();
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
	}
	
	public void printMenu(){
		Iterator pancakeIterator = pancakeHouseMenu.createIterator();
		Iterator dinnerIterator = dinerMenu.createIterator();
		
		System.out.println("------MENU BREAKFAST------");
		printMenu(pancakeIterator);
		System.out.println("------MENU LAUNCH------");
		printMenu(dinnerIterator);
	}

	private void printMenu(Iterator iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = (MenuItem) iterator.next();
			System.out.println(menuItem.getName() + ",");
			System.out.println(menuItem.getPrice() + ",");
			System.out.println(menuItem.getDescription());
		}
	}
}
