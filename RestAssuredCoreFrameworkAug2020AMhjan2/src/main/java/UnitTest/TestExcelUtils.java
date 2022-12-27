package UnitTest;

import java.io.IOException;
import java.util.LinkedHashMap;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;

import Utilities.ExcelUtils;

public class TestExcelUtils {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		ExcelUtils excelUtils = new ExcelUtils("DemoExcel.xlsx");
		LinkedHashMap<String,String> data = excelUtils.getExcelDataAsMap("RahulData");
		System.out.println(data);
	}

}
