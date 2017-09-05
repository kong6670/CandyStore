
public class WipCream extends Cost {

	 Crepe crepe;
	 
	 	public WipCream(Crepe crepe) {
			this.crepe = crepe;
		}
		@Override
		public String getDescription() {
			// TODO Auto-generated method stub
			return crepe.getDescription()+"WipCrem";
		}
		public double cost(){
			return 5.00 + crepe.cost();
		}

}