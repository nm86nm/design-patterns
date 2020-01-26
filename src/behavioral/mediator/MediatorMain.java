package behavioral.mediator;

public class MediatorMain {

	public static void main(String[] args) {
		
		ChatMediator chatMediator = new ChatMediatorImpl();
		
		User user1 = new UserImpl(chatMediator, "John");
		User user2 = new UserImpl(chatMediator, "Elisabeth");
		User user3 = new UserImpl(chatMediator, "Anna");
		User user4 = new UserImpl(chatMediator, "David");
		
		chatMediator.addUser(user1);
		chatMediator.addUser(user2);
		chatMediator.addUser(user3);
		chatMediator.addUser(user4);
		
		user1.send("Test Chat Mediator");
		user2.send("Hi Everyone");
	}
}
