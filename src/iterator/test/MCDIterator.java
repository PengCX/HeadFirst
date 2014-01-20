package iterator.test;

import java.util.ArrayList;

public class MCDIterator implements Iterator{
	private ArrayList<MenuItem> menuItems;
	private int position;

	public MCDIterator(ArrayList<MenuItem> menuItems) {
		super();
		this.menuItems = menuItems;
	}

	@Override
	public boolean hasNext() {
		if(position >= menuItems.size() || menuItems.get(position) == null){
			return false;
		}else{
			return true;
		}
	}

	@Override
	public Object next() {
		MenuItem menuItem = menuItems.get(position);
		position = position + 1;
		return menuItem;
	}
	
}
