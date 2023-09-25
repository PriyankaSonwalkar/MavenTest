package Priya;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Example extends jhg {
	WebDriver driver;
	public void Lunch()
	{
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		 driver = new ChromeDriver();
	
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
	}
	public void contactinfo()
	{
		driver.findElement(By.xpath("//input[@name=\"firstName\"]")).sendKeys("priyanka");
    }

}
