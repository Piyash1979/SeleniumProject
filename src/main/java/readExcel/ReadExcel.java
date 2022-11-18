package readExcel;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	private static final String[][] data = null;
	
	public String[][] readExcel() throws IOException  {


	//Open/Enter into the workbook
			XSSFWorkbook wb = new XSSFWorkbook("./data/ReadData.xlsx");

					//Get Sheet
					//XSSFSheet sheet = wb.getSheet("MM");
					XSSFSheet sheet = wb.getSheetAt(0);

					//Get row count
					int rowCount = sheet.getLastRowNum();
					System.out.println(rowCount);
					
					//Get column count
					int columnCount = sheet.getRow(0).getLastCellNum();
					System.out.println(columnCount);
					
					//String [][] data = new String[2][3];
					
					String [][] data = new String[rowCount][columnCount];

					//Open 'for loop' for rows
					for (int i = 1; i <= rowCount; i++) {
						
						//Get row
						XSSFRow row = sheet.getRow(i);

						//Open 'for loop' for columns
						for (int j = 0; j <columnCount; j++) {

							//Get column
							XSSFCell cell = row.getCell(j);
							
							// Actions -> Read value
							String value = cell.getStringCellValue();
							System.out.println(value);
							
							//data [0][0] = "TCS";
							
						//data [i][j] = value; [note: i=1, i-1=1-1=0]
							
							data [i-1][j] = value;
							
						}//ends columns for loop
					}//ends rows for loop

					
					return data;

	/*//public static void main(String[] args) throws IOException {
		// Open /Enter the workbook
		XSSFWorkbook wb=new XSSFWorkbook("./data/ReadData.xlsx");
		XSSFSheet sheet = wb.getSheet("Sheet1");
		XSSFRow row = sheet.getRow(4);
		XSSFCell cell = row.getCell(3);
		String cellValue = cell.getStringCellValue();
		System.out.println(cellValue);*/
		
		/*XSSFWorkbook wb=new XSSFWorkbook("./data/ReadData.xlsx");
		
		
		//Get sheet
		 XSSFSheet sheet = wb.getSheet("Sheet1");
		 
		//Get row count
		  int rowCount = sheet.getLastRowNum();
		  System.out.println(rowCount);
		  
		  //Get column count
		  short columnCount = sheet.getRow(0).getLastCellNum();
		  System.out.println(columnCount);
		
		 
		 //Get row
		 XSSFRow row = sheet.getRow(3);
		 
		 //Get column
		 XSSFCell cell = row.getCell(1);
		
		
		//Action read/print particular CellValue
		 String cellVallue = cell.getStringCellValue();
		 System.out.println(cellVallue);*/
	

	}

	
}
