package iterator.test;

public class Test {

	public static void main(String[] args) {
		KFCMenu kfcMenu = new KFCMenu();
		MCDMenu mcdMenu = new MCDMenu();
		
		Waiter waiter = new Waiter(kfcMenu, mcdMenu);
		waiter.printMenu();
	}

}
