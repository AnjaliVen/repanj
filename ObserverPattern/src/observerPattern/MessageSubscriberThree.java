package observerPattern;

public class MessageSubscriberThree implements Observer

{

@Override

public void update(Message m) {

System.out.println("MessageSubscriberThree :: " + m.getMessageContent());

}

@Override
public void updateState(State s) {
	System.out.println("MessageSubscriberTwo is in state " + s.getState());	
	
}

}