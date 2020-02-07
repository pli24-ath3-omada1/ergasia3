/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package econometrica;

import java.util.Arrays;
import java.util.ArrayList;
/**
 *
 * @author stamn
 */
public class Econometrica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MainFrame MF = new MainFrame();
        CSVReader CR = new CSVReader();
        MF.setVisible(true);
        ArrayList<String[]> s = CR.getCountries();
        MF.setCountries(s);
        /* To get an idea what s stores, uncomment the following */
        /*
        for (int i=0;i< s.size();i++)
            System.out.println(Arrays.toString(s.get(i)));
        /**/
        
    }
    
}
