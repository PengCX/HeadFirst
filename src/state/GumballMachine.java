package state;

/**
 * 糖果机器类
 * 
 * @author pengcx
 * 
 */
public class GumballMachine {
	// 所有的状态都在这里
	State soldOutState;
	State noQuarterSate;
	State hasQuarterState;
	State soldState;

	// 实例变量state
	State state = soldOutState;
	// 这个count实例变量记录机器内有多少个糖果，开始机器中是没有装糖果的
	int count = 0;

	public GumballMachine(int numberGumballs) {
		super();
		// 为每一个状态创建一个实例
		soldState = new SoldState(this);
		soldOutState = new SoldState(this);
		noQuarterSate = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldOutState = new SoldState(this);

		this.count = numberGumballs;

		if (count > 0) {
			state = noQuarterSate;
		}
	}

	public State getSoldOutState() {
		return soldOutState;
	}

	public void setSoldOutState(State soldOutState) {
		this.soldOutState = soldOutState;
	}

	public State getNoQuarterSate() {
		return noQuarterSate;
	}

	public void setNoQuarterSate(State noQuarterSate) {
		this.noQuarterSate = noQuarterSate;
	}

	public State getHasQuarterState() {
		return hasQuarterState;
	}

	public void setHasQuarterState(State hasQuarterState) {
		this.hasQuarterState = hasQuarterState;
	}

	public State getSoldState() {
		return soldState;
	}

	public void setSoldState(State soldState) {
		this.soldState = soldState;
	}

	public void setState(State state) {
		this.state = state;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void insertQuarter() {
		// 现在这些动作都很容易实现了，我们只是委托到当前的状态
		state.insertQuarter();
	}

	public void ejectQuarter() {
		state.ejectQuarter();
	}

	public void turnCrank() {
		// 请注意，我们不需要GumballMachine中准备一个dispense()的动作方法，因为这只是一个动作方法，因为这只是一个内部的动作，用户不可以直接要求机器释放糖果。但是我们的状态对象的turnCrank()方法中调用dispense()方法
		state.tumCrank();
		state.dispense();
	}

	public void releaseBall() {
		// 这个机器提供了一个releaseBall的辅助方法来释放出糖果，并将count的实例变量的值减1
		System.out.println("A gumball comes rolling out the solt...");
		if (count != 0) {
			count = count - 1;
		}
	}

	public static void main(String[] args) {
		GumballMachine gumballMachine = new GumballMachine(5);
		System.out.println(gumballMachine);
		
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		System.out.println(gumballMachine);
		
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		
		System.out.println(gumballMachine);
	}
}
