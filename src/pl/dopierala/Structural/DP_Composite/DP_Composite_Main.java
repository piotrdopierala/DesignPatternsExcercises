package pl.dopierala.Structural.DP_Composite;

public class DP_Composite_Main {
    public static void main(String[] args) {
        File root1 = createTreeOne();
        root1.ls();
        System.out.println("-----------------------------------------");
        File root2 = createTreeTwo();
        root2.ls();

    }

    private static File createTreeOne(){
        File file1 = new BinaryFile("File1",1000);
        File dir1 = new Directory("dir1");
        dir1.addFile(file1);

        File file2 = new BinaryFile("File2",2000);
        File file3 = new BinaryFile("File3",150);
        File dir2 = new Directory("dir2");
        dir2.addFile(file2);
        dir2.addFile(file3);
        dir2.addFile(dir1);
        return dir2;
    }

    private static File createTreeTwo(){
        return new BinaryFile("Another file",200);
    }

}
