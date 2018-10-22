package DynamicProxy;

import java.awt.geom.Point2D;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.function.BiConsumer;

import static java.lang.System.exit;

public class ImageInvocationHandler implements InvocationHandler {

    private String filename;
    private Point2D location;
    private volatile BitmapImage image;

    private static final Method setLocationMethod;
    private static final Method getLocationMethod;
    private static final Method renderMethod;

    static {
        try {
            setLocationMethod = Image.class.getMethod("setLocation", Point2D.class);
            getLocationMethod = Image.class.getMethod("getLocation", null);
            renderMethod = Image.class.getMethod("render", null);
        } catch (NoSuchMethodException e) {
            System.out.println("test" + e.getMessage());
            throw new NoSuchMethodError(e.getMessage());
            //throw new RuntimeException(); ????? WHY ?????

        }
    }

    public ImageInvocationHandler(String filename) {
        this.filename = filename;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Invoking method:" + method.getName());
        if (method.equals(setLocationMethod)) {
            return handleSetLocation(args);
        } else if (method.equals(getLocationMethod)) {
            return handleGetLocation();
        } else if (method.equals(renderMethod)) {
            return handleRender();
        }


        Image.class.getName();

        return null;
    }

    private Object handleGetLocation() {
        if(image!=null){
            return image.getLocation();
        }
        return location;
    }

    private Object handleSetLocation(Object[] args) {
        this.location= (Point2D) args[0];
        if(image!=null){
            image.setLocation((Point2D) args[0]);
        }
        return null;
    }

    private Object handleRender() {
        if(image==null){
            synchronized (this) {
                if(image==null) {
                    image = new BitmapImage(filename);
                    if(location!=null)
                        image.setLocation(location);
                }
            }
        }
        image.render();
        return null;
    }
}
