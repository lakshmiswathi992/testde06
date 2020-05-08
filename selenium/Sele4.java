package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Sele4{
			
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Elcot\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.w3schools.com/sql/sql_syntax.asp");
    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    driver.switchTo().frame("IF1");
    driver.findElement(By.xpath("(//span[text()='Selenium in Java'])[1]")).click();
 


	
     public void readExcel(String filePath,String fileName,String sheetName) throws IOException{
     File file =    new File(filePath+"\\"+fileName);
     FileInputStream inputStream = new FileInputStream(file);
     Workbook testbook = null;
     String fileExtensionName = fileName.substring(fileName.indexOf("."));
     if(fileExtensionName.equals(".xlsx")){   
     testbook = new XSSFWorkbook(inputStream);
     }

     else if(fileExtensionName.equals(".xls")){  
     testworkbook = new HSSFWorkbook(inputStream);
     }
     Sheet test = testworkbook.getSheet(sheetName);
     int rowCount = testSheet.getLastRowNum()-testSheet.getFirstRowNum();
     for (int i = 0; i < rowCount+1; i++) {
     Row row = testSheet.getRow(i); 
     for (int j = 0; j < row.getLastCellNum(); j++) {
     System.out.print(row.getCell(j).getStringCellValue()+"|| ");

     }
     System.out.println();       
     } 

	    }  

     public static void main(String...strings) throws IOException{
     testworkbook objExcelFile = new testworkbook();
     String filePath = System.getProperty("user.dir")+"\\src\\excelExportAndFileIO";
     objExcelFile.readExcel(filePath,"ExportExcel.xlsx","Exceltest");   
	}
	}   
          

	       
	   
	
	    


     


	    	

	  
     

	    
	    