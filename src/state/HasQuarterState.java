package state;

/**
 * 有25分钱状态
 * 
 * @author pengcx
 * 
 */
public class HasQuarterState implements State {
	GumballMachine gumballMachine;

	public HasQuarterState(GumballMachine gumballMachine) {
		// 当状态被实例化的时候，我们要传入GumballMachine的引用作为参数
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		// 这一个对此对象不恰当的状态
		System.out.println("You can't insert another quarter");
	}

	@Override
	public void ejectQuarter() {
		// 退出顾客的25分钱，并将状态转换为NoQuarterState
		System.out.println("Quarter returned");
		gumballMachine.setState(gumballMachine.getNoQuarterSate());
	}

	@Override
	public void tumCrank() {
		// 当曲柄转动的时候，我们就调用setSate()方法，并传入SoldState对象作为参数，将机器的状态转换为SoldState状态。这个SoldState方法取得（每个状态都有一个getter方法）。
		System.out.println("You turned...");
		gumballMachine.setState(gumballMachine.getSoldState());
	}

	@Override
	public void dispense() {
		// 这个是此状态的另一个不恰当的状态
		System.out.println("No gumball dispensed");
	}

}
