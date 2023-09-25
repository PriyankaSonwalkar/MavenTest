package Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	public static void main(String[] args) throws IOException {
		
		// TODO Auto-generated method stub
		ExcelWrite.setvalues(0, 0, "Piyu");
		ExcelWrite.setvalues(2, 3, "Piyu1");
	//	ExcelWrite.setvalues(1, 2, "Piyu0");
	//	ExcelWrite.setvalues(1, 3, "Piyu2");
	//	ExcelWrite.setvalues(1, 4, "Piyu3");
	}
	public static void setvalues(int row, int column, String values) throws IOException
	{
     File iof=new File("D:\\Priya\\Data.xlsx");		
     FileInputStream fis=new FileInputStream(iof);
     XSSFWorkbook wb=new XSSFWorkbook(fis);
     XSSFSheet sheet1=wb.getSheetAt(0);
     sheet1.getRow(row).createCell(column).setCellValue("privi");
    // sheet1.getRow(row).createCell(column).setCellValue("priya");
    // sheet1.getRow(row).createCell(column).setCellValue("priyanka");
    // sheet1.getRow(row).createCell(column).setCellValue("piyuuu");
     FileOutputStream fout=new FileOutputStream(iof);
     wb.write(fout);
	}
	}

	

