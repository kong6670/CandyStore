
public class FoiThong extends Cost {
	Crepe crepe; 
	public FoiThong(Crepe crepe){
		this.crepe = crepe;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return crepe.getDescription()+"+FoiThong";
	}
	public double cost(){
		return 5.00 + crepe.cost();
	}

}
