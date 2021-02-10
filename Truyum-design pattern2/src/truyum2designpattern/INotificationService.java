package truyum2designpattern;

public interface INotificationService {
	
	public void AddSubscriber(INotificationObserver addsub);
	public void RemoveSubscriber(INotificationObserver remsub);
	public void NotifySubscriber();

}
