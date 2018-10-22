package StaticProxy;

public class ImageFactory {
    public static Image getImage(String fileName){
        return new ImageProxy(fileName);
    }
}
