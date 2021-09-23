package by.academy.lesson22.assosiation;

class Association {
	public static void main(String[] args) {
		Bank bank = new Bank("Priorbank");
		Employee emp = new Employee("Петя");

		System.out.println(emp.getEmployeeName() + " is employee of " + bank.getBankName());
	}
}