package day2;

public class AssignQ4 {

	public static void main(String[] args) {
		Employee employee=new
				CommissionEmployee(121, "amit", 2.1, 2000000);
		System.out.println(((CommissionEmployee) employee).getPayment());

	}

}
