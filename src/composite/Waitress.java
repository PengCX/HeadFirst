package composite;

public class Waitress {
	private MenuComponent allMenus;

	public Waitress(MenuComponent allMenus) {
		super();
		this.allMenus = allMenus;
	}
	
	public void printMenu(){
		try {
			allMenus.print();
		} catch (UnsupportedOperationException e) {
			e.printStackTrace();
		}
	}
}
