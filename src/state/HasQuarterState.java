package state;

/**
 * ��25��Ǯ״̬
 * 
 * @author pengcx
 * 
 */
public class HasQuarterState implements State {
	GumballMachine gumballMachine;

	public HasQuarterState(GumballMachine gumballMachine) {
		// ��״̬��ʵ������ʱ������Ҫ����GumballMachine��������Ϊ����
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		// ��һ���Դ˶���ǡ����״̬
		System.out.println("You can't insert another quarter");
	}

	@Override
	public void ejectQuarter() {
		// �˳��˿͵�25��Ǯ������״̬ת��ΪNoQuarterState
		System.out.println("Quarter returned");
		gumballMachine.setState(gumballMachine.getNoQuarterSate());
	}

	@Override
	public void tumCrank() {
		// ������ת����ʱ�����Ǿ͵���setSate()������������SoldState������Ϊ��������������״̬ת��ΪSoldState״̬�����SoldState����ȡ�ã�ÿ��״̬����һ��getter��������
		System.out.println("You turned...");
		gumballMachine.setState(gumballMachine.getSoldState());
	}

	@Override
	public void dispense() {
		// ����Ǵ�״̬����һ����ǡ����״̬
		System.out.println("No gumball dispensed");
	}

}
