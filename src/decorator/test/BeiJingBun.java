package decorator.test;

public class BeiJingBun extends Bun{

	@Override
	String getDescription() {
		return "北京包子";
	}

	@Override
	Double getPrize() {
		return 2.03;
	}

}
