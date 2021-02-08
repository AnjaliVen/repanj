package mediatorpattern;

public class PremiumUser implements IUser {

	private ChatMediator chatmediator;
	private String name;
	
	public PremiumUser(String name)
	{
		chatmediator=new ChatMediator();
		this.name=name;
	}
	@Override
	public void RecieveMessage(String rmsg) {
		System.out.println(name+'-'+rmsg);
	}

	@Override
	public void SendMessage(String smsg) {

		chatmediator.SendMessage(smsg);
	}

}
