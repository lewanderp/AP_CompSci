package intro_to_classes;

public class ChairTester {
	public static void main (String [] args) {
		ChairClass Chair = new ChairClass();
		ChairClass lowRider = new ChairClass(5);
		ChairClass HightChair = new ChairClass(20);
		ChairClass VolatileChair = new ChairClass(15);
		ChairClass NamedChair = new ChairClass(200, "Henry VIII");
		
		System.out.println("Chair: " + Chair.getHeight());
		Chair.sawLegs();
		System.out.println("Chair: " + Chair.getHeight());

		System.out.println("Low Rider: " + lowRider.getHeight());
		lowRider.sawLegs();
		System.out.println("Low Rdier: " + lowRider.getHeight());
	
		System.out.println("Hight Chair: " + HightChair.getHeight());
		HightChair.sawLegs();
		System.out.println("Hight Chair: " + HightChair.getHeight());
		
		System.out.println("Volatile Chair: " + VolatileChair.getHeight());
		System.out.println("Rips: " + VolatileChair.getRips());
		VolatileChair.sawLegs();
		System.out.println("Volatile Chair: " + VolatileChair.getHeight());
		System.out.println("Rips: " + VolatileChair.getRips());
		VolatileChair.mutator();
		System.out.println("Volatile Chair: " + VolatileChair.getHeight());
		System.out.println("Rips: " + VolatileChair.getRips());
		
		System.out.println("Named Chair's name is: " + NamedChair.getName());
		System.out.println("Named Chair: " + NamedChair.getHeight());
		System.out.println("Rips: " + NamedChair.getRips());
		NamedChair.sawLegs();
		System.out.println("Named Chair: " + NamedChair.getHeight());
		System.out.println("Rips: " + NamedChair.getRips());
		NamedChair.mutator();
		System.out.println("Named Chair: " + NamedChair.getHeight());
		System.out.println("Rips: " + NamedChair.getRips());
	}
}
