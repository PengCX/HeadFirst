package decorator.test;

public class Waiter {
	public static void main(String[] args){
		Bun bun = new TianJingBun();
		bun = new Pig(bun);
		System.out.println(bun.getDescription() + "," + bun.getPrize());
		
		Bun bun2 = new BeiJingBun();
		bun2 = new Beef(bun2);
		System.out.println(bun2.getDescription() + "," + bun2.getPrize());
	}
}
