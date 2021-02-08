package mediatorpattern;

public class User {
	
	public static void main(String[] args) {
		
		ChatMediator chatmediator=new ChatMediator();
		IUser user1= new BasicUser("ABC");
		IUser user2= new BasicUser("DEF");
		IUser user3= new PremiumUser("GHI");
		
		chatmediator.AddUser(user1);
		chatmediator.AddUser(user2);
		chatmediator.AddUser(user3);
		
		IUser user4=new PremiumUser("DEF");
		user4.SendMessage("HELLO Everyone!!");
	}
}
