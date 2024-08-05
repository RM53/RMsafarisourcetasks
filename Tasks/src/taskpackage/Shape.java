package taskpackage;

abstract class Shape {
	Double area;
	Double perimeter;
	
	public abstract void areaCalc();
	public abstract void perCalc();
	
	
}

class Circle extends Shape {
	
	Double radius;
	public Circle(Double x) {
		radius = x;
	}
	public void areaCalc() {
		area = 3.14 * radius;
		System.out.println(area);
	}
	
	public void perCalc() {
		perimeter = 2 * 3.14 * radius;
		System.out.println(perimeter);
	}
}

class Triangle extends Shape {
	
	Double sidea, sideb, sidec;
	
	public Triangle(Double x, Double y, Double z) {
		sidea = x;
		sideb = y;
		sidec = z;
	}
	public void areaCalc() {
		
		area = (sidea*sideb)/2;
		System.out.println(area);
	}
	
	public void perCalc() {
		
		perimeter = sidea+sideb+sidec;
		System.out.println(perimeter);
	}	
}

class Square extends Shape {
	Double sidea, sideb;
	
	public Square(Double x, Double y) {
		sidea=x;
		sideb=y;
	}
	public void areaCalc() {
		area = sidea*sideb;
		System.out.println(area);
		
	}
	
	public void perCalc() {
		perimeter = 2* (sidea+sideb);	
		System.out.println(perimeter);
	}
	
	public static void main(String[] args) {
		Square square1 = new Square(10.0, 5.0);
		square1.areaCalc();
		square1.perCalc();
			
		
	}
	
}

class Main{
	
}

