package mouse_actions;

//Clicks on Tablets entity in opencart site

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://demo.opencart.com/");
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		   WebElement clicks =  driver.findElement(By.linkText("Tablets"));
		   Actions mouse=new Actions(driver);
		   mouse.click(clicks).perform();
	}

}
