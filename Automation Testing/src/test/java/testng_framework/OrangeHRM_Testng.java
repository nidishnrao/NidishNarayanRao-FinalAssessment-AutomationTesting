package testng_framework;

//Executing Cucumber file for following test cases on Orange HRM application
//1)	HRM Login
//2)	Apply leave
//3)	Searching using Methodoverloading 

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class OrangeHRM_Testng  {
	private static WebDriver driver = null;
	@BeforeMethod
	public void loginpage() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	//Test case for HRM Login
	@Test(priority=0)
	public void login() {
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	driver.close();
	}
	
	//Test case for Apply leave
	@Test(priority=1)
	public void applyLeave() throws InterruptedException {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Leave")).click();
		driver.findElement(By.linkText("Apply")).click();
		driver.findElement(By.xpath("//div[@class='oxd-select-text-input']")).click();
		driver.findElement(By.xpath("//*[contains(text(),'CAN')]")).click();
		driver.findElement(By.xpath("//div[@class='oxd-date-input']//input")).sendKeys("2022-10-25");
		driver.findElement(By.xpath("//textarea")).sendKeys("Not well");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.close();			
	}
	
	//Test case for Searching
	@Test(priority=2)
	public void search_employee( ) throws InterruptedException {
	 	driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Admin")).click();
		search("Anthony.Nolan",driver);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--ghost']")).click(); 
		search("Charlie.Carter","Charlie Carter",driver);	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--ghost']")).click(); 
		Thread.sleep(2000);
		driver.close();
	}

  
   void search(String username,WebDriver find) throws InterruptedException {
		find.findElement(By.xpath("//form//input[@class='oxd-input oxd-input--active']")).sendKeys(username);
		find.findElement(By.xpath("//button[@type='submit']")).click();
	}
   
   void search(String username,String Employeename,WebDriver find) throws InterruptedException {
		find.findElement(By.xpath("//form//input[@class='oxd-input oxd-input--active']")).sendKeys(username);
		find.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys(Employeename);
		find.findElement(By.xpath("//button[@type='submit']")).click();
	}
   
}

