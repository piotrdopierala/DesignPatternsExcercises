package pl.dopierala.Creational.DP_ObjectPool;

import javafx.geometry.Point2D;


//Represents our abstract reusable
public interface Image extends Poolable{

    void draw();

    Point2D getLocation();

    void setLocation(Point2D location);



}
