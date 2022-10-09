package cucumber;

//Executing Cucumber file for following test cases on Orange HRM application
//1)	HRM Login
//2)	Apply leave
//3)	Searching using Methodoverloading 


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeHRM_Cucumber{
			
	private static WebDriver driver = null;

		@Given("browser is open and application is in login page")
		public void browser_is_open_and_application_is_in_login_page() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			Thread.sleep(2000);
		}

		@When("user enters user name and password")
		public void user_enters_user_name_and_password() throws InterruptedException {
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
		}

		//Test case for HRM Login
		@Then("home page is displayed")
		public void home_page_is_displayed( ) {
		   String act,exp;
		   exp="PIM";
		   act=driver.findElement(By.xpath("//img[@alt='client brand banner']")).getText();
		   SoftAssert check =new SoftAssert();
		   check.assertEquals(act, exp);
		}
	
		//Test case for Apply leave
		@Then("apply leave")
		public void apply_leave( ) throws InterruptedException {
			Thread.sleep(1000);
			driver.manage().window().maximize();
			driver.findElement(By.linkText("Leave")).click();
			driver.findElement(By.xpath("//li//a[@class='oxd-topbar-body-nav-tab-item']")).click();
			driver.findElement(By.xpath("//div[@class='oxd-select-text-input']")).click();
			driver.findElement(By.xpath("//*[contains(text(),'CAN')]")).click();
			driver.findElement(By.xpath("//div[@class='oxd-date-input']//input")).sendKeys("2022-10-04");
			driver.findElement(By.xpath("//textarea")).sendKeys("Not well");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		}
		
		//Test case for Searching
		@Then("search employee")
		public void search_employee( ) throws InterruptedException {
			driver.manage().window().maximize();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Admin")).click();
			search1("Anthony.Nolan",driver);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--ghost']")).click();
			search1("Charlie.Carter","Charlie Carter",driver);	
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--ghost']")).click(); 
			driver.close();
		}  

	  
	  static void search1(String username,WebDriver find) throws InterruptedException {
		  	Thread.sleep(3000);
			find.findElement(By.xpath("//form//input[@class='oxd-input oxd-input--active']")).sendKeys(username);
			find.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(1000);

		}
	  static void search1(String username,String Employeename,WebDriver find) throws InterruptedException {
	  		Thread.sleep(3000);
	  		find.findElement(By.xpath("//form//input[@class='oxd-input oxd-input--active']")).sendKeys(username);
	  		find.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys(Employeename);
	  		find.findElement(By.xpath("//button[@type='submit']")).click();
		}

}