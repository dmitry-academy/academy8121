package by.academy.lesson22.factory.example2;

import java.util.Map;

public class RemoveUserCommand implements Command {

	@Override
	public void execute(Map<String, Object> params) {
		System.out.println("Remove User Command");
	}

}
