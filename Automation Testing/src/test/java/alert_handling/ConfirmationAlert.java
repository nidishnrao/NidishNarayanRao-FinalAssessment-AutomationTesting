package alert_handling;

//Executing Confirmation Alert 

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class ConfirmationAlert {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://selenium08.blogspot.com/2019/07/alert-test.html");
		  driver.findElement(By.xpath("//button[@id=\"confirm\"]")).click();	
		  Alert HdfcAlert=driver.switchTo().alert();
		  String actualResult=HdfcAlert.getText();
		  HdfcAlert.accept();
		  driver.switchTo().defaultContent();
		  System.out.println(actualResult);
		  String expectedResult="You Accepted Alert!";
		  SoftAssert softAssert = new SoftAssert();
		  softAssert.assertEquals(actualResult, expectedResult);
		  System.out.println("After assertion");
		  System.out.println( driver.findElement(By.xpath("//div[@id=\"demo\"]")).getText()	);

	}

}
