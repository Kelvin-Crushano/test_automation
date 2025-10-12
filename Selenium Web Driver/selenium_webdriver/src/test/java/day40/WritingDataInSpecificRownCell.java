package day40;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataInSpecificRownCell {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\Test Data\\myfile_specificrowncell.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();  
		
		XSSFSheet sheet = workbook.createSheet("Dynamic_Data");     // creating new sheet
		
		
		XSSFRow row = sheet.createRow(3);
		row.createCell(2).setCellValue("kkk");
		
		
		workbook.write(file);     // mandatory  (writing)
		
		
		workbook.close();      // mandatory 
		file.close();           // mandatory
		
		
		
		System.out.println("file is created..");
		
		
		
		
		
		
		
		

	}

}
