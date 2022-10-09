package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dashboard_Recruitment {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul/li[5]/a")).click();
		driver.findElement(By.xpath("//nav/ul/li[2]/a")).click();
		
		driver.findElement(By.xpath("//div[@class=\"oxd-select-text--after\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(text(),'Account Assistant')]")).click();
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	}

}
