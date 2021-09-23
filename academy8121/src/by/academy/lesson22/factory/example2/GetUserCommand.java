package by.academy.lesson22.factory.example2;

import java.util.Map;

public class GetUserCommand implements Command {

	@Override
	public void execute(Map<String, Object> params) {
		System.out.println("Get User Command");
	}

}
