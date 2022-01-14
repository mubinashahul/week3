package Assign_Abstraction;

public class Automation extends MultipleLangauge implements Language, TestTool {

	public void Selenium() {
		System.out.println("Selenium is a testing tool");
	}

	public void Java() {
		
		System.out.println("Java is programming language");
	}

	@Override
	void ruby() {
		System.out.println("Ruby");
	}

			public static void main(String[] args) {
				Automation automation = new Automation();
				automation.Java();
				automation.Selenium();
				automation.python();
				automation.ruby();
		
	}

		
	
}
