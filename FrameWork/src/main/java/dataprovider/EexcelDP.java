package dataprovider;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class EexcelDP{

	public static String[][] getSheet(String dataSheetName) {

		String[][] data = null;

		try {
			FileInputStream sheet1 = new FileInputStream(new File("./data/"+dataSheetName+".xlsx"));
			XSSFWorkbook workbook = new XSSFWorkbook(sheet1);
			XSSFSheet sheet = workbook.getSheetAt(0);				
			int rowCount = sheet.getLastRowNum();			
			int columnCount = sheet.getRow(0).getLastCellNum();
			data = new String[rowCount][columnCount];		
			for(int i=1; i <rowCount+1; i++){
				try {
					XSSFRow row = sheet.getRow(i);
					for(int j=0; j <columnCount; j++){ 
						try {
							String cellValue = "";
							int cellType = row.getCell(j).getCellType();
							if(cellType==0){
								try{
									cellValue = row.getCell(j).getStringCellValue();
									System.out.println(cellValue);
								}catch(NullPointerException e){

								}
							}
							if(cellType==1){
								try{
									cellValue = row.getCell(j).getStringCellValue();
									System.out.println(cellValue);
								}catch(NullPointerException e){

								}
							}
							data[i-1][j]  = cellValue; 
						} catch (Exception e) {
 							e.printStackTrace();
						}				
					}

				} catch (Exception e) {
 					e.printStackTrace();
				}
			}
			sheet1.close();
			workbook.close();
		} catch (Exception e) {
 			e.printStackTrace();
		}
		return data;
		
	}


}
