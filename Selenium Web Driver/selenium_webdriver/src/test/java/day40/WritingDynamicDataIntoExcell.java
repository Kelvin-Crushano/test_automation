package day40;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDynamicDataIntoExcell {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\Test Data\\myfileDynamic.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet = workbook.createSheet("Dynamic_Data");     // creating new sheet
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the total number of rows you want to insert: ");
		int number_of_rows = sc.nextInt();
		
		System.out.println("Enter the total number of cells you want to insert: ");
		int number_of_cells = sc.nextInt();	
		
		
		
		
			
		for(int r=0;r<=number_of_rows; r++) {
			
			XSSFRow row  = sheet.createRow(r);
			
			for(int c=0; c<number_of_cells; c++) {
				
			XSSFCell cell =	row.createCell(c);
			cell.setCellValue(sc.next());
			
			}
		}
		
		workbook.write(file);     // mandatory  (writing)
		
		
		workbook.close();      // mandatory 
		file.close();           // mandatory
		
		
		
		System.out.println("file is created..");
		
		
		

		
	}

}
