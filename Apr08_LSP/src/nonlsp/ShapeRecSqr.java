package nonlsp;
class Rectangle {
	protected int length;
	protected int breadth;
	
	public void setLength(int l) {
		length = l;
	}
	
	public void setBreadth(int b) {
		breadth = b;
	}
	
	public int calculateArea() {
		return length * breadth;
	}
}

class Square extends Rectangle {
	public void setLength(int s) {
		length = s;
		breadth = s;
	}
	
	public void setBreadth(int s) {
		length = s;
		breadth = s;
	}
	
}

public class ShapeRecSqr {

	public static void main(String[] args) {
		Rectangle rect = new Rectangle();
		rect.setLength(10);
		rect.setBreadth(20);
		System.out.println("Area = " + rect.calculateArea());
		
		Rectangle sqr = new Square();
		sqr.setLength(10);
		sqr.setBreadth(20);
		System.out.println("Area = " + sqr.calculateArea());
		
		/* Output:
		 * Area = 200
		 * Area = 400
		 */
		/* Now as per Liscov Substitution Principle, objects of superclass (or interface) should be replaceable by the 
		 * objects of its subclass (or implementors) without altering the desirable properties of a program. 
		 * We observe that in the second case, after doing set length and breadth, the output is based only on breadth
		 * which points that the logic is incorrect.
		 * 
		 * To fix this, we follow "Encapsulate what varies" - see lsp package code
		 */
	}

}
