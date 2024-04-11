package Workspace;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LeadersTest extends Parameters {
	@BeforeTest
	public void MySetup()  {
		driver.get(URl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		


	}

@Test
public void firstTest ()throws InterruptedException {
	
//	Thread.sleep(4000);
//	WebElement popUpScreen = driver.findElement(By.className("elementor-widget-container"));
//	if (popUpScreen.isDisplayed()) {
//		driver.findElement(By.className("elementor-widget-container")).click();}
	
	
	 WebElement mainProduct = driver.findElement(By.id("main"));
	 int productCount =mainProduct.findElements(By.className("product-inner")).size();
	 int randomClick = rand.nextInt(productCount);
	 System.out.println(randomClick);
	 
		List<WebElement> items = mainProduct.findElements(By.className("product-inner"));

	 WebElement getitem = items.get(randomClick);
			 getitem.click();
}
}