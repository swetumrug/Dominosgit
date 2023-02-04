/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dominospageobject;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author swetu
 */
public class FileUtil {
    public static Signin readForm() throws Exception{
        Signin signin = null;
         FileInputStream inputStream = new FileInputStream(new File("c:\\data\\Signin.xlsx"));
         Workbook workbook = new XSSFWorkbook(inputStream);
         Sheet firstSheet = workbook.getSheetAt(0);
         Row r =  firstSheet.getRow(1);
         Cell c = r.getCell(0); //username value
            String username = c.getStringCellValue();
            System.out.println("username"+ username);
        
            c = r.getCell(1); //password value
            String password = c.getStringCellValue();
            System.out.println("password"+ password);
        
        signin = new Signin(username,password);
        
        System.out.println(signin);
        inputStream.close();
        return signin;
        
        
    }
}

