package by.academy.lesson22.factory.example2;

import java.util.Map;

public class UpdateUserCommand implements Command {

	@Override
	public void execute(Map<String, Object> params) {
		System.out.println("Update User Command");
	}
}
