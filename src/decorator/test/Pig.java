package decorator.test;

public class Pig extends Spices{
	Bun bun;
	
	public Pig(Bun bun) {
		super();
		this.bun = bun;
	}

	@Override
	String getDescription() {
		return "÷Ì»‚" + bun.getDescription();
	}

	@Override
	Double getPrize() {
		return 1.0 + bun.getPrize();
	}
	
}
