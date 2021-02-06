package factory;

public abstract class Headlight {

protected final String _headLightModel;
	
	public Headlight(String headLightModel)
	{
		_headLightModel = headLightModel;
	}
	
	public String getHeadLightModel()
	{
		return _headLightModel;
	}
}
