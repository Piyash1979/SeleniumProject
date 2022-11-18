package printAllValuesFromExcelSheet21;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel2 {

	public static void main(String[] args) throws IOException {

		XSSFWorkbook wb=new XSSFWorkbook("./data/ReadData.xlsx");
		XSSFSheet sheet = wb.getSheet("Sheet1");
		
		//Get rowCount
		int rowCount = sheet.getLastRowNum();
		System.out.println(rowCount);
		
		//Get Column count
		//getRow we can enter any value , it will not change any column count 

		short columnCount = sheet.getRow(0).getLastCellNum();
		System.out.println(columnCount);
		
					for (int i = 1; i <= rowCount; i++) {
				//we will add rowCount and columnCount before getRow 

				XSSFRow row = sheet.getRow(i);

				
				for (int j = 0; j < columnCount; j++) {
					XSSFCell cell = row.getCell(j);
					String cellValue = cell.getStringCellValue();
				     System.out.println(cellValue);
			} 
		}
		

				/*XSSFWorkbook wb = new XSSFWorkbook("./data/ReadData.xlsx");
				XSSFSheet sheet = wb.getSheet("Sheet1");
				//get row count 
				int rowCount = sheet.getLastRowNum();
				System.out.println(rowCount);
				//column count
				//getRow we can enter any value , it will not change any column count 
				int columnCount = sheet.getRow(5).getLastCellNum();
				System.out.println(columnCount);
				
				for (int i = 1; i <=rowCount; i++) {
					//we will add rowCount and columnCount before getRow 
					//get row 
					XSSFRow row = sheet.getRow(i);
					
				for (int j = 0; j <columnCount; j++) {
						//get cell
					XSSFCell cell = row.getCell(j);
					String cellValue = cell.getStringCellValue();
					System.out.println(cellValue);
					}*/
					
					
				}
			


	}


