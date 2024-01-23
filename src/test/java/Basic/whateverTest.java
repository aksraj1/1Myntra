package Basic;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class whateverTest {
	@Test
	public void launchTest() throws InterruptedException {
	ChromeDriver d= new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://www.tirabeauty.com/");
	Thread.sleep(2000);
	 WebElement f = d.findElement(By.id("search"));
	 f.sendKeys("perfume");
	 f.sendKeys(Keys.ENTER);
	 Thread.sleep(2000);
	 d.findElement(By.xpath("//img[@alt='Ajmal | Ajmal Silver Shade Eau De Perfume (100ml)']")).click();
	// d.findElement(By.xpath("(//img[@class='fy__img image'])[1]")).click();
	 Thread.sleep(2000);
	 Set<String> a=d.getWindowHandles();
		for (String s : a) {
			d.switchTo().window(s);
		}
		d.findElement(By.cssSelector("button[class='custom-btn primary lg no-tap-highlight']")).click();
		Thread.sleep(2000);
		d.findElement(By.cssSelector("img[alt='cart icon']")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("(//button[@class='operator'])[2]")).click();

		
	}
}


