package car.dependencies;

import car.interfaces.CarToolsService;

public class OpelToolsFactory implements CarToolsService {

	@Override
	public String getWheels() {
		return "Opel Wheels are all set up... Good job!";
	}

	@Override
	public String getEngine() {
		return "Opel Engines are set up... Good job!";
	}

	@Override
	public String getFirstAidKit() {
		return "Opel FirstAidKit set up... Good job!";
	}

	@Override
	public String getCarHammer() {
		return "Opel Car Hammer set up... Good job!";
	}

}
