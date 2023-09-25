package Annotation;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Anno {

	public String baseUrl = "https://www.browserstack.com/";
	String driverPath = "D:\\chromedriver\\chromedriver.exe";
	public WebDriver driver ;
	//System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
	//WebDriver driver=new ChromeDriver();
	
	@Test
	public void launchBrowser() {
		System.out.println("launching Chrome browser");
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.get(baseUrl);
	}
	@BeforeTest
	public void verifyHomepageTitle() {
		String expectedTitle = "Most Reliable App & Cross Browser Testing Platform | BrowserStack";
		System.out.println("Hie");
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);


	}

@BeforeSuite
	public void verifyHomepageTitle1() {
		String expectedTitle = "Most Reliable App & Cross Browser Testing Platform | BrowserStack";
		System.out.println("Bye");
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}

}



