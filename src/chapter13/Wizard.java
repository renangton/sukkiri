package chapter13;

public class Wizard {
	private int hp;
	private int mp;
	private String name;
	private Wand wand;

	public Wizard(int hp, int mp, String name, Wand wand) {
		super();
		this.hp = hp;
		this.mp = mp;
		this.name = name;
		this.wand = wand;
	}

	public int getHp() {
		return hp;
	}

	public int getMp() {
		return mp;
	}

	public String getName() {
		return name;
	}

	public Wand getWand() {
		return wand;
	}

	public void setHp(int hp) {
		if (hp < 0) {
			this.hp = 0;
		} else {
			this.hp = hp;
		}
	}

	public void setMp(int mp) {
		if (mp < 0) {
			throw new IllegalArgumentException("異常です");
		}
		this.mp = mp;
	}

	public void setName(String name) {
		if (name == null || name.length() < 3) {
			throw new IllegalArgumentException("異常です");
		}
		this.name = name;
	}

	public void setWand(Wand wand) {
		if (wand == null) {
			throw new IllegalArgumentException("異常です");
		}
		this.wand = wand;
	}

	public void heal(Hero h) {
		int basePoint = 10;
		int recovPoint = (int) (basePoint * this.getWand().getPower());
		h.setHp(h.getHp() + recovPoint);
		System.out.println(h.getName() + "のHPを" + recovPoint + "回復した！");

	}
}
