import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f=new File("C:\\Users\\Vicky\\Desktop\\Book1.xlsx");
		boolean b=f.exists();
		System.out.println(b);
		FileInputStream fis=new FileInputStream(f);
		XSSFWorkbook xs=new XSSFWorkbook(fis);
		XSSFSheet sheet=xs.getSheetAt(0);
		String s=sheet.getRow(1).getCell(0).getStringCellValue();
		System.out.println(s);
		
		

	}

}
