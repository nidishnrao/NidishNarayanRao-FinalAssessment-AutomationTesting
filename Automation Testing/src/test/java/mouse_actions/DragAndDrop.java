package mouse_actions;

//Drag and Drop 

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ASUS\\Downloads\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		   driver.get("http://www.jqueryui.com/");
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		   driver.findElement(By.linkText("Draggable")).click();
		   driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		   Actions mouse=new Actions(driver);
		   mouse.dragAndDropBy(driver.findElement(By.id("draggable")),100,100).build().perform();

	}

}
