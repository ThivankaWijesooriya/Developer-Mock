package creational_patterns;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

interface Car{
	
	public String info();
	
}


class Bmw implements Car{
	
	public int id;
	
	public Bmw() {
		
		Random ran = new Random();
		id = ran.nextInt(1000);
		
	}

	@Override
	public String info() {
		
		String msg = String.format("The car is a %s with the id %d ", "Bmw",id);
		return msg;
		
	}
	
}


class Toyota implements Car{

	public int id;
	
	public Toyota() {
		
		Random ran = new Random();
		id = ran.nextInt(1000);
		
	}
	
	@Override
	public String info() {
		
		String msg = String.format("The car is a %s with the id %d ", "Toyota",id);
		return msg;
	}


	
	
}

enum carType{
	
	Toyota,Bmw
}

class CarFactory{
	
	public Car getCarInfo(carType type) {
		
		Car carobj = null;
		
		
		switch(type) {
		
		case Toyota: carobj = new Toyota();
		break;
		
		case Bmw : carobj = new Bmw();
		break;
		
		default : carobj = null;
		break;
		
		}
		
		return carobj;
		
	}

}


public class FactoryPattern2 {
	
	
	public static void main(String[] args) {
		
		CarFactory factory = new CarFactory();
		
		List<Car> carlist = new ArrayList<>();
		
		Car carobj1 = factory.getCarInfo(carType.Bmw);
		/*System.out.println(carobj1.info());*/ 
				
		Car carobj2 = factory.getCarInfo(carType.Toyota);
		/*System.out.println(carobj2.info());*/
		
		carlist.add(carobj1);
		carlist.add(carobj2);
		
		for(Car x: carlist) {
			
			System.out.println(x.info());
		}
	
		
	}

}
