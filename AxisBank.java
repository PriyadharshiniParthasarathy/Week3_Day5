package Week3_Day1;

public class AxisBank extends BankInfo {
	
	public void deposit()
	{
		System.out.println("deposit - 3000");
	}
	
	
public static void main(String[] args) {
AxisBank AB = new AxisBank();
System.out.println("Overridding");
System.out.println("****************");
AB.deposit();

}
}
