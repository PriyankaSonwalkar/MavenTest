package NewGen;

import java.sql.DriverManager;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class Newgenn {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://preprod.nextsequence.io/login");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id=\"mobile\"]")).sendKeys("9999911111");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Nextgen@123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class=\"button \"]")).click();
		Thread.sleep(3000);

		// driver.findElement(By.xpath("(//*[contains(text(), 'Incident
		// Management')])[1]")).click();

		// Thread.sleep(3000);
		// driver.findElement(By.xpath("(//*[@class='MuiTypography-root
		// MuiTypography-body1 MuiListItemText-primary css-yb0lig'])[5]")).click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String t = "Welcome, Infra";
		// getPageSource() to get page source
		if (driver.getPageSource().contains("Welcome, Infra")) {
			System.out.println("Text: " + t + " is present. ");
		} else {
			System.out.println("Text: " + t + " is not present. ");
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//*[normalize-space()=\"Incident Management\"])[1]")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//span[normalize-space()=\"View Cases\"]")).click();
		Thread.sleep(3000);

		// driver.findElement(By.xpath("(//*[contains(text(),'232')])[2]")).click();

		driver.findElement(By.xpath("//div[@title='232']")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[normalize-space()='Add Incident']")).click();
		Thread.sleep(8000);

		driver.findElement(By.xpath("//*[contains(@id,'r1')]")).sendKeys("Rasshad");

		Thread.sleep(8000);

		List<WebElement> autoSuggestionList = driver.findElements(By.xpath(
				"//*[@class='MuiAutocomplete-popper MuiAutocomplete-popperDisablePortal css-ojwayj MuiPopper-root']"));

		// to traverse the list and navigate to required suggestion search results
		for (WebElement autoSuggestion : autoSuggestionList) {
			System.out.println("Auto Suggestion Value : " + autoSuggestion.getText());
			if (autoSuggestion.getText().equalsIgnoreCase("Rasshad Khan")) {
				System.out.println("\nFound required value in auto suggestion list. Clicking on it now\n");
				autoSuggestion.click();
				break;
			}
		}
		Thread.sleep(3000);

		driver.findElement(By.xpath(
				"(//div[@class=\"MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-182didf\"])[1]"))
				.click();
		driver.findElement(By.xpath("//li[normalize-space()='rasshad khan']")).click();

		Thread.sleep(8000);

		driver.findElement(By.xpath(
				"(//div[@class=\"MuiSelect-select MuiSelect-outlined MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputSizeSmall css-182didf\"])[2]"))
				.click();
		driver.findElement(By.xpath("//li[normalize-space()='project -non-p']")).click();
		Thread.sleep(8000);

		driver.findElement(By
				.xpath("//input[@class=\"MuiInputBase-input MuiInput-input MuiInputBase-inputSizeSmall css-2duac4\"]"))
				.sendKeys("Office");
		Thread.sleep(3000);

		// Select se=new
		// Select(driver.findElement(By.xpath("(//div[@role='button'])[17]")));
		// List<WebElement> options =se.getOptions();
		// se.selectByVisibleText("Others");
		//
		// se.selectByVisibleText("Employee Misconduct");

		// Select fruits = new
		// Select(driver.findElement(By.xpath("(//div[@id='demo-multiple-checkbox'])[1]")));
		// fruits.selectByVisibleText("Others");

		// Select objSelect = new
		// Select(driver.findElement(By.id("demo-multiple-checkbox")));
		// List <WebElement> elementCount = objSelect.getOptions();
		// System.out.println(elementCount.size());

		Utility u = new Utility();
		Utility.SelectDropDown("Others", driver);
		WebElement w = driver.findElement(
				By.xpath("//div[@class='MuiBackdrop-root MuiBackdrop-invisible MuiModal-backdrop css-esi9ax']"));
		Utility.performAction(driver, w);

//		w.sendKeys(Keys.ENTER);

		Thread.sleep(3000);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click();", w);

		Utility.SelectDropDown("Fracture", driver);
		w = driver.findElement(
				By.xpath("//div[@class='MuiBackdrop-root MuiBackdrop-invisible MuiModal-backdrop css-esi9ax']"));
		Utility.performAction(driver, w);
		Thread.sleep(3000);

		Utility.SelectDropDown("Leg", driver);
		w = driver.findElement(
				By.xpath("//div[@class='MuiBackdrop-root MuiBackdrop-invisible MuiModal-backdrop css-esi9ax']"));
		Utility.performAction(driver, w);
		Thread.sleep(8000);

		driver.findElement(By.xpath("(//div[@class='jodit-wysiwyg'])[1]"))
				.sendKeys("Incident happend in office, The leg is fractured");

		WebElement radio = driver.findElement(By.xpath("(//input[@id='defaultId'])[7]"));
		radio.click();

		Thread.sleep(5000);

		WebElement radio1 = driver.findElement(By.xpath("(//input[@value='2'])[1]"));
		radio1.click();
		Thread.sleep(5000);

		WebElement radio2 = driver.findElement(By.xpath("(//input[@id='defaultId'])[12]"));
		radio2.click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("(//input[@id='name'])[1]")).sendKeys("Priyanka Sonwalkar");
		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@id='employerName']")).sendKeys("Shadab Khan");
		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@id='jobTitle']")).sendKeys("Software Test Engineer");
		Thread.sleep(5000);

		driver.findElement(By.xpath("//textarea[@id='statement']")).sendKeys("he's sliped from stairs");
		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[normalize-space()='Add Action']")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//div[@class='actionContainer']//div//div[@class='jodit-wysiwyg']"))
				.sendKeys("assdd ddjsdsjd");
		Thread.sleep(5000);

		// driver.findElement(By.xpath("//button[normalize-space()='Add
		// Assignee']")).click();
		Thread.sleep(8000);

		// driver.findElement(By.xpath("//input[@id=':r1j:']")).sendKeys("shadab");

		driver.findElement(By.xpath("(//div[@class='jodit-wysiwyg'])[3]")).sendKeys("abscdfggg ffhsjfh");
		driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();

		

	}

}
