package Sriprojectnew.Srimavenproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Testcomponents.Dependency;

public class First extends Dependency {
	@Test
	public void sriram() throws InterruptedException {
	List<WebElement> links=driver.findElements(By.xpath("//ul[@class=\"aos-init aos-animate\"] //li/a/following-sibling::a"));
	for(int i=0;i<links.size();i++) {
		links.get(i).click();
		Thread.sleep(3000);
		JavascriptExecutor a=(JavascriptExecutor)driver;
		a.executeScript("window.scrollBy(0,-7000)");
	    Thread.sleep(3000);
	}
	} 

     @Test 
      public void got()
    {
	     driver.findElement(By.xpath("//a[text()='projects']")).click(); 
	     String act=driver.getCurrentUrl(); 
	     Assert.assertEquals(act, "https://srirammyport.web.app/projects.html");
    }
}
