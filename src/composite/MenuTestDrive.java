package composite;

public class MenuTestDrive {
	public static void main(String[] args) {
		MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU",
				"Breakfase");
		MenuComponent dinerMenu = new Menu("DINNER MENU", "Lunch");
		MenuComponent cafeMenu = new Menu("CAFE MENU", "cafe menu");
		MenuComponent dessertMenu = new Menu("DESSERT MENU",
				"Dessert of course!");

		MenuComponent allMenus = new Menu("ALL MENUS", "All menus combinded");
		try {
			allMenus.add(pancakeHouseMenu);
			allMenus.add(dinerMenu);
			allMenus.add(cafeMenu);
			dinerMenu
					.add(new MenuItem(
							"Pasta",
							"Spaghetti with Marinara Sauce, and a slice of sourdough bread",
							true, 3.89));
			dinerMenu.add(dessertMenu);

			dessertMenu
					.add(new MenuItem(
							"Apple Pie",
							"Apple pie with a flakey cruse,topped with vanilla ice cream",
							true, 1.59));
		} catch (UnsupportedOperationException e) {
			e.printStackTrace();
		}
		Waitress waitress = new Waitress(allMenus);
		waitress.printMenu();
	}
}
