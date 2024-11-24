package Ulitlites;

import org.apache.poi.ss.usermodel.*;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;

public class ReadXlData {

    @DataProvider(name="sheetdata")

    public String [][] GetData (Method m) throws IOException {

        String excelsheetname = m.getName();
        File f = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\Testdata.xlsx");
        FileInputStream fis = new FileInputStream(f);
        Workbook wb = WorkbookFactory.create(fis);
        Sheet sheetname = wb.getSheet(excelsheetname);

        int totalRow = sheetname.getLastRowNum();
        System.out.println("Total row number "+totalRow);

        Row rowcells= sheetname.getRow(0);
        int totalcolumn = rowcells.getLastCellNum();
        System.out.println("total column is " +totalcolumn);

        String testdata [][]= new String[totalRow][totalcolumn];

        DataFormatter format = new DataFormatter();

        for(int i=1; i<=totalRow; i++){
            for(int j=0; j<totalcolumn;j++){
                testdata[i-1][j]= format.formatCellValue(sheetname.getRow(i).getCell(j));
                System.out.println(testdata[i-1][j]);
            }

        }
        return testdata;


    }





}
