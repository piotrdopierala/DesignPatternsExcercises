package StaticProxy;

import java.awt.geom.Point2D;

public class ImageProxy implements Image {

    private Point2D location;
    private String filename;
    private volatile BitmapImage bitmapImage;

    public ImageProxy(String name) {
        this.filename=name;
    }

    @Override
    public void setLocation(Point2D pt) {
        if (bitmapImage != null) {
            synchronized (this){
                if (bitmapImage != null) {
                    bitmapImage.setLocation(pt);
                }
            }
        }
        this.location=pt;
    }

    @Override
    public Point2D getLocation() {
        if (bitmapImage != null) {
            synchronized (this){
                if (bitmapImage != null) {
                    return bitmapImage.getLocation();
                }
            }
        }
        return location;
    }

    @Override
    public void render() {
        if (bitmapImage == null) {
            synchronized (this){
                if (bitmapImage == null) {
                    bitmapImage = new BitmapImage(this.filename);
                    bitmapImage.setLocation(this.location);
                }
            }
        }
        bitmapImage.render();
    }
}
