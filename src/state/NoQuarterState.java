package state;

public class NoQuarterState implements State {
	GumballMachine gumballMachine;

	public NoQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		// �������Ͷ����25��Ǯ�����Ǿʹ�ӡһ����Ϣ˵�����յ���25��Ǯ��Ȼ��ı������״̬��HasQuarterState
		System.out.println("You inserted a quarter");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}

	@Override
	public void ejectQuarter() {
		// ���û�и�Ǯ���Ͳ���Ҫ����Ǯ
		System.out.println("You haven't inserted a quarter");
	}

	@Override
	public void tumCrank() {
		// ���û�и�Ǯ���Ͳ���Ҫ���ǹ�
		System.out.println("You turned,but there's no quarter");
	}

	@Override
	public void dispense() {
		// ���û��Ǯ�����ǾͲ��ܷ����ǹ�
		System.out.println("You need to pay first");
	}

}
