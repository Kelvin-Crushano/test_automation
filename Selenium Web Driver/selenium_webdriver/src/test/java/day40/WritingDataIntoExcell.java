package day40;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataIntoExcell {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\Test Data\\myfile.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet = workbook.createSheet("Data");     // creating new sheet
		
		XSSFRow row1 = sheet.createRow(0);            //creating row
		
		row1.createCell(0).setCellValue("Name"); 
		row1.createCell(1).setCellValue("Age");
		row1.createCell(2).setCellValue("Place");
		
		XSSFRow row2 = sheet.createRow(1);
		row2.createCell(0).setCellValue("Kelvin");
		row2.createCell(1).setCellValue("31");
		row2.createCell(2).setCellValue("Kandy");
		
		
		workbook.write(file);     // writing
		
		
		workbook.close();      // mandatory 
		file.close();           // mandatory
		
		System.out.println("file is created..");
		
		
		
		
		
       
	}

}
