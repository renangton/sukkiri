package chapter8;

public class Cleric {
	String name;
	int hp = 1000;
	final int MAX_HP = 50;
	int mp = 10;
	final int MAX_MP = 10;

	public void selfAid() {
		System.out.println(this.name + "は、セルフエイドを唱えた!!");
		this.mp -= 5;
		this.hp = this.MAX_HP;
		System.out.println(this.name + "は、HPを最大まで回復した!");
	}
	
	public int pray(int sec) {
		System.out.println(this.name + "は、" + sec + "秒間祈った!");
		int recover = new java.util.Random().nextInt(3) + sec;
		int recoverActual = Math.min(MAX_MP - this.mp, recover);
		this.mp += recoverActual;
		System.out.println("MPが" + recoverActual + "回復した!");
		return recoverActual;		
	}
}

