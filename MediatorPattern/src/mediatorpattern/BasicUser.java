package mediatorpattern;

public class BasicUser implements IUser {

	private ChatMediator chatmediator;
	private String name;
	
	public BasicUser(String name)
	{
		chatmediator=new ChatMediator();
		this.name=name;
	}
	@Override
	public void RecieveMessage(String rmsg) {
		System.out.println(name+"-"+rmsg);
	}

	@Override
	public void SendMessage(String smsg) {
		
		chatmediator.SendMessage(smsg);
	}

}
