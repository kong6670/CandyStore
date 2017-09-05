
public class IceCream extends Cost{

	 Crepe crepe;
	 
	 	public IceCream(Crepe crepe) {
			this.crepe = crepe;
		}
		@Override
		public String getDescription() {
			// TODO Auto-generated method stub
			return crepe.getDescription()+"+IceCream";
		}
		public double cost(){
			return 10.00 + crepe.cost();
		}

}
