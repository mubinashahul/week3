package Assign_Override;

public class AxisBank extends BankInfo {
	public void deposit() {
		int axisDeposit = 10000;
		System.out.println("The minimum deposit amount in Axis bank is "+axisDeposit);
	}

	public static void main(String[] args) {
		
		AxisBank axis = new AxisBank();
		axis.saving();
		axis.fixed();
		axis.deposit(); //Override
		BankInfo bankinfo = new BankInfo();
		bankinfo.deposit();//Parent
		
	}

}
