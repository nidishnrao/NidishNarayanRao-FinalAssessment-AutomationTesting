package alert_handling;

//Executing Prompt Alert 

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class PromptAlert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://selenium08.blogspot.com/2019/07/alert-test.html");
		  driver.findElement(By.xpath("//button[@id=\"prompt\"]")).click();	
		  Alert HdfcAlert=driver.switchTo().alert();
		  String actualResult=HdfcAlert.getText();
		  HdfcAlert.sendKeys("Nidish");
		  HdfcAlert.accept();
		  driver.switchTo().defaultContent();
		  System.out.println(actualResult);
		  String expectedResult="Hello nidish! How are you today?";
		  SoftAssert softAssert = new SoftAssert();
		  softAssert.assertEquals(actualResult, expectedResult);
		  System.out.println("After assertion");
		  System.out.println( driver.findElement(By.xpath("//div[@id=\"prompt_demo\"]")).getText()	);

	}

}
