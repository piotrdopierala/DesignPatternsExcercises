package DynamicProxy;

import java.awt.geom.Point2D;

public class Client {
    public static void main(String[] args) {
        Image img = ImageFactory.getImage("Labski.bmp");
        img.setLocation(new Point2D.Double(-10.0,0.0));
        System.out.println("Location of image is:"+img.getLocation());
        img.render();
    }
}
