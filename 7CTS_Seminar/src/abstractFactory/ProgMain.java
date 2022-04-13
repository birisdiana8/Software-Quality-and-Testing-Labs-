package abstractFactory;

public class ProgMain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//SIMPLE FACTORY
//		Factory factory = new Factory();
//		
//		IWeapon weapon = factory.getWeapon(300);
//		weapon.power();
		
		//FACTORY METHOD
//		IFactory factory = new CheapFactory();
//		IWeapon weapon = factory.getWeapon();
//		weapon.power();
		
		//ABSTRACT FACTORY
		//for family of objects ( weapons and costumes can all be cheap)
		
		
		Shop shop = new Shop(new MagicFactory());
		shop.createFamilyObjs();
	}

}
