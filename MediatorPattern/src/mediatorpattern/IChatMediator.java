package mediatorpattern;

public interface IChatMediator {

	public void AddUser(IUser user);
	public void SendMessage(String msg);
}
