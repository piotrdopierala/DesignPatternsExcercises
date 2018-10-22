import java.util.ArrayList;
import java.util.List;

//composite class in composite design pattern
public class Directory extends File {

    private String name;
    private String[] permissions;
    private List<File> files = new ArrayList<>();

    Directory(String name) {
        super(name);
    }

    @Override
    public void ls() {
        System.out.println("Directory: "+getName());
        files.forEach(File::ls);
    }

    @Override
    public String[] getPermissions() {
        return permissions;
    }

    @Override
    public boolean setPermissions(String[] permissions) {
        this.permissions=permissions;
        return true;
    }

    @Override
    public void addFile(File FileToAdd) {
        files.add(FileToAdd);
    }

    @Override
    public File[] getFiles() {
        return files.toArray(new File[0]);
    }

    @Override
    public boolean removeFile(File fileToRemove) {
        return files.remove(fileToRemove);
    }

    public void directorySpecificFunction(){

    }
}
