/**
 * 
 */

/**
 * @author indjt
 *
 */
public class MiniDuckSimulator {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(Math.round(8.01));
		//System.out.println(Math.abs(-8.0));
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}

}
