package state;

/**
 * �ǹ�������
 * 
 * @author pengcx
 * 
 */
public class GumballMachine {
	// ���е�״̬��������
	State soldOutState;
	State noQuarterSate;
	State hasQuarterState;
	State soldState;

	// ʵ������state
	State state = soldOutState;
	// ���countʵ��������¼�������ж��ٸ��ǹ�����ʼ��������û��װ�ǹ���
	int count = 0;

	public GumballMachine(int numberGumballs) {
		super();
		// Ϊÿһ��״̬����һ��ʵ��
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
		// ������Щ������������ʵ���ˣ�����ֻ��ί�е���ǰ��״̬
		state.insertQuarter();
	}

	public void ejectQuarter() {
		state.ejectQuarter();
	}

	public void turnCrank() {
		// ��ע�⣬���ǲ���ҪGumballMachine��׼��һ��dispense()�Ķ�����������Ϊ��ֻ��һ��������������Ϊ��ֻ��һ���ڲ��Ķ������û�������ֱ��Ҫ������ͷ��ǹ����������ǵ�״̬�����turnCrank()�����е���dispense()����
		state.tumCrank();
		state.dispense();
	}

	public void releaseBall() {
		// ��������ṩ��һ��releaseBall�ĸ����������ͷų��ǹ�������count��ʵ��������ֵ��1
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
