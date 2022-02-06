package Week3_Day1;

public class Automation extends MultipleLangauge
{
String Value = "Testleaf";


	@Override
	public void Selenium() {
	final int Selenium_Fees = 20000;
	
		System.out.println("Selenium class is condected by"+this.Value);
		System.out.println("Selenium Fees" +Selenium_Fees );
		
	}

	@Override
	public void Java() {
		System.out.println("Java**********");
		
	}

	@Override
	public void python() {
	
		System.out.println("python**********");
	}
	
	public void Executionset() {
super.Executionset();
		
	}
	
public static void main(String[] args) {
		
		Automation auto = new Automation();
		auto.Java();
		auto.python();
		auto.ruby();
		auto.Selenium();
		auto.Executionset();
	

}
}
