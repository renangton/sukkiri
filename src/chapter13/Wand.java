package chapter13;

public class Wand {
	private String name;
	private double power;

	public Wand(String name, double power) {
		this.name = name;
		this.power = power;
	}

	public String getName() {
		return name;
	}

	public double getPower() {
		return power;
	}

	public void setName(String name) {
		if (name == null || name.length() < 3) {
			throw new IllegalArgumentException("異常です");
		}
		this.name = name;
	}

	public void setPower(double power) {
		if (power >= 0.5 || 100 <= power) {
			throw new IllegalArgumentException("異常です");
		}
		this.power = power;
	}

}
