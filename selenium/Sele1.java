package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sele1 {
public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Elcot\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
WebDriver driver1 =new ChromeDriver();
//demo site
driver1.get("http://demo.guru99.com/V4/");
driver1.manage().window().maximize();
WebElement element= driver1.findElement(By.linkText("Demo Site"));
String title =element.getAttribute("title");
System.out.println(title);
driver1.close();
}

}
