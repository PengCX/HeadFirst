package decorator.test;

public class Beef extends Spices{
	Bun bun;
	
	public Beef(Bun bun) {
		super();
		this.bun = bun;
	}

	@Override
	String getDescription() {
		return "ЕЈИв" + bun.getDescription();
	}

	@Override
	Double getPrize() {
		return 2.0 + bun.getPrize();
	}

}
