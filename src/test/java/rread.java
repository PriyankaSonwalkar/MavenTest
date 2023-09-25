import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class rread {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		File f=new File("C:\\\\Users\\\\Vicky\\\\Desktop\\\\Book1.xlsx\"");
		boolean b=f.exists();
		System.out.println(b);
		FileInputStream fis=new FileInputStream(f);
		XSSFWorkbook ws=new XSSFWorkbook(fis);
		XSSFSheet ss=ws.getSheetAt(0);
		String s=ss.getRow(1).getCell(0).getStringCellValue();
		System.out.println(s);
				
		
		

	}

}
