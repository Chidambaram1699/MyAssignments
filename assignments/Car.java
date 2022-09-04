package day1.assignments;

public class Car {
	public void applyBreak() {
		System.out.println("Break is applied");
	}
	public void soundHorn() {
		System.out.println("SOund horn");
	}
	public static void main(String[] args) {
		Car obj=new Car();
		obj.applyBreak();
		obj.soundHorn();
	}

}
