/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocr;

import com.asprise.ocr.Ocr;
import java.io.File;

/**
 *
 * @author amand
 */
public class OCR 

{

    
    public static void main(String[] args) 
    
    {
        //Ocr.main(args);
        // It begins here!!!
        Ocr.setUp(); // one time setup
        
        Ocr ocr = new Ocr(); // create a new OCR engine
        ocr.startEngine("eng", Ocr.SPEED_FASTEST); // English
        
        String s = ocr.recognize(new File[] 
            {new File("test.jpg")}, 
                Ocr.RECOGNIZE_TYPE_ALL, 
                Ocr.OUTPUT_FORMAT_PLAINTEXT);
        
        System.out.println("Result: " + s);
        // ocr more images here ...
        ocr.stopEngine();



    }
    




}
