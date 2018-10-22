package StaticProxy;

import java.awt.geom.Point2D;

public class DP_Proxy_Main {
    public static void main(String[] args) {
        Image img = ImageFactory.getImage("LabskiSzczyt.bmp");
        //StaticProxy.Image img = new StaticProxy.BitmapImage("Test.bmp");

        img.setLocation(new Point2D.Double(45.0,75.0));

        System.out.println("StaticProxy.Image location is:"+img.getLocation());
        System.out.println("App is doing its usual app-stuff...");

        img.render();

    }
}
