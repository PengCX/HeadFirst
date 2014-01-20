package state;

/**
 * �۳��ǹ�
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
		// �Դ�״̬��˵����Щ״̬���ǲ�ǡ����
		System.out.println("Please wait,we're already giving you a gumball");
	}

	@Override
	public void ejectQuarter() {
		// �Դ�״̬��˵����Щ״̬���ǲ�ǡ����
		System.out.println("Sorry,you already turned the crank");
	}

	@Override
	public void tumCrank() {
		System.out.println("Turning twice doesn't get you another gumball!");
	}

	@Override
	public void dispense() {
		// �����Ĺ���������
		gumballMachine.releaseBall();
		// ����������SoldState״̬��Ҳ��˵�˿��Ѿ���Ǯ�ˡ���������������Ҫ�����ǹ�
		// �����ʻ����ǹ���ʣ�������Ƕ��٣�Ȼ��״̬ת����noQuarterState״̬����soldOutState
		if (gumballMachine.getCount() > 0) {
			gumballMachine.setState(gumballMachine.getNoQuarterSate());
		} else {
			System.out.println("Oops,out of gumballs");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
	}
}
