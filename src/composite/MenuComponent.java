package composite;

public abstract class MenuComponent {
	public void add(MenuComponent menuComponent) throws UnsupportedOperationException {
		throw new UnsupportedOperationException();
	}
	
	public void remove(MenuComponent menuComponent) throws UnsupportedOperationException{
		throw new UnsupportedOperationException();
	}
	
	public MenuComponent getChild(int i) throws UnsupportedOperationException{
		throw new UnsupportedOperationException();
	}
	
	public String getName() throws UnsupportedOperationException{
		throw new UnsupportedOperationException();
	}
	
	public String getDescription() throws UnsupportedOperationException{
		throw new UnsupportedOperationException();
	}
	
	public double getPrice() throws UnsupportedOperationException{
		throw new UnsupportedOperationException();
	}
	
	public boolean isVegetarian() throws UnsupportedOperationException{
		throw new UnsupportedOperationException();
	}
	
	public void print() throws UnsupportedOperationException{
		throw new UnsupportedOperationException();
	}
}
