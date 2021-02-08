package truyumdesignpattern;

public class CarClient {
	
	public static void main(String args[])
	{
		System.out.println(CarFactory.buildCar(CarType.LUXURY));
		System.out.println(CarFactory.buildCar(CarType.MINI));
		System.out.println(CarFactory.buildCar(CarType.MICRO));
	}

}
