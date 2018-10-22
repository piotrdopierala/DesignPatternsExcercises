package StaticProxy;

import java.awt.geom.Point2D;

public class BitmapImage implements Image {

    private Point2D location;
    private String name;

    public BitmapImage(String filename) {
        System.out.println("Loading from disk:"+filename);
        name=filename;
    }

    @Override
    public void setLocation(Point2D pt) {
        this.location=pt;
    }

    @Override
    public Point2D getLocation() {
        return location;
    }

    @Override
    public void render() {
        System.out.println("RENDERING IMAGE AT LOCATION "+location.toString());
        System.out.println("Imagine that beautiful mountains view...");
    }
}
