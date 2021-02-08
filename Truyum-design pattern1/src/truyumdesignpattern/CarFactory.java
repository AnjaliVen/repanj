package truyumdesignpattern;

public class CarFactory
{
  private CarFactory() {
    //Prevent instantiation
  }
 
  public static Car buildCar(CarType type)
  {
    Car car = null;
    Location location = Location.INDIA; //Read location property somewhere from configuration
    //Use location specific car factory
    switch(location)
    {
      case USA:
        car = USACarFactory.buildCar(type);
        break;
      case INDIA:
        car = IndiaCarFactory.buildCar(type);
        break;
      default:
        car = DefaultCarFactory.buildCar(type);
    }
  return car;
  }
}