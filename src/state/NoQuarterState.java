package state;

public class NoQuarterState implements State {
	GumballMachine gumballMachine;

	public NoQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		// 如果有人投入了25分钱，我们就打印一条消息说我们收到了25分钱，然后改变机器的状态到HasQuarterState
		System.out.println("You inserted a quarter");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}

	@Override
	public void ejectQuarter() {
		// 如果没有给钱，就不能要求退钱
		System.out.println("You haven't inserted a quarter");
	}

	@Override
	public void tumCrank() {
		// 如果没有给钱，就不能要求糖果
		System.out.println("You turned,but there's no quarter");
	}

	@Override
	public void dispense() {
		// 如果没有钱，我们就不能发放糖果
		System.out.println("You need to pay first");
	}

}
