/**
 * 
 */

/**
 * @author indjt
 *
 */
public class ModelDuck extends Duck{

	ModelDuck(){
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}
	//flyBehavior = new FlyRocketPowered();
//	public void changeFlyBehavior(){
//		flyBehavior = new FlyRocketPowered();
//	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I'm a model duck");
	}
	
}
