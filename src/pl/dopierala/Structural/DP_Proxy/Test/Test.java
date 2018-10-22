package Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test {
    public static final FileInputStream fs;

    static{
        try {
            fs=new FileInputStream("dane.csv");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException();

            //ale to jest głupie
            // to chyba zapewnia ze runtime exception nie jest handled i java wie ze sie skonczy kod.
        }
    }

    public static void main(String[] args) {



    }
}
