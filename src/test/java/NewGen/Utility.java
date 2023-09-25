package NewGen;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Utility {

	public static void SelectDropDown(String text, WebDriver driver) throws InterruptedException
	{
		//driver.findElement(By.xpath("(//div[@id='demo-multiple-checkbox'])[1]")).click();
		
		driver.findElement(By.xpath("//div[@id='demo-multiple-checkbox']//div[@class='placeholder'][normalize-space()='Please Select']")).click();
		Thread.sleep(2000);
		List<WebElement> list = driver.findElements(By.xpath("(//li[@role='option'])"));
		System.out.println("Number of elements:" +list.size());

	    for (int i=0; i<list.size();i++){
	      System.out.println("Radio button text:" + list.get(i).getAttribute("value"));
	    }		
		
		for (WebElement ele : list)

		{

			// for every elements it will print the name using innerHTML

			System.out.println("Values " + ele.getText());



			// Here we will verify if link (item) is equal to Java Script

			if (ele.getText().contains(text)) {

				// if yes then click on link (Iteam)

				//ele.click();
				ele.sendKeys(Keys.ENTER);



				// break the loop or come out of loop

				break;

			}
			
//			else if (ele.getText().contains(text2)) {
//
//				// if yes then click on link (iteam)
//
//				ele.click();
//
//
//
//				// break the loop or come out of loop
//
//				break;
//
//			}


		}
		
		
}

	public static void performAction(WebDriver driver, WebElement w)
	{
		
		Actions act= new Actions (driver);
		act.moveToElement(w).build().perform();
		act.click().build().perform();
	}
	
}
