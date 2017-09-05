
public class CalStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Crepe a1 = new ColdCrepe();
	a1 = new IceCream(a1);
	a1 = new WipCream(a1);
	System.out.println(a1.getDescription()+" "+a1.cost()+" Baht");
	
	Crepe a2 = new ColdCrepe();
	a2 = new Jam(a2);
	a2 = new Banana(a2);
	System.out.println(a2.getDescription()+" "+a2.cost()+" Baht");
	
	Crepe a3 = new OrdinaryCrepe();
	a3 = new Jam(a3);
	a3 = new FoiThong(a3);
	System.out.println(a3.getDescription()+" "+a3.cost()+" Baht");
		
	Crepe a4 = new OrdinaryCrepe();
	a4 = new Jam(a4);
	a4 = new Chocolate(a4);
	a4 = new Banana(a4);
	System.out.println(a4.getDescription()+" "+a4.cost()+" Baht");
	
	
	}

}
