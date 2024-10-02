package Sriprojectnew.Srimavenproject;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Testcomponents.Dependency;

public class Second extends Dependency{
	
	  @Test 
    public void got() throws InterruptedException
  { 
		  driver.findElement(By.xpath("//a[text()='projects']")).click(); 
		Thread.sleep(3000);
	    String act=driver.findElement(By.xpath("(//h1)[1]")).getText();
	    Assert.assertEquals(act, "Project Done in Tata Consultancy Services Limited"); 
	    System.out.println("Hi sriram");
	   
  }
}
