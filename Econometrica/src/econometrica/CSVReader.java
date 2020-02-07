/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package econometrica;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.net.URL;
        
/**
 *
 * @author mkyong
 */
public class CSVReader {

    
    @SuppressWarnings("CallToPrintStackTrace")
    public ArrayList<String[]> getCountries(){
        Boolean notFirst = false;
        BufferedReader br = null;
        String line="";
        ArrayList<String[]> countries= new ArrayList();
        final String csvFile = "build/classes/iso-countries.csv";
        final String cvsSplitBy = ";";

        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                if (notFirst){
                // use cvsSplitBy as separator
                 String[] country = line.split(cvsSplitBy);
                 countries.add(country);
                }
                else {
                    notFirst=true;
                }
            }
            return countries;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }
}
