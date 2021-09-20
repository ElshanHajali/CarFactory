package car.objects;

import car.interfaces.Car;
import car.interfaces.CarToolsService;

public class OpelCar implements Car{

	private CarToolsService carTools;
	
	//setter-based dependency injection
	public void setCarTools(CarToolsService theCarTools) {
		carTools=theCarTools;
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
		return "Opel [carWheel()=" + carWheel() 
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
