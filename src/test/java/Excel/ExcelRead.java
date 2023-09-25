package Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	File Input=new File("D:\\\\Priya\\\\Data.xlsx");
	FileInputStream FIO=new FileInputStream(Input);
	XSSFWorkbook WB=new XSSFWorkbook(FIO);
    XSSFSheet sheet=WB.getSheet("priyankVi");
    XSSFRow row1=sheet.getRow(0);
    XSSFCell cell=row1.getCell(1);
    String a=cell.getStringCellValue();
    System.out.println(a);
	
	}
}
	

