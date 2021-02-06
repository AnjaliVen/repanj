package factory;

public class AudiFactory extends Factory {

	@Override
	public Tire makeTire() {
		// TODO Auto-generated method stub
		return new AudiTire();
	}

	@Override
	public Headlight makeHeadLight() {
		// TODO Auto-generated method stub
		return new MercedesHeadlight();
	}

}
