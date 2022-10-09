package alert_handling;

//Executing Simple Alert on HDFC Login page

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class SimpleAlert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://netbanking.hdfcbank.com/netbanking/");
		  driver.manage().window().maximize();
		  driver.switchTo().frame("login_page");
		  driver.findElement(By.xpath("//a[contains(text(),'CONTINUE')]")).click();
		  Alert HdfcAlert=driver.switchTo().alert();
		  String actualResult=HdfcAlert.getText();
		  Thread.sleep(1000);
		  HdfcAlert.accept();
		  driver.switchTo().defaultContent();
		  System.out.println(actualResult);
		  String expectedResult="Customer ID  cannot be left blank.";
		  SoftAssert softAssert = new SoftAssert();
		  softAssert.assertEquals(actualResult, expectedResult);
		  System.out.println("After assertion");
	
	}

}
