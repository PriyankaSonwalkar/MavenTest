package Priya;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Priyanka {
public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.zappos.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.get(	"https://auth.zappos.com/ap/signin?openid.return_to=https%3A%2F%2Fwww.zappos.com%2Fzap%2FloginComplete&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=zappos_us_desktop_native&openid.oa2.response_type=code&openid.mode=checkid_setup&openid.ns.oa2=http%3A%2F%2Fwww.amazon.com%2Fap%2Fext%2Foauth%2F2&siteState=19bebd18-efd9-4008-9df5-3190e9da86bd%3ACZL4Yiuk8062d8vBn6sspq3HtAhUFssx8jtLkLooS8Y%3D%3Anull&tokenExchangeRedirect=false&openid.oa2.scope=auth_code&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.oa2.client_id=iba%3Aamzn1.application-oa2-client.ce5075dead7c4aa7ae316059988839d5&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.findElement(By.xpath("//input[@id=\"ap_email\"]")).sendKeys("priyankasonwalkar1926@gmail.com");
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Swami@1234");
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id=\"signInSubmit\"]")).click();
		driver.findElement(By.xpath(" //input[@id=\"searchAll\"]")).sendKeys("Tshirts for Men");
		driver.findElement(By.xpath("//button[@class=\"w-z\"]")).click();
		driver.findElement(By.xpath("//*[@data-style-id='5664601']")).click();
		WebElement wb = driver.findElement(By.xpath("//input[@aria-label='Size SM']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", wb);
		driver.findElement(By.xpath("//button[@form=\"buyBoxForm\"]")).click();
		driver.findElement(By.xpath("//button[@class=\"xo-z\"]")).click();
		
		Wait wwait=new FluentWait(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(20)).ignoring(Exception.class);
		
	}

}
