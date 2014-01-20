package iterator.test;

public class KFCIterator implements Iterator{
	private MenuItem[] menuItems;
	private int position;
	
	public KFCIterator(MenuItem[] menuItems) {
		super();
		this.menuItems = menuItems;
	}

	@Override
	public boolean hasNext() {
		if(position > menuItems.length || menuItems[position] == null){
			return false;
		}else{
			return true;
		}
	}

	@Override
	public Object next() {
		MenuItem menuItem = menuItems[position];
		position = position + 1;
		return menuItem;
	}
	
}
