package th.ac.npru.swe.suphicha.oop;

public class Triangle extends Shape {
	int base;
	int height;
	
	Triangle(int baseValue,int heightValue){
		base = baseValue;
		height = heightValue;
		
	}
	@Override
	double getArea() {
		area = 0.5* base*height;
		return area;
	}

}
