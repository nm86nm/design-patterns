package structural.composite;

public class CheckComposite {

	public static void main(String[] args) {
		Shape triangle1 = new Triangle();
		Shape triangle2 = new Triangle();
		Shape circle = new Circle();
		
		Drawing drawing = new Drawing();
		drawing.add(triangle1);
		drawing.add(triangle2);
		drawing.add(circle);

		drawing.draw("Black");
		
		drawing.clear();
		
		drawing.add(triangle1);
		drawing.add(triangle2);		
		drawing.add(circle);	
		drawing.remove(triangle2);
		drawing.draw("Blue");
	}
}
