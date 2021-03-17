package week5.testNG;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WorkingwithExcel {

	public  String[][] excelRead() throws IOException {
		
		XSSFWorkbook a=new XSSFWorkbook("./Excel/Data.xlsx");
		
XSSFSheet b = a.getSheet("Sheet1");

int rowcount = b.getLastRowNum();

int cellcount=b.getRow(0).getLastCellNum();

String [][] data=new String[rowcount][cellcount];

System.out.println("Excel ddata readed");

a.close();

return data;




	}

}
