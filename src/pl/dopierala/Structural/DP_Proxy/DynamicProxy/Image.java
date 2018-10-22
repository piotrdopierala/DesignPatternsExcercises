package DynamicProxy;

import java.awt.geom.Point2D;

public interface Image {

    public void setLocation(Point2D pt);
    public Point2D getLocation();
    public void render();

}
