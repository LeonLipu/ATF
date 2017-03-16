package test.Data;

import org.testng.annotations.DataProvider;
import test.Data.IO;

import java.io.IOException;

/**
 * Created by brahmanandakar on 11/03/17.
 */
public class TestNGDataProvider {

    /**
     * This method will fetch data from csv file and put into data provider .
     * @return
     * @throws IOException
     */
    @DataProvider(name="dataset")
    public static Object[][] getdata() throws IOException{
        Object [][] ob= new IO().getdataset("./dataset.csv");
        return ob;
    }
}
