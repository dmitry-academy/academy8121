package by.academy.lesson22.factory.example2;

import java.util.HashMap;
import java.util.Map;

public class CommandFactory {

	private static Map<CommandType, Command> factory = new HashMap<>();

	{
		factory.put(CommandType.UPDATE_USER, new UpdateUserCommand());
		factory.put(CommandType.DELETE_USER, new RemoveUserCommand());
		factory.put(CommandType.GET_USER, new GetUserCommand());
		factory.put(CommandType.CREATE_USER, new CreateUserCommand());
	}

	public Command getCommand(CommandType command) {
		return factory.get(command);
	}
}
