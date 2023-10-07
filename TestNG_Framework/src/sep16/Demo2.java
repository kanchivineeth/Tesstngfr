package sep16;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Demo2 {

	public static void main(String[] args) throws Throwable {
		FileInputStream fi = new FileInputStream("D:/Sample.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet ws = wb.getSheet("Emp");
		int rc = ws.getLastRowNum();
		System.out.println(rc);
		//print any row first cell data
		String fname =ws.getRow(7).getCell(0).getStringCellValue();
		String mname = ws.getRow(1).getCell(1).getStringCellValue();
		String lname = ws.getRow(4).getCell(2).getStringCellValue();
		int eid =(int) ws.getRow(3).getCell(3).getNumericCellValue();
		System.out.println(fname+"   "+mname+"    "+lname+"    "+eid);		
		fi.close();
		wb.close();

	}

}
