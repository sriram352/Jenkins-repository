package Testcomponents;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Dependency {  
	public static WebDriver driver;
	@BeforeMethod
	public void RepeatedCode() {
	driver=new ChromeDriver();
	driver.get("https://srirammyport.web.app");
	driver.manage().window().maximize(); 
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
}
