package state;

/**
 * ״̬�ӿ�
 * 
 * @author pengcx
 * 
 */
public interface State {
	/**
	 * Ͷ��
	 */
	void insertQuarter();

	/**
	 * �˱�
	 */
	void ejectQuarter();

	/**
	 * ת������
	 */
	void tumCrank();

	/**
	 * �����ǹ�
	 */
	void dispense();
}
