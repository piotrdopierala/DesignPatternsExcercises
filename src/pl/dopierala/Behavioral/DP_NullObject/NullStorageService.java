package pl.dopierala.Behavioral.DP_NullObject;

public class NullStorageService extends StorageService {

    @Override
    void save(Report rpt) {
        System.out.println("Null object save method. Doing nothing.");
    }
}
