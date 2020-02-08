package Utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LearnReadData {

	public String[][] ReadExcel (String ex) throws IOException {
	
		XSSFWorkbook wbook= new XSSFWorkbook("./data/"+ex+".xlsx");
		
		XSSFSheet wsheet = wbook.getSheetAt(0);
		
		int lastRowNum = wsheet.getLastRowNum();
		short lastCellNum = wsheet.getRow(0).getLastCellNum();
		
		
		String[][] data = new String[lastRowNum][lastCellNum];
		
		for (int i = 1; i <= lastRowNum; i++) {
			XSSFRow row = wsheet.getRow(i);
			for (int j = 0; j < lastCellNum; j++) {
				XSSFCell cell = row.getCell(j);
				String value = cell.getStringCellValue();
				System.out.println(value);
				data[i-1][j] = value;
			}
		}
		wbook.close();
		return data;

	}

}
