package test.Data;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import test.Data.IO;

public class DataProviderClass {




    /**
     * This method will fetch data from csv file and put into data provider .
     * @return
     * @throws IOException
     */
    @DataProvider(name="dataset")
    public static Object[][] getdata() throws IOException{
        Object [][] ob= new IO().getdataset("./d  ataset.csv");
        return ob;
    }

}
