package iterator.test;

public class Waiter {
	private KFCMenu kfcMenu;
	private MCDMenu mcdMenu;
	
	public Waiter(KFCMenu kfcMenu, MCDMenu mcdMenu) {
		super();
		this.kfcMenu = kfcMenu;
		this.mcdMenu = mcdMenu;
	}
	
	public void printMenu(){
		Iterator kfcIterator = kfcMenu.createIterator();
		Iterator mcdIterator = mcdMenu.createIterator();
		
		printMenu(kfcIterator);
		printMenu(mcdIterator);
	}

	private void printMenu(Iterator iterator) {
		while(iterator.hasNext()){
			MenuItem menuItem = (MenuItem) iterator.next();
			System.out.println(menuItem.getName());
			System.out.println(menuItem.getPrize());
			System.out.println(menuItem.isVegetarian());
			System.out.println(menuItem.getDescription());
		}
	}
}
