package sep19;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FormateCell {

	public static void main(String[] args) throws Throwable{
		FileInputStream fi = new FileInputStream("D:/Sample.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("Emp");
		int rc= ws.getLastRowNum();
		for(int i=1;i<=rc;i++)
		{
			//write as pass into results cell
//			ws.getRow(i).createCell(4).setCellValue("pass");
//			ws.getRow(i).createCell(4).setCellValue("fail");
			ws.getRow(i).createCell(4).setCellValue("Blocked");
			XSSFCellStyle style =wb.createCellStyle();
			XSSFFont font =wb.createFont();
			//colour text with green 
//			font.setColor(IndexedColors.GREEN.getIndex());
//			font.setColor(IndexedColors.RED.getIndex());
			font.setColor(IndexedColors.BLUE.getIndex());
			font.setBold(true);
			style.setFont(font);
			ws.getRow(i).getCell(4).setCellStyle(style);
		}
		fi.close();
		FileOutputStream fo = new FileOutputStream("D:/ResultsFile.xlsx");
		wb.write(fo);
		fo.close();
		wb.close();
	}

}
