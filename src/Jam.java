
public class Jam extends Cost {
	 Crepe crepe;
	 
	 	public Jam(Crepe crepe) {
			this.crepe = crepe;
		}
		@Override
		public String getDescription() {
			// TODO Auto-generated method stub
			return crepe.getDescription()+",JamFrui";
		}
		public double cost(){
			return 5.00 + crepe.cost();
		}

}
