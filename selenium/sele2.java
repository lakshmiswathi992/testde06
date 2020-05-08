
package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sele2 {

	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Elcot\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	        WebDriver driver=new ChromeDriver();
	        driver.get("http://demo.guru99.com/test/newtours/register.php");
	        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	        driver.switchTo().frame("IF1");
	        driver.findElement(By.xpath("(//span[text()='Selenium in Java'])[1]")).click();
	        driver.switchTo().defaultContent();
	        
	       

}
}
