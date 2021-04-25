package week3.day1;

public class AxisBank extends BankInfo {
	
	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		//super.deposit();
	System.out.println("Axis Bank deposit");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AxisBank obj1= new AxisBank();
obj1.deposit();
obj1.savings();
obj1.fixed();
	}

}
