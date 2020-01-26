package behavioral.templatemethod;

public class TemplateMethodMain {
	public static void main(String[] args) {
		HouseTemplate houseType = new WoodenHouse();
		
		houseType.buildHouse();
		System.out.println("************");

		houseType = new GlassHouse();

		houseType.buildHouse();
	}
}
