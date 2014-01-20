package state;

/**
 * 状态接口
 * 
 * @author pengcx
 * 
 */
public interface State {
	/**
	 * 投币
	 */
	void insertQuarter();

	/**
	 * 退币
	 */
	void ejectQuarter();

	/**
	 * 转动曲柄
	 */
	void tumCrank();

	/**
	 * 发放糖果
	 */
	void dispense();
}
