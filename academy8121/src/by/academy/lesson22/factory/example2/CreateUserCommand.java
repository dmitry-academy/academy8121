package by.academy.lesson22.factory.example2;

import java.util.Map;

public class CreateUserCommand implements Command {

	@Override
	public void execute(Map<String, Object> params) {
		System.out.println("Create User Command");
	}
}
