
public class Banana extends Cost {
	 Crepe crepe;
	 
	 	public Banana(Crepe crepe) {
			this.crepe = crepe;
		}
		@Override
		public String getDescription() {
			// TODO Auto-generated method stub
			return crepe.getDescription()+"Banana";
		}
		public double cost(){
			return 10.00 + crepe.cost();
		}

}

