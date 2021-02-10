package truyum2designpattern;

public class Main {

	public static void main(String[] args) {
		JohnObserver jo=new JohnObserver();
		SteveObserver so=new SteveObserver();
		NotificationService notser=new NotificationService();
		notser.AddSubscriber(jo);
		notser.AddSubscriber(so);
		notser.NotifySubscriber();
		notser.RemoveSubscriber(so);
	}
}
