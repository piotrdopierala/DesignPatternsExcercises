//component base class for composite pattern
//defines operations applicable both leaf&composite

public abstract class File {

    private String name;

    public abstract String[] getPermissions();
    public abstract boolean setPermissions(String[] permissions);
    public abstract void addFile(File FileToAdd);
    public abstract File[] getFiles();
    public abstract boolean removeFile(File fileToRemove);
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }

    File(String name){
        this.name=name;
    }

    public abstract void ls();
}
