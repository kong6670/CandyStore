
public class Chocolate extends Cost
{
	Crepe crepe;
	 
 	public Chocolate(Crepe crepe) {
		this.crepe = crepe;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return crepe.getDescription()+",Chocolate";
	}
	public double cost(){
		return 10.00 + crepe.cost();
	}

}
