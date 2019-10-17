import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class TestingSel {
	

	public static void main(String[] args) throws AWTException  {
		
		System.setProperty("webdriver.chrome.driver", "D:\\WorkSpace\\SeleniumTwo\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement login=driver.findElement(By.id("email"));
		WebElement password=driver.findElement(By.id("pass"));
		
		Actions act = new Actions(driver);
		login.sendKeys("Raseem");
		act.doubleClick(login).perform();
		act.contextClick(login).perform();
		Robot r = new Robot();
		for(int i =1; i<=1;i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		act.contextClick(password).perform();
		for(int i =1; i<=2;i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		
		
		
		
		
		
	}


}
