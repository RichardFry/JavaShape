import java.util.Scanner;

/**
 * The Shape class defines a shape specified in double precision.
 *
 */
public class Shape {
	/**
	 * The shape's immutable width.
	 */
	private final double width;
	
	private int type;
	static final int SQUARE = 1;
	static final int CIRCLE = 2;
	static final int EQUILATERAL_TRIANGLE = 3;

	/**
	 * Constructs a new Shape with the specified width
	 * 
	 * @param type the type of the shape (SQUARE/CIRCLE/EQUILATERAL_TRIANGLE).
	 * @param width the width of the shape
	 */
	public Shape(int type, double width) {
		this.type = type;
		this.width = width;
	}
	
	/**
	 * Returns the width of this Shape in double precision.
	 * 
	 * @return the width of this Shape.
	 */
	public double getWidth() {
		return width;
	}
	
	/**
	 * Returns the area of this Shape in double precision.
	 * 
	 * @return the area of this Shape.
	 */
	public double getArea() {
		switch (type) {
		case SQUARE:
			return width * width;
		case CIRCLE:
			return Math.PI * (width/2) * (width/2);
		case EQUILATERAL_TRIANGLE:
			return (Math.sqrt(3)/4) * width * width;
		default:
			throw new RuntimeException("Unknown shape type encountered: " + type);
		}
	}

	/**
	 * Main method that tests the calculation of Shape properties.
	 * 
	 * @param args the unused command line arguments.
	 */
	public static void main(String[] args) {
		System.out.println("---------------------------------------------------------------------");
		System.out.println("ShapeCalc v1.0");
		System.out.println();
		System.out.println("Calculates and prints information for a user-supplied shape and width");
		System.out.println("---------------------------------------------------------------------");

		Scanner in = new Scanner(System.in);

		System.out.print("Do you want a square (1), circle (2), or equilateral triangle (3): ");
		int type = in.nextInt();
		
		System.out.print("Enter the shape's primary dimension (width, radius, or base): ");
		double width = in.nextDouble();
		
		Shape s = new Shape(type, width);

		System.out.println();
		System.out.println("Shape properties:");
		System.out.println("\tWidth: " + s.getWidth());
		System.out.println("\tArea: " + s.getArea());
	}
}
