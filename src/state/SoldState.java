package state;

/**
 * 售出糖果
 * 
 * @author pengcx
 * 
 */
public class SoldState implements State {
	GumballMachine gumballMachine;

	public SoldState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		// 对此状态来说，这些状态都是不恰当的
		System.out.println("Please wait,we're already giving you a gumball");
	}

	@Override
	public void ejectQuarter() {
		// 对此状态来说，这些状态都是不恰当的
		System.out.println("Sorry,you already turned the crank");
	}

	@Override
	public void tumCrank() {
		System.out.println("Turning twice doesn't get you another gumball!");
	}

	@Override
	public void dispense() {
		// 真正的工作在这里
		gumballMachine.releaseBall();
		// 我们现在是SoldState状态，也就说顾客已经付钱了。所以我们首先需要发放糖果
		// 我们问机器糖果的剩余数据是多少，然后将状态转换到noQuarterState状态或者soldOutState
		if (gumballMachine.getCount() > 0) {
			gumballMachine.setState(gumballMachine.getNoQuarterSate());
		} else {
			System.out.println("Oops,out of gumballs");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
	}
}
