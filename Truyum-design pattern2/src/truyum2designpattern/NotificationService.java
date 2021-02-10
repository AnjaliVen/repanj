package truyum2designpattern;

import java.util.*;

public class NotificationService implements INotificationService {

	private List<INotificationObserver> list=new ArrayList<INotificationObserver>();
	@Override
	public void AddSubscriber(INotificationObserver addsub) {
		// TODO Auto-generated method stub
		list.add(addsub);
		for(INotificationObserver obj: list)
			System.out.println(obj.getName());
	}

	@Override
	public void RemoveSubscriber(INotificationObserver remsub) {
		// TODO Auto-generated method stub
		list.remove(remsub);
		for(INotificationObserver obj: list)
			System.out.println(obj.getName());
	}

	@Override
	public void NotifySubscriber() {
		// TODO Auto-generated method stub
		for(INotificationObserver obj: list)
			obj.OnServerDown();
	}

}
