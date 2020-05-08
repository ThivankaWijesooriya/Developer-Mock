package creational_patterns;


interface Fruit{
	
	public void colour();
	
}



class Mango implements Fruit{

	@Override
	public void colour() {
		
		System.out.println("Colour of a Mango is Green");
		
	}
	
	
}



class Apple implements Fruit{

	@Override
	public void colour() {
		
		System.out.println("Colour of an Apple is Red");
		
	}
	
	
}



class Banana implements Fruit{

	@Override
	public void colour() {
		
		System.out.println("Colour of a Banana is Yellow");
		
	}
	
	
}



class ShapeFactory{
	
	public Fruit getColour(String fruitName) {
		
		if(fruitName == null) {
			
			System.out.println("blah");
			return null;
		}
		
		else if(fruitName.equalsIgnoreCase("Mango")) {
			
			return new Mango();
		}
		
		else if(fruitName.equalsIgnoreCase("Apple")) {
			
			return new Apple();
		}
		
		else if(fruitName.equalsIgnoreCase("Banana")) {
			
			return new Banana();
		}
		
		return null;
		
	}
}


public class FactoryPattern {
	
	
	public static void main(String[] args) {
		
		
		ShapeFactory factory = new ShapeFactory();
		
		Fruit appleObj = factory.getColour("Apple");
		appleObj.colour();
		
		Fruit bananaObj = factory.getColour("Banana");
		bananaObj.colour();
		
		Fruit mangoObj = factory.getColour("Mango");
		mangoObj.colour();
		
	}

}
