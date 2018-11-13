package pl.dopierala.Behavioral.DP_NullObject;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class StorageService {

    void save(Report rpt){
        System.out.println("Writing report out");
        try (PrintWriter writer = new PrintWriter(rpt.getName()+".txt")){
            writer.println(rpt.getName());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
