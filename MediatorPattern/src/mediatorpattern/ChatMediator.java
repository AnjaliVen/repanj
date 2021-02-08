package mediatorpattern;

import java.util.ArrayList;
import java.util.List;

public class ChatMediator implements IChatMediator {

	private static List<IUser> users;
	
	public ChatMediator()
	{
		users=new ArrayList<IUser>();
	}
	
	public static List<IUser> getUsers() {
		return users;
	}

	public static void setUsers(List<IUser> users) {
		ChatMediator.users = users;
	}

	@Override
	public void AddUser(IUser user) {
		users.add(user);
	}

	@Override
	public void SendMessage(String msg) {
		System.out.println("Chat mediator loading");
		for(IUser user:users)
		{
			user.RecieveMessage(msg);
		}
	}

}
