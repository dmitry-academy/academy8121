package by.academy.lesson22.factory.example2;

public class CommandFactoryDemo {

	public static void main(String[] args) {
		CommandFactory factory = new CommandFactory();

		for (CommandType commandType : CommandType.values()) {
			Command command = factory.getCommand(commandType);
//			System.out.println(command);
			command.execute(null);
		}
	}

}
