package car.objects;

import car.interfaces.Car;
import car.interfaces.CarToolsService;

public class BMWCar implements Car {

	//create private field for CarTools for Dependency Injection
	private CarToolsService carTools;
	
	//using constructor-based dependency injection
	public BMWCar(CarToolsService theCarTools) {
		carTools = theCarTools;
	}
	
	@Override
	public String carWheel() {
		return carTools.getWheels();
	}

	@Override
	public String carEngine() {
		return carTools.getEngine();
	}

	@Override
	public String firstAidKit() {
		return carTools.getFirstAidKit();
	}

	@Override
	public String carHammer() {
		return carTools.getCarHammer();
	}

	@Override
	public String toString() {
		return "BMW [carWheel()=" + carWheel() 
		        + ", \ncarEngine()=" + carEngine() 
		        + ", \nfirstAidKit()="
				+ firstAidKit() + ", \ncarHammer()=" 
		        + carHammer() + ", \ngetClass()=" + getClass() 
		        + ", \nhashCode()="
				+ hashCode() + ", \ntoString()=" 
		        + super.toString() + "] " 
				+ " \nALL THE STUFF IS WELL DONE CONGRATS!!!";
	}
	
}
