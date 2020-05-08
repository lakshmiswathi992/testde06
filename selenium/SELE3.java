package selenium;

import java.io.File;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.ss.usermodel.Workbook;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SELE3{

    public void readExcel(String filePath,String fileName,String sheetName) throws IOException{

    File file =    new File(filePath+"\\"+fileName);

    FileInputStream inputStream = new FileInputStream(file);


    String fileExtensionName = fileName.substring(fileName.indexOf("."));


    if(fileExtensionName.equals(".xlsx"))

    }
}

   


    

    