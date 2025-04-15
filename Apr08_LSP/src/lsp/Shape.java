package lsp;

interface ShapeParent {
	int calculateArea();
}

class Rectangle implements ShapeParent{
	private int length;
	private int breadth;
	
	Rectangle(int l, int b) {
		length = l;
		breadth = b;
	}
	
	@Override
	public int calculateArea() {
		return length * breadth;
	}
	
}

class Square implements ShapeParent{
	private int side;
	
	Square(int l) {
		side = l;
	}
	
	@Override
	public int calculateArea() {
		return side * side;
	}
	
}

public class Shape {

	public static void main(String[] args) {
		ShapeParent rect = new Rectangle(10,20);
		System.out.println("Area = " + rect.calculateArea());
		
		ShapeParent sqr = new Square(5);
		System.out.println("Area = " + sqr.calculateArea());
		
		/* 
		 * Area = 200
		 * Area = 25
		 */
		
		//This code satisfies LSP since even if we replace ShapeParent with Rectangle or Square then also everything works fine.
	}

}
