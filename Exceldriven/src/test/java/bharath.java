import java.io.FileInputStream;

import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadrivern {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("C:\\Users\\BHARATH\\Desktop\\rahul.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		int no_of_sheets = workbook.getNumberOfSheets();
		for (int i = 0; i < no_of_sheets; i++) {
			if (workbook.getSheetName(i).equalsIgnoreCase("testdata")) {
				XSSFSheet sheet = workbook.getSheetAt(i);
				Iterator<Row> rows = sheet.iterator();
				Row firstrow = rows.next();
				Iterator<Cell> cell = firstrow.cellIterator();
				int colindex = 0;
				int cnt = 0;
				while (cell.hasNext()) {
					Cell value = cell.next();
					if (value.getStringCellValue().equalsIgnoreCase("Testcases")) {
						colindex = cnt;
						break;
					}
					cnt++;
				}
				System.out.println(colindex);

			}

		}
	}

}
