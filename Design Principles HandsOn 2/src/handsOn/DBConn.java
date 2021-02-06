package handsOn;

public class DBConn {
	
	private static DBConn instance=new DBConn();
	
	private DBConn()
	{	
	}
	
	public static DBConn getInstance()
	{
		return instance;
	}
	public static void callerMethod()
	{
		DBConn dbconn=getInstance();
	}

}
