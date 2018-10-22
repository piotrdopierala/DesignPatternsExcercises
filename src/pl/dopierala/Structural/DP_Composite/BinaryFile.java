public class BinaryFile extends File {

    private String name;
    private String[] permissions;
    private long size;

    BinaryFile(String name, long size) {
        super(name);
        this.size = size;
    }

    @Override
    public void ls() {
        System.out.println("File: " + getName() + " size:" + size);
    }

    @Override
    public String[] getPermissions() {
        return permissions;
    }

    @Override
    public boolean setPermissions(String[] permissions) {
        this.permissions = permissions;
        return true;
    }

    @Override
    public void addFile(File FileToAdd) {
        throw new UnsupportedOperationException("Leaf node doesnt support add operation");
    }


    @Override
    public File[] getFiles() {
        throw new UnsupportedOperationException("Leaf node doesnt support get operation");
    }

    @Override
    public boolean removeFile(File fileToRemove) {
        throw new UnsupportedOperationException("Leaf node doesnt support remove operation");

    }
}
