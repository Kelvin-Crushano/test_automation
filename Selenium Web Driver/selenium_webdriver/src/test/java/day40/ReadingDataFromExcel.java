package day40;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ReadingDataFromExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub\
		
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\Test Data\\Test Data.xlsx"); 
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheet("Sheet1");   // passing name of the sheet
//		XSSFSheet sheet = workbook.getSheetAt(0);    // passing index of the sheet
		
		
		int total_number_of_rows = sheet.getLastRowNum();
//		System.out.println("Total number of rows: " + total_number_of_rows);    // '5' - rows count start from 0 in excel
		
		int total_number_of_cells = sheet.getRow(0).getLastCellNum();
		System.out.println("Total number of cells: " + total_number_of_cells);    // '4' - cell count start from 1 in excel
		
		
		for (int r=0; r<=total_number_of_rows;  r++) {  // As per java rows count starts from 0
			
			XSSFRow current_row = sheet.getRow(r);      // extracting the row, and storing as row object 
			   
		for (int c=0; c<total_number_of_cells; c++) {   // As per Java cell count start from 0 
				
			XSSFCell current_cell = current_row.getCell(c);  // extracting the cell from row and, storing as cell object
			   	  
				System.out.print(current_cell.toString() + "\t");
			
			}
		
			System.out.println();
		}
		
		workbook.close();
		file.close();
		
		
		
		
		
		

	}

}




