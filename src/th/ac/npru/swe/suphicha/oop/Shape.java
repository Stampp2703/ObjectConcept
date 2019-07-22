package th.ac.npru.swe.suphicha.oop;

public abstract class Shape {
	String color;
    double area;
	
	abstract double getArea();
	
	public String toString() {
		return "color :"+color+ " \nArea :"+area;
	}
	public void setColor(String colorValue) {
		color = colorValue;
	}
}
