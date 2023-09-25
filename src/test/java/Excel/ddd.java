package Excel;

import java.io.File;
import java.io.IOException;

import javax.print.attribute.SetOfIntegerSyntax;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;


public class ddd {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		int a=5,b=2;
//		a=a+b;
//		b=a-b;
//		a=a-b;
//		System.out.println("addition a=" +a);
//		System.out.println("add b=" +b);
		
		ChromeDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
        File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(f, new File("MavenTest/riy.png")); 
		

	}

}
