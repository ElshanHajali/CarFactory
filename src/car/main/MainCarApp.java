package car.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import car.objects.OpelCar;

public class MainCarApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext2.xml");
		
		//BMWCar theCar = context.getBean("myBMW", BMWCar.class);
		
		//System.out.println(theCar.carEngine());
		//System.out.println(theCar.toString());
		
		OpelCar theCar = context.getBean("myOpel", OpelCar.class);
		
		System.out.println(theCar.toString());
		
		context.close();
	}

}
