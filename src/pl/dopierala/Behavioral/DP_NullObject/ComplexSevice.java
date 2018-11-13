package pl.dopierala.Behavioral.DP_NullObject;


public class ComplexSevice {
    private StorageService storage;
    private String reportName;

    public ComplexSevice(StorageService storage) {
        this.storage = storage;
        reportName = "A complex report";
    }

    public ComplexSevice(String reportName,StorageService storage) {
        this.storage = storage;
        this.reportName = reportName;
    }

    public void generateReport(){
        System.out.println("Starting a complex report build!");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Done with report..");
        storage.save(new Report(reportName));
    }
}
