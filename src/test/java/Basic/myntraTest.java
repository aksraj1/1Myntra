package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class myntraTest{
     @Test
	public void LaunchTest() {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.myntra.com/");
		String actualtitle=d.getTitle();
		System.out.println(actualtitle);
	}
}
