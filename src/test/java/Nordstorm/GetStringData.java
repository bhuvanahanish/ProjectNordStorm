package Nordstorm;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class GetStringData {
	public static void printPdtNamePrice(String pdtName, String pdtPrice) throws IOException{
		File loc = new File("C:\\Users\\GAWTHAM HANISH\\Downloads\\eclipse-committers-oxygen-3a-win32-x86_64\\eclipse\\bhuvanaselenium\\MyMaven\\src\\test\\java\\testdatas\\Stringdata.xlsx");
		Workbook w = new XSSFWorkbook();
		Sheet s = w.createSheet("ProductDetails");
		Row r = s.createRow(0);
		Cell c =  r.createCell(0);
		c.setCellValue("Product Name");
		
		Cell c2 =  r.createCell(1);
		c2.setCellValue("Product Price");
		
		
		Row r1 = s.createRow(1);
		
		Cell c3 = r1.createCell(0);
		c3.setCellValue(pdtName);
		
		Cell c4 = r1.createCell(1);
		c4.setCellValue(pdtPrice);
		FileOutputStream o = new FileOutputStream(loc);
		w.write(o);

	}
}

		

		