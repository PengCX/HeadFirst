package iterator.test;

/**
 * ≤Àµ•œÓ¿‡
 * 
 * @author pengcx
 * 
 */
public class MenuItem {
	private String name;
	private double prize;
	private boolean isVegetarian;
	private String description;
	
	public MenuItem(String name, double prize, boolean isVegetarian,
			String description) {
		super();
		this.name = name;
		this.prize = prize;
		this.isVegetarian = isVegetarian;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrize() {
		return prize;
	}

	public void setPrize(double prize) {
		this.prize = prize;
	}

	public boolean isVegetarian() {
		return isVegetarian;
	}

	public void setVegetarian(boolean isVegetarian) {
		this.isVegetarian = isVegetarian;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
