package car.dependencies;

import car.interfaces.CarToolsService;

//create dependency
public class BMWToolsFactory implements CarToolsService {

	@Override
	public String getWheels() {
		return "BMW Wheels are all set up... Good job!";
	}

	@Override
	public String getEngine() {
		return "BMW Engines are set up... Good job!";
	}

	@Override
	public String getFirstAidKit() {
		return "BMW FirstAidKit set up... Good job!";
	}

	@Override
	public String getCarHammer() {
		return "BMW Car Hammer set up... Good job!";
	}

}
