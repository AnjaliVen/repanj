package observerPattern;

public class MessageSubscriberTwo implements Observer

{

@Override

public void update(Message m) {

System.out.println("MessageSubscriberTwo :: " + m.getMessageContent());

}

@Override
public void updateState(State s) {
	System.out.println("MessageSubscriberThree is in state " + s.getState());	
	
}

}